package A;

public class Demo {
    public static void main(String[] args) {
        Book book1 = new Book("Lorem", "Ipsum");
        Book book2 = new Book("Dolor", "Amit");
        Book book3 = new Book("Lorem", "Dolor");

        Library plh = new Library("Laman Hikmah");

        plh.addBook(book1);
        plh.addBook(book2);
        plh.addBook(book3);

        plh.shoeBook();

    }
}
