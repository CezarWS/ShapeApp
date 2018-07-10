package codingBat;

public class Numbers23 {
    /*Given an int array length 2, return true if it does not contain a 2 or 3.

no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false*/

    public static void main(String[] args){


        int[] myarr = new int[] {4,2};
        for (int nr: myarr) {
            System.out.println(nr);
        }

        System.out.println(no23(myarr));

    }
    public static boolean no23(int[] nums) {
        return (nums[0] !=2 && nums[1] !=3 && nums[1] != 2 && nums[0] !=3);
    }

}

