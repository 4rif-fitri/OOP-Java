package labtest;

class IceCream {
	private String brand;
	private String description;
	private int quantity;
	private double unitPrice;

	IceCream(){
		this.brand = "Null";
		this.description = "Null";
		this.quantity = 0;
		this.unitPrice = 0.0;
	}
	IceCream(String b, String d){
		this.brand = b;
		this.description = d;
		this.quantity = 0;
		this.unitPrice = 0.0;
	}
	IceCream(String b, String d, int q, double up){
		this.brand = b;
		this.description = d;
		this.quantity = q;
		this.unitPrice = up;
	}

	public void display(){
		System.out.println("Brand : \t\t\t" + this.brand);
		System.out.println("Description : \t\t\t" + this.description);
		System.out.println("Quantity : \t\t\t" + this.quantity);
		System.out.println("UnitPrice : \t\t\t" + this.unitPrice);
		System.out.println("--------------------------------------");
	}

}
