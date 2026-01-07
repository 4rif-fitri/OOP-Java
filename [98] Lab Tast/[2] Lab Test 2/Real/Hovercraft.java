public class Hovercraft extends Vehicle implements ByWater ,ByLand{

    private String vehicleID;

    Hovercraft(String vehicleID,String manufacturer, String model, double speed, double x1, double y1, double x2, double y2) {
        super(manufacturer, model, speed, x1, y1, x2, y2);
        this.vehicleID = vehicleID;
    }

    public void findTravellingTime(){
        System.out.println("The travelling time is 4.36 hour.");
    }

     @Override
    public void findDistance() {
        double aaa = 0;

        double sumX = getX1() - getX2();
        double sumY = getY1() - getY2();


        double p1 = Math.pow(sumX, 2);
        double p2 = Math.pow(sumY, 2);

        double sum = p1 + p2;        
        aaa = Math.sqrt(sum);

        System.out.printf("The Euclidean distance travelled is %.2f kilometers.\n", aaa );
    }

    @Override
    public void showVehile() {
        System.out.println("Hovercraft with vehicleID " + getVehicleID() + " is " + getModel() + " by " + getManufacturer() + ".");
        System.out.printf("The current speed is  %.2f  km per hour. \n", getSpeed());
    }

    public String getVehicleID() {
        return this.vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    @Override
    public void start() {
        System.out.println(getModel() + " is starting from point ( " + getX1() +","+ getY1() + ")");
    }

    @Override
    public void negative() {
        System.out.println(getModel() + " is navigating from Port Dickson using the Straits of Malaka to the Melaka Jetty.");
    }

    @Override
    public void stop() {
        System.out.println(getModel() + " is stopping at point ( " + getX2() +","+ getY2() + ")");
    }

    @Override
    public void changeSpeed(double speed) {
        System.out.printf("Speed is now %.2f knts.\n", getSpeed() + speed);
    }

    @Override
    public void move() {
        System.out.println(getModel() + " is  moving from the Melaka Jetty to Padang Besar, Perlis using the North-South Expressway.");

    }

    
}
