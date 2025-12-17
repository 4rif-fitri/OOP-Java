public class Main {
    

    public static void main(String[] args) {
        Truck truck = new Truck(60, 150, 5000, true);
        RiverBarge riverBargeUp = new RiverBarge(10,300,300,3);
        RiverBarge riverBargedown = new RiverBarge(10,300,300,-3);
        
        System.out.println("\nTruck");
        truck.display();
        System.out.println("Highway use : " + truck.getHighway());
        System.out.printf("Truck fuel required: %.2f Liters\n\n",truck.calcFuelRequired());

        System.out.println("RiverBarge Down");
        riverBargedown.display();
        System.out.printf("River speed %.2f km/h ",riverBargedown.getRiverSpeed());
        System.out.printf("Truck fuel required: %.2f Liters\n\n",riverBargedown.calcFuelRequired());
        
        System.out.println("RiverBarge Up");
        riverBargeUp.display();
        System.out.printf("Truck fuel required: %.2f Liters\n\n",riverBargeUp.calcFuelRequired());


    }
}
