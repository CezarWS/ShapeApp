package Main.Java;

public class Circle {
    public static void main(String[] args ){
        /* 4. Print the area and circumference of a circle from the radius (learn which types of variables to choose?)*/
        //diametrul = 2 Pi * r;


        double pi = 3.14;
        double r = 10;

        double area = pi * r * r;
        double circumf = 2*pi * r;

        System.out.printf("Circumferinta cercului este : %.2f si raza cercului este %f", circumf, area);

    }
}
