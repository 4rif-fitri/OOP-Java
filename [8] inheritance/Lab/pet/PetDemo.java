package Lab.Pet;

public class PetDemo {
    public static void main(String[] args) {
        Dog goofy = new Dog();
        Dog scooby = new Dog("scooby Doo", "chocolate");
        Cat doremon = new Cat();
//
        goofy.display();
        scooby.display();
        doremon.display();
        scooby.setNeutered(false);
        System.out.println("scooby neutered status : " + scooby.getNeutered());

    }
}
