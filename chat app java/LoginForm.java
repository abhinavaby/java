import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginForm extends JFrame {
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin, btnRegister;

    public LoginForm() {
        setTitle("ChatApp - Login");
        setSize(320, 230);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblUser = new JLabel("Username:");
        lblUser.setBounds(30, 30, 80, 25);
        add(lblUser);

        txtUsername = new JTextField();
        txtUsername.setBounds(120, 30, 150, 25);
        add(txtUsername);

        JLabel lblPass = new JLabel("Password:");
        lblPass.setBounds(30, 70, 80, 25);
        add(lblPass);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(120, 70, 150, 25);
        add(txtPassword);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(30, 130, 110, 30);
        add(btnLogin);

        btnRegister = new JButton("Sign Up");
        btnRegister.setBounds(150, 130, 120, 30);
        add(btnRegister);

        btnLogin.addActionListener(e -> loginUser());

        btnRegister.addActionListener(e -> {
            dispose();
            new RegistrationForm().setVisible(true);
        });
    }

    private void loginUser() {
        String username = txtUsername.getText().trim();
        String password = new String(txtPassword.getPassword()).trim();

        String query = "SELECT * FROM users WHERE username = ? AND password = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                dispose();
                // Pass the logged-in username to the ChatForm
                new ChatForm(username).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Connection Error: " + ex.getMessage());
        }
    }
}