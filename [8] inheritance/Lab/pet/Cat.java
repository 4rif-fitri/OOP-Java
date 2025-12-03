package Lab.Pet;

public class Cat extends Pet{
    protected boolean declawed;
    
    public Cat(){

    }
    public Cat(String name, String color){
        // this.name = name;
        // this.color = color;
        super(name,color);
    }

    public void scratch(){
        System.out.println("scratchingggggg!!!!!!!!!");
    }
    public void sound(){
        System.out.println("Gung");
    }
    
}
