package codingBat;


import java.util.Arrays;

public class Array1_first_last {
    /*Given an array of ints, return true if 6 appears as either the first
     or last element in the array. The array will be length 1 or more.
firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
 */
    public static void main(String[] args){

        System.out.println("Are numbers 0 or 6 on the first or last position ?  " + firstLast6(new int[] {1,2,6}));
        }

    static boolean firstLast6(int[] nums) {
        int firstNr = nums[0];
        int lastNr = nums[nums.length - 1];

        for (int number : nums) {
            if ((firstNr == 0) || (lastNr == 6)){
            return true;
            }
        }
            return  false;
    }
}






