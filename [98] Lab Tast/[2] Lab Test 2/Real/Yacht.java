public class Yacht extends Vehicle implements ByWater {
    private String vehicleID;

    Yacht(String vehicleID, String manufacturer, String model, double speed, double x1, double y1, double x2, double y2) {
        super(manufacturer, model, speed, x1, y1, x2, y2);
        this.vehicleID = vehicleID;
    }

    @Override
    public void findDistance() {

        double b1 = getX1() - getX2();
        double b2 = getY1() - getY2();

        b1 = Math.abs(b1);
        b2 = Math.abs(b2);

        double sum = b1 + b2;

        System.out.printf("The Manhattan distance travelled is %,.2f nautical miles.\n", sum);
    }

    @Override
    public void showVehile() {
        System.out.println("Yacht with vehicleID " + getVehicleID() + " is " + getModel() + " by " + getManufacturer() + ".");
        System.out.printf("The current speed is  %.2f  konts \n", getSpeed());
    }

    public String getVehicleID() {
        return this.vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    // guna extention untuk buat setter and getter secara autometik

    @Override
    public void start() {
        System.out.println("Yacht is starting from point ( " + getX1() +","+ getY1() + ")");
    }

    @Override
    public void negative() {
        System.out.println("Yacht is leaving Porto Malai, Langkawi.");
    }

    @Override
    public void stop() {
        System.out.println("Yacht is stopping at point ( " + getX2() +","+ getY2() + ")");
    }

    @Override
    public void changeSpeed(double speed) {
        System.out.printf("Speed is now %.2f knots.\n", getSpeed() + speed);
    }

}
