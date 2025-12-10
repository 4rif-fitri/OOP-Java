public class Main { 
    
    // SAME METHOD NAME DIFFRENT PARAMA

// OVERRIDING
// SAME METHOD NAME DIFFREN IMPLIMENTTAION
    public static void main(String[] args) {
        
        System.out.println("Animal");
        Animal animal = new Animal();
        animal.sound();
        animal.eat();
        animal.move();

        System.out.println("\nDog");
        Animal dog = new Dog();
        dog.sound();
        dog.eat();
        dog.move();

        System.out.println("\nFish");
        Animal fish = new Fish();
        fish.sound();
        fish.eat();
        fish.move();

        System.out.println("\nCat");
        Animal cat = new Fish();
        cat.sound();
        cat.eat();
        cat.move();
    }
}
