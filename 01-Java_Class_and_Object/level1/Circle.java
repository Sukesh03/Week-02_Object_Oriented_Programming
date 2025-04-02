class circle {
    int radius;
    circle(int radius){
        this.radius=radius;
    }
    public void displaydet(double[] res){
        System.out.println("Area: "+res[0]);
        System.out.println("Circumference: "+res[1]);
    }
    public double[] calc(int radius){
        double[] res=new double[2];
        res[0]=(Math.PI*(Math.pow(radius,2)));
        res[1]=(2*Math.PI*radius);
        return res;
    }
}
public class Circle {
    public static void main(String[] args) {
        circle cir = new circle(7);
        cir.calc(cir.radius);
        cir.displaydet(cir.calc(cir.radius));
    }
}
