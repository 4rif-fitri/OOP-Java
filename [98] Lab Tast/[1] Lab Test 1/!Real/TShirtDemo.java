// ARIF FITRI D032410321 S2G2 


public class TShirtDemo {
    public static void main(String[] args) {
        
        TShirt Gildan = new TShirt("Gildan","G2000");
        TShirt BudakMalaysia = new TShirt("BudakMalaysia",30);
        TShirt UNIQLO = new TShirt("UNIQLO","Supima V-neck",50,45.00);

        Gildan.setQuantity(40);
        Gildan.setUnitPrice(30.00);

        BudakMalaysia.setDescription("Pakka Lokal");
        BudakMalaysia.setUnitPrice(80.00);

        Gildan.display();
        BudakMalaysia.display();
        UNIQLO.display();
    }
}
