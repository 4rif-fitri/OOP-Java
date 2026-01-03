public class Cat extends Animal implements Carnivore {
	private String name;

	public Cat(String name, String type, int leg) {
		super(type, leg);
		this.name = name;
	}

   @Override
	public void move(){
		System.out.println("This animal has " + this.leg + " legs. It walks, jumps and runs");
	}

	@Override
	public void sound() {
		System.out.println("Cats purr and meow.");
	}
	
	@Override
	public void showAnimal() {
		System.out.println(getName() + " is a cat");
		move();
		sound();
		showEatingPref();
	}

	@Override
	public void showEatingPref() {
		System.out.println("This animal is a carnivore.");
	}

	
	public String getName() {
	  return this.name;
	}
	public void setName(String value) {
	  this.name = value;
	}
}
