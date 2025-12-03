package Lab.Clothing;

public class ClothingDemo {
    public static void main(String[] args) {
        Pants pant = new Pants("0001", "Jenama Suprime", "Blue", "Nilon", 5, 5, true);
        pant.setTambahanDetail("30","Sutera","Tebal",'M');
        
        Blouse blouse = new Blouse("0001", "Jenama Suprime", "Blue", "Nilon", 5, 5, true);
        blouse.setTambahanDetail("30","Sutera",'T',"Corak");
        
        Shirt shirt = new Shirt("0001", "Jenama Suprime", "Blue", "Nilon", 5, 5, true);
        shirt.setTambahanDetail("30","Sutera",'L');

        Tudung tudung = new Tudung("0001", "Jenama Suprime", "Blue", "Nilon", 5, 5, true);
        tudung.setTambahanDetail("30","Sutera","Tebal");

        pant.display();
        blouse.display();
        shirt.display();
        tudung.display();
    }
}
