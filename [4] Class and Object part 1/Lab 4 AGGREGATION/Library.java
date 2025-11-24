package A;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> books;    

    public Library(String name){
        this.name = name;
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void shoeBook(){
        System.out.println("Library : " + this.name);
        for(Book b:books){
            b.display();
        }

    }
}
