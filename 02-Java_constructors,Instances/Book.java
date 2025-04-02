class Bookk {
    String title;
    String author;
    double price;
    Bookk(){
        title="Harry Potter and the Philosopher's Stone";
        author="J. K. Rowling";
        price=2000;
    }
    Bookk(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void displaydetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
public class Book{
    public static void main(String[] args){
        Bookk b1=new Bookk();
        b1.displaydetails();
        Bookk b2=new Bookk("Harry Potter and the Chamber of Secrets","J. K. Rowling",2500);
        b2.displaydetails();
    }
}
