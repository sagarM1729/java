import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginApp extends JFrame implements ActionListener {
    private JLabel userLabel, passwordLabel;
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel messageLabel;

    private String username = "myusername"; // Predefined username
    private String password = "mypassword"; // Predefined password

    public LoginApp() {
        setTitle("Login Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2));

        userLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        userTextField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");
        messageLabel = new JLabel();

        add(userLabel);
        add(userTextField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel());
        add(loginButton);
        add(new JLabel());
        add(messageLabel);

        loginButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String enteredUsername = userTextField.getText();
        String enteredPassword = new String(passwordField.getPassword());

        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            messageLabel.setText("Login successful!");
            // Display user information or perform further actions
        } else {
            messageLabel.setText("Wrong username or password");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                LoginApp loginApp = new LoginApp();
                loginApp.setVisible(true);
            }
        });
    }
}
