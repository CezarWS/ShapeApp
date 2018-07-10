package Main.Java;

import java.awt.datatransfer.SystemFlavorMap;

public class Variables {
    public static void main(String[] args) {
        byte b = 4;
        boolean trueFalse = true;
        int value = 4;
        double d = 3;
        float f = 4.99f;
        char c = 'd';
        char c1 = 123;

        int sum = value + c;
        double sum1 = value + d;
        boolean greaterValue = value > 4;
        boolean dGreaterThan = d >= 100;
        boolean bothTrue = greaterValue || !dGreaterThan;

        int a1 = 5;
        int a2 = 8;
        int result = a1 > a2 ? a1 : a2;
        System.out.println("Result = " +  result);

    }
}