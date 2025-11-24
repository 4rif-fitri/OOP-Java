package A;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void display(){
        System.out.println("");
        System.out.println("Title   : " + this.title);
        System.out.println("Author  : " + this.author);
    }
}
