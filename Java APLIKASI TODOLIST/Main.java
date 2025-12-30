import java.util.Scanner;

class Main {

	public static String[] model = new String[10];

	public static void main(String[] args) {
		// testShow();
		// testAddToDo();
		// testRemove();
		// testinput();
		// testView();
		viewShowToDoList();
	}

	public static void showToDoList() {
		for (var i = 0; i < model.length; i++) {
			String todo = model[i];
			int no = i + 1;

			if (todo != null) {
				System.out.println(no + "." + todo);
			}
		}
	}

	public static void testShow() { // test unit
		model[0] = "lorem";
		model[1] = "lorem";
		model[2] = "lorem";
		showToDoList();
	}

	public static void addToDoList(String todo) {
		var isFull = true;

		for (int i = 0; i < model.length; i++) {// isFULL?
			if (model[i] == null) {
				isFull = false;
				break;
			}
		}

		if (isFull) { // ubah size
			var temp = model;
			model = new String[model.length * 2];
			for (int i = 0; i < temp.length; i++) {
				model[i] = temp[i];
			}
		}

		for (int i = 0; i < model.length; i++) {
			if (model[i] == null) {
				model[i] = todo;
				break;
			}
		}
	}

	public static void testAddToDo() {
		for (int i = 0; i < 15; i++) {
			addToDoList("lorem > " + i);
		}
		showToDoList();
		// System.out.println(model.length);
	}

	public static boolean removeTodoList(Integer number) {
		if ((number - 1) >= model.length)
			return false; // overr

		if (model[number - 1] == null) { // no data
			return false;
		} else {

			// shift ke depan

			for (int i = (number - 1); i < model.length; i++) {
				if (i == (model.length - 1)) { // kalau kat hujung
					model[i] = null;
				} else {
					model[i] = model[i + 1];
				}
			}
			return true;
		}
	}

	public static void testRemove() {
		addToDoList("lore");
		addToDoList("lore");
		addToDoList("lore");
		addToDoList("lore");
		addToDoList("lore");

		System.out.println(removeTodoList(2));
		showToDoList();
	}

	public static String input(String texta) {
		Scanner input = new Scanner(System.in);
		String text;
		System.out.print(texta);
		text = input.nextLine();
		return text;
	}

	public static void testinput() {
		var data = input("nama");
		System.out.println(data);
	}

	// ================================================

	public static void viewShowToDoList() {

		while (true) {

			System.out.println("=============");
			showToDoList();
			System.out.println("=============") ;

			System.out.println("1 > Add");
			System.out.println("2 > Remove");
			System.out.println("3 > Out");
			var input = input("pilih");

			if (input.equals("1")) {
				viewAddToDoList();
			} else if (input.equals("2")) {
				viewRemoveTodoList();
			} else if (input.equals("3")) {
				break;
			} else {
				System.out.println("Not found");
			}
		}
	}

	public static void testView() {
		addToDoList("lorem");
		addToDoList("lorem");
		addToDoList("lorem");
		viewShowToDoList();
	}

	public static void viewAddToDoList() {
		System.out.println("Add");
		var toso = input("x Jika batal");

		if (toso.equals("x")) {
			 
		}else{
			addToDoList(toso);
		}
	}

	public static void viewRemoveTodoList() {
		System.out.println("Pilih remove yg mana");
		var input = input("x to Back");
		var result = removeTodoList(Integer.valueOf(input));
	
		if (result) {
			 System.out.println("Done...");
		}else{
			System.out.println("FAILL...");
		}
	}

}