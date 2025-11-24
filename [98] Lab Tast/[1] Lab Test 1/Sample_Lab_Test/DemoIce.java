package Sample_Lab_Test;

public class DemoIce {
    public static void main(String[] args) {
        IceCream Nestle = new IceCream("Nestle","Drumstick");
        IceCream Walls = new IceCream("Wall’s ","",130,0);
        IceCream Magnum = new IceCream("Magnum","Classic",120,4.00);
    
    
        Nestle.setQuantity(100);
        Nestle.setUnitPrice(3.00);

        Walls.settDescription("Top Ten Vanilla");
        Walls.setUnitPrice(2.80);

        Nestle.display();
        Walls.display();
        Magnum.display();
        
    
    }
}
