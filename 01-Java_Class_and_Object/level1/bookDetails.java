class bd{
    String title;
    String author;
    double price;
    bd(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void displaydetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
public class bookDetails {
    public static void main(String[] args){
        bd bookdet=new bd("Harry potter","J.K. Rowling",1500);
        bookdet.displaydetails();
    }
}
