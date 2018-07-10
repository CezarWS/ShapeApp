package shapes;

public  class Circle extends Shape{
    private final double radius;
    private double pi = Math.PI;
    public Circle(){
        this(1);
    }
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return 2*pi * radius;
    }

    @Override
    public double computePerimeter() {
        return 0;
    }

    @Override
    public void enlarge(double factor) {

    }
}
