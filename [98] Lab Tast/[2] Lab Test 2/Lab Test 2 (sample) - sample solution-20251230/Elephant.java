
/**
 * Write a description of class Elephant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elephant extends Animal implements Herbivore
{
    public Elephant (String type, int leg){
       super(type, leg);
    }
    
    public void sound(){
      System.out.println("Elephants rumble and trumpet");
    }
    
    public void showAnimal(){
        sound();
        move();
        
    }
    
    public void showEatingPref(){
        System.out.println("This animal is a herbivore");
    }
    
}// end of class
