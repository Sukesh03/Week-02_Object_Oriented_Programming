public class BookRecord {
    public String ISBN;
    protected String title;
    private String author;

    public BookRecord(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookInfo() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println();
    }

    public static void main(String[] args) {
        BookRecord b1 = new BookRecord("978-0-7475-3269-9", "Harry Potter and the Philosopher's Stone", "J.K. Rowling");
        b1.displayBookInfo();

        OnlineBook ob1 = new OnlineBook("978-0-7475-3849-3", "Harry Potter and the Goblet of Fire", "J.K. Rowling", "EPUB");
        ob1.displayOnlineBookInfo();
    }
}

class OnlineBook extends BookRecord {
    private String format;

    public OnlineBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    public void displayOnlineBookInfo() {
        System.out.println("Online Book Format: " + format);
        System.out.println("ISBN (public): " + ISBN);
        System.out.println("Title (protected): " + title);
        System.out.println("Author (private via getter): " + getAuthor());
        System.out.println();
    }
}
