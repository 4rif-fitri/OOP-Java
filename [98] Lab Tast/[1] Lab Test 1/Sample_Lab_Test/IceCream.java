package Sample_Lab_Test;

import java.util.StringTokenizer;

public class IceCream {

    private String brand;
    private String description;
    private int quantity;
    private double unitPrice;

    IceCream(){}

    IceCream(String b, String d){
        this.brand = b;
        this.description = d;
    }
    IceCream(String b, int q){
        this.brand = b;
        this.quantity = q;
    }
    IceCream(String b, String d, int q, double up){
        this.brand = b;
        this.description = d;
        this.quantity = q;
        this.unitPrice = up;
    }

    // ======

    public void setQuantity(int q){
        this.quantity = q;
    }
    public void setUnitPrice(double p){
        this.unitPrice = p;
    }
    public void settDescription(String d){
        this.description = d;
    }

    public int getQuantity(){
        return this.quantity;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getDescription(){
        return this.description;
    }
    public double getUnitPrice(){
        return this.unitPrice;
    }


    // =======
    public void display(){
        System.out.println("\nBrand : " + getBrand());
        System.out.println("Description : " + getDescription());
        System.out.println("Quantity : " + getQuantity());
        System.out.println("UnitPrice : " + getUnitPrice());
        System.out.println("Value of quantity in stock : " + getUnitPrice() * getQuantity() + "\n");
    }



}
