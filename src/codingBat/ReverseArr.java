package codingBat;

public class ReverseArr {
/*Given an array of ints length 3, return a new array with the elements in reverse order,
so {1, 2, 3} becomes {3, 2, 1}.
reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7] */

    public static void main(String[] args) {

        int[] myArr = new int[]{1, 2, 4, 6, 7,8};
        System.out.println(myArr);
        reverseArray(myArr);
        for (int i = 0; i < myArr.length; i++) {
            System.out.println("Numbers from array in reverse order are: " + myArr[i]);
        }

    }

    static int[] reverseArray(int[] arr) {
        //Interchange the first element with the last while reach the middle.
        int leftArr = 0;
        int rightArr = arr.length - 1;
        int temp = 0;

        while (leftArr < rightArr) {
            temp = arr[leftArr];
            arr[leftArr] = arr[rightArr];
            arr[rightArr] = temp;
            leftArr++;
            rightArr--;
        }
        return arr;
    }
}

