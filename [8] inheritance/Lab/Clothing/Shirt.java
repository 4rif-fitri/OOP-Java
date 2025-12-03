package Lab.Clothing;

public class Shirt extends Clothing{
    private String size;
    private String fabric;
    private char sleeveType;

    public Shirt(String itemCode,String description,String color,
        String material, double unitPrice,int quantityInStock,
        boolean replenishStock){
        super(itemCode, description, color, material, unitPrice, quantityInStock, replenishStock);
    }

    public void setTambahanDetail(String size,String fabric,char sleeveType){
        this.size = size;
        this.fabric = fabric;
        this.sleeveType = sleeveType;
    }

    public void display(){
        this.displayDetails();
        System.out.println("Size \t\t\t" + this.size);
        System.out.println("fabric \t\t\t" + this.fabric);
        System.out.println("sleeveType \t\t" + this.sleeveType);
    }
}
