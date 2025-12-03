package Lab.Clothing;

public class Clothing {
    private String itemCode;
    private String description;
    private String color;
    private String material;
    private double unitPrice;
    private int quantityInStock;
    private boolean replenishStock;

    public Clothing(
        String itemCode,String description,String color,
        String material, double unitPrice,int quantityInStock,
        boolean replenishStock ){

    this.itemCode = itemCode;
    this.description = description;
    this.color = color;
    this.material = material;
    this.unitPrice = unitPrice;
    this.quantityInStock = quantityInStock;
    this.replenishStock = replenishStock;

    }

    public void displayDetails(){
        System.out.println("\n======================================");
        System.out.println("Item Code \t\t" + this.itemCode);
        System.out.println("description \t\t" + this.description);
        System.out.println("color \t\t\t" + this.color);
        System.out.println("material \t\t" + this.material);
        System.out.println("unitPrice \t\t" + this.unitPrice);
        System.out.println("quantityInStock \t" + this.quantityInStock);
        System.out.println("replenishStock \t\t" + this.replenishStock);
    }
}
