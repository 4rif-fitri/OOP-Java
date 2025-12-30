

public abstract class Animal {
	protected String type;
	protected int leg;

	public Animal(String type, int leg) {
		this.type = type;
		this.leg = leg;
	}

	public void move(){
		System.out.println("This animal moves with " + this.leg + " legs.");
	};
	public abstract void sound();
	public abstract void showAnimal();
}

