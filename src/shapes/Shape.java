package shapes;

public abstract class Shape {
    public abstract double computeArea();

    public abstract double computePerimeter();

    public abstract void enlarge(double factor);

    public boolean isLargerThan(Shape shape) {
        return false;
    }
}
