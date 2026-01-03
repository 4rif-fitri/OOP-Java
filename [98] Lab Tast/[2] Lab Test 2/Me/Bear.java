

public class Bear extends Animal implements Carnivore, Herbivore {

    public Bear(String type, int leg) {
        super(type, leg);
    }

	 	public void showEatingPref(){
			System.out.println("This animal is omnivore; both a herbivore and carnivore.");
		}

		public void sound(){
			System.out.println("Bears growl and huff.");
		}

		public void showAnimal(){

		}

}
