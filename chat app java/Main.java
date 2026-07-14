import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Launch application safely on the Swing Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            new LoginForm().setVisible(true);
        });
    }
}