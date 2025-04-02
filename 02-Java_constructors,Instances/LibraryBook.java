public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public LibraryBook(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You borrowed: " + title);
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently unavailable.");
        }
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println();
    }

    public static void main(String[] args) {
        LibraryBook hp1 = new LibraryBook("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 499.0, true);
        LibraryBook hp2 = new LibraryBook("Harry Potter and the Chamber of Secrets", "J.K. Rowling", 599.0, true);

        hp1.displayBook();
        hp2.displayBook();

        hp1.borrowBook();
        hp1.displayBook();

        hp1.borrowBook(); // Trying to borrow again
    }
}
