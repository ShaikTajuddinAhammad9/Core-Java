public class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor to initialize a Book object
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {
        // Create a Book object using the constructor
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");

        // Access the details using getter methods
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("ISBN: " + book1.getIsbn());

        // Display book details using displayBookDetails() method
        book1.displayBookDetails();
    }
}
