package Lab.pet;


public class Dog extends Pet{
    protected boolean neutered;

    public Dog(){

    }

    public Dog(String name, String color){
        // this.name = name;
        // this.color = color;
        super(name,color);
    }

    public void setNeutered(boolean n){
        this.neutered = n;
    }
    public boolean getNeutered(){
        return this.neutered;
    }

    public void rollover(){
        System.out.println("Rolling");
    }

    public void sound(){
        System.out.println("Meaw");
    }
    
}
