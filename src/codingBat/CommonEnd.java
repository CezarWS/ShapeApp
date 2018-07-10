package codingBat;

public class CommonEnd{
/*Given 2 arrays of ints, a and b, return true if they have the same first element
or they have the same last element. Both arrays will be length 1 or more.
commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true */
public static void main(String[] args){
    checkIfValid(new int[] {1}, new int[]{3});
    System.out.println("For the given array, the common elements are: " + commonNrs(new int[] {1,2,3}, new int[]{7,3} ) );


}
    static void checkIfValid(int[] a, int[] b) {
        for (int i = a.length - 1; i >= 0; i--)
            for (int j = b.length - 1; j >= 0; j--) {
                if (i < 1 && j < 1) {
                    System.out.println("Array is not valid");

                }
            }
    }
    // Cum pot sa pun o conditie ca sa nu mai continue cu evaluarea metodei commonNrs ,daca array-ul nu este valid?

    static boolean commonNrs(int[] a,int[]b) {
        int firstElementA = a[0];
        int firstElemetB = b[0];
        int lastElementA = a[a.length-1];
        int lastElementB = b[b.length-1];
        for (int i = 0; i < a.length-1; i++)
            for (int j = 0; j <b.length-1 ; j++)
            if (firstElementA == firstElemetB || lastElementA == lastElementB) {

                return true;
            }
        return false;
    }



}
