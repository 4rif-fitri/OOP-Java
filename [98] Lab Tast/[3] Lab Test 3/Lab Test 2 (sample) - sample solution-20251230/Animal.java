
/**
 * Abstract class Animal - write a description of the class here
 *
 * @author abdul razak hussain
 * @version 11 january 2021
 */
public abstract class Animal
{
    protected String type;
    protected int leg;
    
    public Animal(String type, int leg){
      this.type = type;
      this.leg = leg;
    }
    
    public void move() {
        System.out.println("This animal moves with " + leg + " legs.");
    } //move
    
    public abstract void sound();
    
    public abstract void showAnimal();
    
}// end of class
