public class TestDemo {
    public static void main(String[] args) {

        System.out.println("\n");

        Yacht yacht1 = new Yacht("X1MDB", "Oceano","Equanimity",
         15.0, -130.7, 10.49, 53.42, -987.6);

         yacht1.showVehile();
         yacht1.start();
         yacht1.changeSpeed(-2);
         yacht1.negative();
         yacht1.stop();
         yacht1.findDistance();

         System.out.println("\n");

         Hovercraft hover1 = new Hovercraft("BTX8934", "Griffon", "380TD", 
                150.0, 289.5, 761.4, 315.0, 1415.5);
        hover1.showVehile();
        hover1.start();
        hover1.negative();
        hover1.move();
        hover1.stop();
        hover1.findDistance();
        hover1.findTravellingTime();

        System.out.println("\n");

        Platypus perry = new Platypus("Perry", "dark brown", 4, 0.8, 
            -100.5, -600.6, -1010.9, -781.7);
        perry.showAnimal();
        perry.bodyCovering();
        perry.start();
        perry.negative();
        perry.changeSpeed(-0.2);
        perry.stop();
        perry.findDistance();

        System.out.println("\n");
        System.out.println("\n");

    }
}
