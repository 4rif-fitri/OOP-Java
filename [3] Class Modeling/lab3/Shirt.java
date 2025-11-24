public class Shirt {
	private String name;
	private String shirtCode;
	private String description;
	private char size;
	private String color;
	private double unitPrice;
	private int quantityInStock;

	Shirt(String name,String shirtCode, String description, char size
			,String color, double unitPrice, int quantityInStock){

		this.name = name;
		this.shirtCode = shirtCode;
		this.description = description;
		this.size = size;
		this.color = color;
		this.unitPrice = unitPrice;
		this.quantityInStock = quantityInStock;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setShirtCode(String shirtCode){
			this.shirtCode = shirtCode;
	}
	public String getShirtCode(){
		return shirtCode;
	}

	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription(){
		return this.description;
	}

	public void setSize(char size) {
		this.size = size;
	}
	public char getSize() {
		return this.size;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getUnitPrice() {
		return this.unitPrice;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	public int getQuantityInStock() {
		return this.quantityInStock;
	}

	public void display(){
		System.out.println("=========================================");
		System.out.println("Name \t\t\t\t\t\t\t\t\t\t\t: " + this.name);
		System.out.println("Shirt Code \t\t\t\t\t\t\t\t\t: " + this.shirtCode);
		System.out.println("Description \t\t\t\t\t\t\t\t: " + this.description);
		System.out.println("Size \t\t\t\t\t\t\t\t\t\t\t: " + this.size);
		System.out.println("Color \t\t\t\t\t\t\t\t\t\t: " + this.color);
		System.out.println("Unit Price \t\t\t\t\t\t\t\t\t: " + this.unitPrice);
		System.out.println("Quantity Stock \t\t\t\t\t\t\t: " + this.quantityInStock);
		System.out.printf("Total stock value for " + this.name +" is RM \t: " + this.quantityInStock * this.unitPrice);
		System.out.println("=========================================");

	}
}

