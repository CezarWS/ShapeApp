package codingBat;

public class Dividedto3or5 {
//    Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
// Use the % "mod" operator

    public static void main(String[] args ){
        System.out.println("Given number is multiple of 3 or 5: " + or35(35));
    }

    public static boolean or35(int n) {
        while (n > 0) {
            if ((n % 3 == 0) || (n % 5 == 0))
                return true;

        }
        return false;
    }
}