package Main.Java;

import java.util.Scanner;

public class AcceptThreeInts {
    /*8. Write a program that accepts three integers from the user and return true if the second number
     is greater than the first number and third number is greater than second number. Consider also a
     condition which if it is true, the second number does not need to be greater than first number.
      */
    public static void main(String[] args){
        //input 3 ints;
        //1.return true if the second > first && thrid > second

             ThreeNumbers();

             //Stiam deja chestia cu clasa Scanner si cum se foloseste
            // si nu m-am putut abtine :))) Dar tot cu boolean am facut ;)
    }

            public static void ThreeNumbers() {
                Scanner mynums = new Scanner(System.in);
                System.out.println("Enter first number: ");
                int first = mynums.nextInt();
                System.out.println("Enter second number: ");
                int second = mynums.nextInt();
                System.out.println("Enter third number: ");
                int third = mynums.nextInt();


                boolean secGrThanFirst = ((second > first));
                boolean thrdGrThanSec = ((third > second));
                boolean firstEqSecond = ((second == first));
                System.out.println(secGrThanFirst && thrdGrThanSec ? true : false);
                System.out.println(firstEqSecond ? true: false);

                //asta am inteles din conditia aia de la sfarsit,ca ar putea fi si egale
//
//        }
        }
}



