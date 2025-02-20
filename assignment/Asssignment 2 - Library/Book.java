public class Book {
    private Author author;
    private String title;
    private String ISBN;
    private Borrower borrower;
    private Boolean isBorrowed;

    public Book(String title , String ISBN, Author author){
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        System.out.println("Book added to library: " + title);
    }

    public void setBorrower(Borrower borrower){
        this.borrower = borrower;
    }

    public void setIsBorrowed(Boolean isBorrowed){
        this.isBorrowed = isBorrowed;
    }

    public String getTitle(){
        return this.title;
    }

    public Boolean getIsBorrowed(){
        return this.isBorrowed;
    }

    public void displayBook(){
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Author: " + author.getName());
        System.out.println("Biography: " + author.getDesc());
        System.out.println("------------------------");
    }
}
