package src.controller;

import src.model.UserModel;
import src.view.LoginView;

public class LoginController {

	private UserModel model;
	private LoginView view;

	public LoginController(UserModel model, LoginView view) {
		this.model = model;
		this.view = view;

		// Event listener: View → Controller
		view.loginButton.addActionListener(e -> handleLogin());
	}

	private void handleLogin() {
		String user = view.usernameField.getText();
		String pass = new String(view.passwordField.getPassword());

		boolean ok = model.authenticate(user, pass);

		if (ok) {
			view.statusLabel.setText("Login berjaya!");
		} else {
			view.statusLabel.setText("Username atau password salah.");
		}
	}
}
