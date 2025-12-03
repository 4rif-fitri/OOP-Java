package Lab.Clothing;

public class Pants extends Clothing{
    private String size;
    private String fabric;
    private char gender;
    private String cutting;

    public Pants(String itemCode,String description,String color,
        String material, double unitPrice,int quantityInStock,
        boolean replenishStock){
        super(itemCode, description, color, material, unitPrice, quantityInStock, replenishStock);
    }

    public void setTambahanDetail(String size,String fabric,String cutting,char gender){
        this.size = size;
        this.fabric = fabric;
        this.gender = gender;
        this.cutting = cutting;
    }

    public void display(){
        this.displayDetails();
        System.out.println("Size \t\t\t" + this.size);
        System.out.println("fabric \t\t\t" + this.fabric);
        System.out.println("gender \t\t\t" + this.gender);
        System.out.println("cutting \t\t" + this.cutting);
    }

}
