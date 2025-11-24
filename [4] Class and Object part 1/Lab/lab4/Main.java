package lab4;

public class Main {
    public static void main(String[] args) {
        Shirt ccc = new Shirt();
        ccc.displayDetail();

        
        Shirt bbb = new Shirt("A123","Lorem Ipsum Dolor Sit Amit");
        bbb.displayDetail();


        Shirt aaa = new Shirt("A123","Lorem Ipsum Dolor Sit Amit",'M','B');
        aaa.displayDetail();
    }
}
