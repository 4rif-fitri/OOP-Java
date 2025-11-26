// ARIF FITRI D032410321 S2G2 


public class TShirt {
    private String brand;
    private String description;
    private int quantity;
    private double unitPrice;


    public String getBrand(){
        return this.brand;
    }
    public String getDescription(){
        return this.description;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public double getUnitPrice(){
        return this.unitPrice;
    }

    public void setBrand(String b){
        this.brand = b;
    }
    public void setDescription(String b){
        this.description = b;
    }
    public void setQuantity(int q){
        this.quantity = q;
    }
    public void setUnitPrice(double p){
        this.unitPrice = p;
    }

    TShirt(){

    };
    TShirt(String b, String d){
        this.brand = b;
        this.description = d;
    };
    TShirt(String b, int q){
        this.brand = b;
        this.quantity = q;
    };
    TShirt(String b, String d,int q, double p){
        this.brand = b;
        this.description = d;
        this.quantity = q;
        this.unitPrice = p;
    };

    public void display(){
        System.out.println("\n\n======================================");
        System.out.println("Brand\t\t: " + getBrand());
        System.out.println("Description\t: " + getDescription());
        System.out.println("Quantity\t: " + getQuantity());
        System.out.printf("UnitPrice\t: %.2f" , getUnitPrice());
        System.out.printf("\nStok Value\t: %.2f", getUnitPrice() * getQuantity());

    }
}
