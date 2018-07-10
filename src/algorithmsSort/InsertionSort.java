package algorithmsSort;

public class InsertionSort {
    /*
1. Write a function that receives an array and returns a new array sorted by insertion sort.
pentru 1 <= i< n { copiaza x[i] in temp;
deplaseaza la dreapta toate valorile > temp,
cu indici j, i-1 >= j >= 0inlocuieste ultimul element deplasat cu temp
}
*/
    public static void main(String[] args){
        int[] myArr = {44,3,12,6,87,9};
        sortedArray(myArr);
        for (int nr : myArr) {
            System.out.println(nr);

        }


}
    public static int[] sortedArray(int[] a){
        int temp = 0;
        for (int i = 1; i < a.length ; i++) {
            for (int j = i; j > 0  ; j--) {
                if (a[j] > a[j-1]){
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }

            }
        }
        return a;
    }
}

