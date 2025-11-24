public class Shirt {
	private String shirtCode;
	private String descfiption;
	private char size;
	private char color;
	private int quantityStock;
	private boolean replenishStock;

	Shirt(){
		this.size = 'M';
		this.color = 'B';
		
	}

	Shirt(String sCode, String des){
		this.shirtCode = sCode;
		this.descfiption = des;
	}

	Shirt(String sCode, String des, char size, char color) {
		this.shirtCode = sCode;
		this.descfiption = des;
		this.size = size;
		this.color = color;
	}

	public void displayDetails(){
		System.out.println("-------------------------------------");
		System.out.println("Shirt Code: " + shirtCode);
		System.out.println("Description: " + descfiption);
		System.out.println("Size: " + size);
		System.out.println("Color: " + color);
	}
}
