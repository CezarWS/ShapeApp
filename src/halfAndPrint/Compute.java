package halfAndPrint;

public class Compute {
    public int[] compute (int[] array, Function func){
        int[] newArr = new int[array.length];

        for (int i = 0; i < array.length ; i++) {
            newArr[i] = func.evaluate(array[i]);
        }

        return newArr;
        }


    }

