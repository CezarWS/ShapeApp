package Main.Java;

import java.awt.*;

public class AcceptAPositiveNr {
    /*7. Write a program to accept a positive number, not bigger than 1000 and check
    that the number is even or not. Prints 1 if the number is even or 0 if the number is odd.
    (check if they did the check)*/
    public static void main(String[] args) {
        int nr = -1;

        boolean isValid =(nr >= 0);

        boolean isEven = ((nr % 2) == 0);

        boolean isOdd = ((nr%2)!= 0);


        System.out.println(isEven ? 1 : 0);
        System.out.println(isValid ? "Numarul este valid" : "Numarul este negativ");
    }
}
