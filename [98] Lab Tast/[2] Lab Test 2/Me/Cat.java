

public class Cat extends Animal implements Carnivore{
	private String name;

	Cat(String name ,String type, int leg){
		this.name = name;
		super(type,leg);
	}

	public void showAnimal(){
		System.out.println(this.name + " is a cat");
		this.move();
		this.sound();
	}

	public void move() {
		super.move();
		System.out.println("It walks, jumps and runs");
	}
	public void sound(){
		System.out.println("Cats purr and meow.");
	}

	public void showEatingPref(){
		System.out.println("This animal is a carnivore.");
	}
}
