import javax.swing.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegistrationForm extends JFrame {
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnRegister, btnBackToLogin;

    public RegistrationForm() {
        setTitle("ChatApp - Register");
        setSize(320, 250);
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

        btnRegister = new JButton("Register");
        btnRegister.setBounds(30, 130, 110, 30);
        add(btnRegister);

        btnBackToLogin = new JButton("Back to Login");
        btnBackToLogin.setBounds(150, 130, 120, 30);
        add(btnBackToLogin);

        btnRegister.addActionListener(e -> registerUser());

        btnBackToLogin.addActionListener(e -> {
            dispose();
            new LoginForm().setVisible(true);
        });
    }

    private void registerUser() {
        String username = txtUsername.getText().trim();
        String password = new String(txtPassword.getPassword()).trim();

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty!");
            return;
        }

        String query = "INSERT INTO users (username, password) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Registration Successful! Please login.");
            dispose();
            new LoginForm().setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Username might already exist or DB error.");
        }
    }
}