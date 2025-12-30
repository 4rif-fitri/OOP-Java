public class Elephant extends Animal implements Herbivore {

	Elephant( String type,int leg){
		super(type, leg);
	}

	public void sound(){
		System.out.println("Elephants rumble and trumpet.");
	}
	
	public void showEatingPref(){
		System.out.println("This animal is a herbivore.");
	}

	public void showAnimal(){

	}
}
