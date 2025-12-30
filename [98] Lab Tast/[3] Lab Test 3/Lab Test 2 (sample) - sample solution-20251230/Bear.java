
/**
 * Write a description of class Bear here.
 *
 * @author abdul razak hussain
 * @version 12 january 2021
 */
public class Bear extends Animal implements Herbivore, Carnivore
{
    public Bear(String type, int leg){
        super(type, leg);
    }
    
    public void sound(){
       System.out.println("Bears growl and huff.");
    }
    
    public void move(){
       System.out.println("This animal moves with " + leg + " legs.");
    }
    
    public void showEatingPref(){
       System.out.println("This animal is omnivore; both a herbivore and carnivore.");
    }
    
    public void showAnimal(){
       move();
       sound();
    }
    
} //end of class
