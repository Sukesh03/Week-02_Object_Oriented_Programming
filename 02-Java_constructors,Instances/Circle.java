public class Circle {
    double radius;
    Circle(){
        this(7);
    }
    Circle(double radius){
        this.radius=radius;
    }
    public double displayradius(){
        return radius;
    }
    public static void main(String[] args){
        Circle c1=new Circle();
        Circle c2=new Circle(5);
        System.out.println("Radius of circle 1: "+c1.displayradius());
        System.out.println("Radius of circle 2; "+c2.displayradius());
    }
}
