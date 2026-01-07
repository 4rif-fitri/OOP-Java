public class Platypus extends Animal implements ByWater {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Platypus(String name, String color, int leg, double speed, double x1, double y1, double x2, double y2) {
        super(color, leg, speed, x1, y1, x2, y2);
        this.name = name;
    }


    @Override
    public void start() {
        System.out.println("Perry starting  point is ( " + getX1() + "," + getY1() + ")");
    }

    @Override
    public void stop() {
        System.out.println("Perry stopping point is ( " + getX2() +"," + getY2() + ")");
    }

    @Override
    public void changeSpeed(double speed) {
        System.out.printf("Speed is %.2f km per hour.\n", getSpeed() + speed);    
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

        System.out.printf("The Euclidean distance travelled is %.2f kilometers." , aaa);
    }

    @Override
    public void bodyCovering() {
        System.out.println("Platypus body is covered with thick " + getColor() + " flur");
    }

    @Override
    public void showAnimal() {
        System.out.println(getName() + " is a platypus. It is a small semi-aquatic mammal with a bill and a flat tail.");
        System.out.println("It has " + getLeg() + " webbed feet like a duck.");
        System.out.println("Uniquely, it lays eggs and produces venom.");
        System.out.printf("The current speed is %.2f km per hour.\n", getSpeed());
    }

    @Override
    public void negative() {
        System.out.println("Perry the platypus is now moving.");
    }

    
}
