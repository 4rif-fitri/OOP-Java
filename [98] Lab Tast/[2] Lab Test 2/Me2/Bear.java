public class Bear extends Animal implements Carnivore, Herbivore{

    public Bear(String type, int leg) {
		super(type, leg);
		//TODO Auto-generated constructor stub
	}

	 @Override
    public void sound() {
		System.out.println("Bears growl and huff.");
	}

    @Override
    public void showAnimal() {

	}

    @Override
    public void showEatingPref() {
		System.out.println("This animal is omnivore; both a herbivore and carnivore.");
	}
	
}
