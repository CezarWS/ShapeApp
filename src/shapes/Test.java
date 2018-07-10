package shapes;

import javax.print.attribute.standard.SheetCollate;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        // Rectangle test
        double width = 6, length = 10;
        Shape rectangle = new Rectangle(width,length);


        rectangle.computeArea();
        rectangle.computePerimeter();
        System.out.println("Rectangle width: " + width + " and length: " + length +
                "\nResulting area: " + rectangle.computeArea() + "\nResulting perimeter: "
                + rectangle.computePerimeter() + "\n");

        // Circle test
        double radius = 30;
        Shape circle = new Circle(radius);


        circle.computePerimeter();
        circle.computeArea();
        System.out.println("Radius circle : " + radius +
                "\nResulting area: " + circle.computeArea() +
                "\nResulting perimeter: " + circle.computePerimeter() + "\n");

        // Triangle test
        double a = 10;
        double b = 20;
        double c = 29;
        Shape triangle = new Triangle(a, b, c);


        triangle.computeArea();
        triangle.computePerimeter();
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Area: " + triangle.computeArea()
                + "\nResulting Perimeter: " + triangle.computePerimeter() + "\n");
        System.out.println("Triangle area bigger that circle area: " + isLargerThan());
        System.out.println("The sum of areas is : "  + sumAreas());
    }

    //isLarger
    public static boolean isLargerThan(){
        Triangle shape1 = new Triangle(3,5,7);
        Shape shape2 = new Circle();
        if (shape1.computeArea() < shape2.computeArea()){
            return true;
        }
        return false;
    }
    public static double sumAreas() {
        Shape shapeC = new Circle(2);
        Shape shapeT = new Triangle(3,5,7);
        Shape shapeR = new Rectangle(4,5);
        double sum = 0;

        sum = shapeC.computeArea()+shapeR.computeArea()+shapeT.computeArea();
        return sum;
    }

}