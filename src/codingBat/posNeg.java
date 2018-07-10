package codingBat;

public class posNeg {
//    Given 2 int values, return true if one is negative and one is positive.
// Except if the parameter "negative" is true, then return true only if both are negative.



    public static void main(String[] args){
        System.out.println("The negative parameter is " + posNeg(-1,34, true));
    }

    public static boolean posNeg(int a, int b, boolean negative) {

        if (negative) {
            return (a < 0 && b < 0);
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }}
