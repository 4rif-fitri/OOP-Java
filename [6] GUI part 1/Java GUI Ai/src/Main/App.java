package src.Main;
import  src.model.UserModel;
import  src.view.LoginView;
import  src.controller.LoginController;

public class App {
	public static void main(String[] idk) {
		UserModel model = new UserModel();
		LoginView view = new LoginView();
		LoginController controller = new LoginController(model, view);
		
	}
}
