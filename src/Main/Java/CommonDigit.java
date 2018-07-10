package Main.Java;

public class CommonDigit {

    /*9. Write a program that accepts 2 integers values as input between 13 and 89 and prints true
    if there is a common digit in both numbers. Example: x=34, y=48, the output should be true.
     */
    public static void main(String [] args){
        //input 2 numbers
        // check if numbers are in the given range
        //obtain every digit by cutting a numbers starting at the end
        //check if there are commmon digits in the given nr
        //print the result

        int first = 23;
        int second = 39;


        boolean firstValid = (first>=13 && first<=89);
        boolean secondValid = ((second >= 13) && (second <= 89));

        int firstA = first % 10;
        int firstB = first / 10;
        int secondA = second % 10;
        int secondB = second /10;

        boolean result = ((firstValid && secondValid && (firstA == secondA)) || (firstA == secondB) ||
                (secondA == firstA) || (secondA == firstB)) ? true : false;
        System.out.println("There are common digits? :" + result);



//                a = nr1 % 10 ( a= 3), b = nr1 / 10 (b= 2)
//                c = nr2 % 10 (c=8) , d= nr2/10 (d= 3)
//
//                a = c, a=d
//                        b= c, b ==d;
    }

}
