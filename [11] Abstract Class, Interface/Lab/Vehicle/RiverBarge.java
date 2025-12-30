public class RiverBarge extends Vehicle{
    private double riverSpeed;

    public RiverBarge(double speed, double distence,double load, double riverSpeed){
        super(distence,speed,load);
        this.riverSpeed = riverSpeed;
    }

    public double getRiverSpeed(){
        return this.riverSpeed;
    }

    public double calcFuelRequired(){
        double baseSpeed = 0;
        if(this.riverSpeed > 0){ // upstream
            baseSpeed = getSpeed() - this.riverSpeed;
        }else{ //downstream
            baseSpeed = getSpeed() + Math.abs(riverSpeed);
        }

        return getDistence() / baseSpeed;
    }
}
