package codingBat;

import java.util.ArrayList;
import java.util.List;

public class ThirdElement {
    /*Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
    middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
    middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
    middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]*/
public static void main(String[] args) {
    middleWay(new int[]{1, 2, 3, 5, 6}, new int[]{4, 5, 6, 8});

}
    static List<Integer> middleWay(int[]a, int[]b){
        List<Integer> newArray = new ArrayList<>();
        if (a.length % 2 == 1) {
            System.out.println("The array is odd. " + a[a.length / 2 ]); //elementul din mijloc pt array impar
            newArray.add(a[a.length / 2 ]);
        } else {
            System.out.println("The array is even" + a[a.length / 2] + " " + a[a.length / 2 - 1]); // pt unul par
            newArray.add(a[a.length / 2-1]);
            newArray.add(a[a.length / 2 ]);
        }
        if (b.length % 2 == 1) {
            System.out.println("The array is odd. " + b[b.length / 2]); //elementul din mijloc pt array impar
            newArray.add(b[b.length / 2 ]);
        } else {
            System.out.println("The array is even  " + b[b.length / 2] + " " + b[b.length / 2 - 1]); // pt unul par
            newArray.add(b[b.length / 2 ]);
            newArray.add(b[b.length / 2-1 ]);

        }
        System.out.println(newArray);


        return newArray;
    }

}
