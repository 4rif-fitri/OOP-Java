class AnimalDemo{
	public static void main(String[] args) {
		System.out.println("");

		Elephant elephant1 = new Elephant("mammal", 4);
		elephant1.move();
		elephant1.sound();
		elephant1.showEatingPref();
		System.out.println("");

		Cat cat1 = new Cat("QuPuteh", "mammal", 4);
		cat1.showAnimal();
		System.out.println("");

		Bear bear1 = new Bear("mammal", 4);
		bear1.sound();
		bear1.move();
		bear1.showEatingPref();
		System.out.println("");
	}
}