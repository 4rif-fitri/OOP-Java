package Lab_4_COMPOSITION;

public class Demo {
    public static void main(String[] args) {
        House house = new House();

        Room room1 = new Room(null);
        Room room2 = new Room(null);
        Room room3 = new Room(null);
    
        house.addRoom(room1);
        house.addRoom(room2);
        house.addRoom(room3);
    }
}
