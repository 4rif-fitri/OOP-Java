public class AnimalDemo {
	public static void main(String[] args) {
		
		Elephant elephant1 = new Elephant("mammal", 4);
		elephant1.move();
		elephant1.sound();
		elephant1.showAnimal();

		Cat cat1 = new Cat("QuPuteh", "mammal", 4);
		cat1.showAnimal();

		Bear bear1 = new Bear("mammal", 4);
		bear1.sound();
		bear1.move();
		bear1.showEatingPref();
	}
}
