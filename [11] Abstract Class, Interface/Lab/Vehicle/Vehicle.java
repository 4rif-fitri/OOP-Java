public abstract class Vehicle {
    private double distence;
    private double speed;
    private double load;

    public Vehicle(double distence, double speed, double load){
        this.distence = distence;
        this.load = load;
        this.speed = speed;
    }

    public void display(){
        System.out.printf("Distence %.2f km\n",distence);
        System.out.printf("Speed %.2f km/h\n",speed);
        System.out.printf("load %.2f kg\n",load);
    }
    protected abstract double calcFuelRequired();

    public double getDistence(){
        return this.distence;
    }
    public double getSpeed(){
        return this.speed;
    }
    
}