package shapes;

public class Triangle extends Shape {
   private final double a,b,c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double computeArea() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public double computePerimeter() {
        return a+b+c;
    }

    @Override
    public void enlarge(double factor) {

    }
}
