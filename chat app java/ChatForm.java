import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ChatForm extends JFrame {
    private String username;
    private JTextArea chatArea;
    private JTextField txtMessage;
    private JButton btnSend;
    private JButton btnLogout;
    private Timer timer;       // Handle to background thread
    private int lastMessageId = 0;

    public ChatForm(String username) {
        this.username = username;

        setTitle("Chat Room");
        setSize(450, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // --- TOP PANEL (Welcome Label & Fixed Logout Button) ---
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel lblWelcome = new JLabel("Logged in as: " + username);
        lblWelcome.setFont(new Font("Arial", Font.BOLD, 14));

        btnLogout = new JButton("Logout");
        btnLogout.setPreferredSize(new Dimension(90, 30));
        btnLogout.setOpaque(true);
        btnLogout.setBorderPainted(false);
        btnLogout.setBackground(new Color(220, 53, 69)); // Crimson Red
        btnLogout.setForeground(Color.WHITE);

        // FlowLayout container prevents the button from stretching awkwardly on Mac
        JPanel buttonContainer = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        buttonContainer.add(btnLogout);

        topPanel.add(lblWelcome, BorderLayout.WEST);
        topPanel.add(buttonContainer, BorderLayout.EAST);
        add(topPanel, BorderLayout.NORTH);

        // --- CENTER PANEL (Chat History Area) ---
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 14));
        chatArea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        JScrollPane scrollPane = new JScrollPane(chatArea);
        add(scrollPane, BorderLayout.CENTER);

        // --- BOTTOM PANEL (Message Input Box & Send Button) ---
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        txtMessage = new JTextField();
        txtMessage.setFont(new Font("Arial", Font.PLAIN, 14));

        btnSend = new JButton("Send");
        btnSend.setPreferredSize(new Dimension(80, 30));

        bottomPanel.add(txtMessage, BorderLayout.CENTER);
        bottomPanel.add(btnSend, BorderLayout.EAST);
        add(bottomPanel, BorderLayout.SOUTH);

        // --- ACTION LISTENERS ---
        btnSend.addActionListener(e -> sendMessage());
        txtMessage.addActionListener(e -> sendMessage()); // Sends when pressing 'Enter'
        btnLogout.addActionListener(e -> handleLogout());

        // Start real-time background message sync (runs every 1 second)
        timer = new Timer(1000, e -> loadNewMessages());
        timer.start();
    }

    private void handleLogout() {
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to logout?",
                "Logout",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            timer.stop(); // Stops the background task from running in system memory
            dispose();    // Closes the chat room window
            new LoginForm().setVisible(true); // Returns to login screen
        }
    }

    private void sendMessage() {
        String msg = txtMessage.getText().trim();
        if (msg.isEmpty()) return;

        // --- ADMIN CLEAR COMMAND CHECK ---
        if (msg.startsWith("/clear ")) {
            String password = msg.substring(7).trim(); // Extract everything after "/clear "

            if (password.equals("1234")) {
                clearAllMessages();
                txtMessage.setText(""); // Clear the input box
                return; // Stop execution so it doesn't get saved as a standard message
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect admin password!", "Access Denied", JOptionPane.ERROR_MESSAGE);
                txtMessage.setText("");
                return;
            }
        }

        // --- NORMAL CONVERSATION FLOW ---
        String query = "INSERT INTO messages (username, message) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, username);
            stmt.setString(2, msg);
            stmt.executeUpdate();
            txtMessage.setText(""); // Clears input box
            loadNewMessages();      // Forces instantaneous load for the sender
        } catch (Exception ex) {
            System.out.println("Error sending message: " + ex.getMessage());
        }
    }

    private void clearAllMessages() {
        // SQL statement to wipe out all message rows safely
        String query = "TRUNCATE TABLE messages";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.executeUpdate();

            // Wipe local chat UI display completely
            chatArea.setText("");
            lastMessageId = 0; // Reset tracking pointer back to zero

            JOptionPane.showMessageDialog(this, "Chat history has been permanently cleared!", "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            System.out.println("Error clearing messages: " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Database error while clearing history.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadNewMessages() {
        String query = "SELECT id, username, message FROM messages WHERE id > ? ORDER BY id ASC";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, lastMessageId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String user = rs.getString("username");
                String msg = rs.getString("message");

                chatArea.append(user + ": " + msg + "\n");
                lastMessageId = id; // Advances pointer to avoid duplicate reads

                // Keep the chat view focused on the latest message
                chatArea.setCaretPosition(chatArea.getDocument().getLength());
            }
        } catch (Exception ex) {
            System.out.println("Error loading messages: " + ex.getMessage());
        }
    }
}