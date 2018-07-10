package Main.Java;

import java.sql.SQLOutput;

public class TriangleLenght {
    public static void main(String[] args) {
        int a = 50;
        int b = 50;
        int c = 100;

        boolean abGreaterThanC = (a + b) > c;
        boolean bcGreaterThanA = (b + c) > a;
        boolean caGreaterThanB = (c + a) > b;

        boolean abGrC = (a * a) + (b * b) == (c * c);
        boolean bSQcGrB = (a * a) + (c * c) == (b * b);
        boolean bSQcGrA = (b * b) + (c * c) == (a * a);

        boolean isTriangle = (abGrC) && (bSQcGrB) && (bSQcGrA);
        boolean isRightAngleTriangle = (abGrC) || (bSQcGrB) || (bSQcGrA);

        System.out.println("The triangle is right angeled " + (isTriangle && isRightAngleTriangle));
    }
}