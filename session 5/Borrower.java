
import java.rmi.server.RemoteServer;
import java.util.ArrayList;
import java.util.List;

public class Borrower {
    private String Name;
    private List<Book> myBooks = new ArrayList<Book>();


    public Borrower(String name) {
        this.Name = name;
    }

    public void addBook(Book book){
        myBooks.add(book);
    }

    public void removeBook(Book book){
        myBooks.remove(book);
    }

    public String getName(){
        return this.Name;
    }

    public void displayBorrowedBooks(){
        System.out.println(Name + "'s" + " Borrowed Books:");
        for(Book book : myBooks){
            book.displayBook();
        }
    }

}
