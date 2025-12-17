class Bird extends Animal implements Flyer {
    @Override

    public void takeOff(){
        System.out.println("Bird take off");
    }

    public void land(){
        System.out.println("Bird landing");

    }

    public void fly(){
        System.out.println("Bird flaying");

    } 
}
