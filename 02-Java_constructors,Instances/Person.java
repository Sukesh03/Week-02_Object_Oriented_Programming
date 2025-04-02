public class Person {
    String name;
    int age;
    double height;
    double weight;
    Person(String name,int age,double height,double weight){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }
    Person(Person other){
        this.name=other.name;
        this.age=other.age;
        this.height=other.height;
        this.weight=other.weight;
    }
    void displaydetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight);
    }
    public static void main(String[] args){
        Person og=new Person("Suk",21,160,65);
        Person c=new Person(og);
        System.out.println("Original: ");
        og.displaydetails();
        System.out.println("Clone: ");
        c.displaydetails();
    }
}
