package src.view;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {

	public JTextField usernameField = new JTextField();
	public JPasswordField passwordField = new JPasswordField();
	public JButton loginButton = new JButton("Login");
	public JLabel statusLabel = new JLabel("");

	public LoginView() {
		setTitle("Login MVC");
		setSize(350, 200);
		setLayout(new GridLayout(4, 2, 10, 10));
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(new JLabel("Username:"));
		add(usernameField);

		add(new JLabel("Password:"));
		add(passwordField);

		add(loginButton);
		add(statusLabel);

		setVisible(true);
	}
}
