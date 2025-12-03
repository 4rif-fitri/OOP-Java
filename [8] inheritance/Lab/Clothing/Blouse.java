package Lab.Clothing;

public class Blouse extends Clothing{
    private String size;
    private char sleeveType;
    private String fabric;
    private String pattern;

    public Blouse(String itemCode,String description,String color,
        String material, double unitPrice,int quantityInStock,
        boolean replenishStock){
        super(itemCode, description, color, material, unitPrice, quantityInStock, replenishStock);
    }

    public void setTambahanDetail(String size,String fabric,char sleeveType,String pattern){
        this.size = size;
        this.fabric = fabric;
        this.sleeveType = sleeveType;
        this.pattern = pattern;
    }

    public void display(){
        this.displayDetails();
        System.out.println("Size \t\t\t" + this.size);
        System.out.println("fabric \t\t\t" + this.fabric);
        System.out.println("sleeveType \t\t" + this.sleeveType);
        System.out.println("pattern \t\t" + this.pattern);
    }

}
