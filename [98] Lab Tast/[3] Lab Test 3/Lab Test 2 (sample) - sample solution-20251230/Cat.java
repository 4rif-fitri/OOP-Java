
/**
 * Write a description of class Cat here.
 *
 * @author abdul razak hussain
 * @version 12 january 2021
 */
public class Cat extends Animal implements Carnivore
{
    private String name;
    
    public Cat(String name, String type, int leg){
        
        // use superclass constructor 
        super(type, leg);
        this.name = name; 
    }
    
    public void move(){
       System.out.println("This animal has " + leg + " legs. It walks, jumps and runs.");
    }//move
    
    public void sound(){
        System.out.println("Cats purr and meow.");
    }//sound
    
    public void showAnimal(){
       System.out.println(name + " is a cat.");
       move();
       sound();
    }
    
    public void showEatingPref(){
       System.out.println("This animal is a carnivore.");
    }
    
} // end of class
