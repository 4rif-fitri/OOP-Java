package lab4;
public class Shirt {
    private String shirtCode;
    private String description;
    private char size;
    private char color;
    private double unitPrice;
    private int quantityStock;
    private boolean repleninsStock;


    Shirt(){
        this.shirtCode = "";
        
        this.size = 'M';
        this.color = 'B';
    }

    Shirt(String shirtCode, String description ){
        this.description = description;
        this.shirtCode = shirtCode;
    }

    Shirt(String shirtCode, String description,char size, char color){
        this.description = description;
        this.shirtCode = shirtCode;
        this.color = color;
        this.size = size;
    }

    public void setPrice(double harga){
        this.unitPrice = harga;
    }
    
    public void setQuantityInStock(int q){
        this.quantityStock = q;
    }

    public void displayDetail(){
        System.out.println("shirtCode     : " + this.shirtCode);
        System.out.println("description   : " + this.description);
        System.out.println("size          : " + this.size);
        System.out.println("color         : " + this.color);
        // System.out.println("unitPrice     : " + this.unitPrice);
        // System.out.println("quantityStock : " + this.quantityStock);
        System.out.println("-----------------------------------\n");

    }
}
