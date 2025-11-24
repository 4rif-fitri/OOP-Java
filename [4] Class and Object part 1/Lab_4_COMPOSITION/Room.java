package Lab_4_COMPOSITION;

class Room {
    private String name;

    public Room(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Room : " + this.name);
    }
}
