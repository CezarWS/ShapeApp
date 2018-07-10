package shapes;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width =width;
        this.length = length;

    }

    @Override
    public double computeArea() {
        return width*length;
    }

    @Override
    public double computePerimeter() {
        return 2*(width*length);
    }

    @Override
    public void enlarge(double factor) {

    }
}
