public class Elephant extends Animal implements Herbivore{

   public Elephant(String type, int leg) {
		super(type, leg);
	}

	 @Override
    public void sound() {
		 System.out.println("Elephants rumble and trumpet.");
    }

    @Override
    public void showAnimal() {

    }

    @Override
    public void showEatingPref() {
		System.out.println("This animal is a herbivore.");
    }
	
	
}
