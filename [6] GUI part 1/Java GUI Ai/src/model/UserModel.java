package src.model;

public class UserModel {

	public boolean authenticate(String username, String password) {
		// Demo sahaja (jangan buat dalam production!)
		return username.equals("admin") && password.equals("1234");
	}
}
