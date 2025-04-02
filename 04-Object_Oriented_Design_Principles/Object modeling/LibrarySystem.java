class Book {
    static String libraryName = "City Central Library";
    private static int totalBooks = 0;

    private final String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        totalBooks++;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid book object.");
        }
    }

    public static int getTotalBooks() {
        return totalBooks;
    }
}

class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book("9780439708180", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
        Book b2 = new Book("9780439064873", "Harry Potter and the Chamber of Secrets", "J.K. Rowling");
        Book b3 = new Book("9780439136365", "Harry Potter and the Prisoner of Azkaban", "J.K. Rowling");

        Book.displayLibraryName();
        System.out.println();

        b1.displayBookDetails();
        System.out.println();
        b2.displayBookDetails();
        System.out.println();
        b3.displayBookDetails();
        System.out.println();

        System.out.println("Total books in system: " + Book.getTotalBooks());
    }
}
