
import java.util.ArrayList;
import java.util.List;

public class Library {
    private  List<Book> books = new ArrayList<Book>();

    public void addBook(Book book){
        books.add(book);
    }

    public void borrowBook(Borrower borrower , Book book){
        book.setBorrower(borrower);
        borrower.addBook(book);
        book.setIsBorrowed(true);
        System.out.println(borrower.getName() + " borrowed: " + book.getTitle());
    }

    public void returnBook(Borrower borrower , Book book){
        borrower.removeBook(book);
        book.setBorrower(null);
        book.setIsBorrowed(false);
        System.out.println(borrower.getName() + " returned: " + book.getTitle());
    }

    public void displayLibraryBooks(){
        System.out.println("Books in Library: ");
        for(Book book : books){
            if(book.getIsBorrowed() == false){
               book.displayBook();
            }
        }
    }
}
