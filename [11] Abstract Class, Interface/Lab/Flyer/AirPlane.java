class AirPlane extends Vehicle implements Flyer {
    
    @Override

    public void takeOff(){
        System.out.println("Plane take off");
    }

    public void land(){
        System.out.println("Plane landing");

    }

    public void fly(){
        System.out.println("Plane flaying");

    } 
}
