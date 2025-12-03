package Lab.Pet;

public class Pet {
    protected String name;
    protected String color;

    public Pet(){

    }
    public Pet(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void eat(){

    }
    public void display(){
        System.out.println("Name :\t" + this.name);
        System.out.println("Color :\t" + this.color);
    }
    public void sound(){}
}
