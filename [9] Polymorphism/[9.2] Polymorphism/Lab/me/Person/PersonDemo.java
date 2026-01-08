public class PersonDemo {
 
    

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.displayInfo();
        p1.displayInfo("LOREM");
        p1.displayInfo("LOREM",20);

        Undergraduate ug1 = new Undergraduate();
        ug1.displayInfo("IPSUM","Software Enginner");

        Postgraduate pg1 = new Postgraduate();
        pg1.display("Dolor","En Sit Amit");
    }
}
