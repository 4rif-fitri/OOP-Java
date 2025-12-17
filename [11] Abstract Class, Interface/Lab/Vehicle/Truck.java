public class Truck extends Vehicle{
    private boolean highway;
    
    public Truck(double speed, double distence,double load, boolean highway){
        super(distence,speed,load);
        this.highway = highway;
    }

    public boolean getHighway(){
        return this.highway;
    }


    public double calcFuelRequired(){
        double baseFuel = 10;

        if(highway){//kurang fuel consume
            double reduction = 0.05 + (Math.random() * 0.10);
            baseFuel *= (1 - reduction);
        }

        return getDistence() / baseFuel;
    }
}
