package Lab.Clothing;

public class Tudung extends Clothing{
    private String size;
    private String material;
    private String type;

    public Tudung(String itemCode,String description,String color,
        String material, double unitPrice,int quantityInStock,
        boolean replenishStock){
        super(itemCode, description, color, material, unitPrice, quantityInStock, replenishStock);
    }
    public void setTambahanDetail(String size,String material,String type){
        this.size = size;
        this.material = material;
        this.type = type;
    }

    public void display(){
        this.displayDetails();
        System.out.println("Size \t\t\t" + this.size);
        System.out.println("material \t\t" + this.material);
        System.out.println("type \t\t\t" + this.type);
    }
}
