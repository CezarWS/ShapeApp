package arrayList;

import java.util.List;

public class ArrayListImpl implements MyList{
    private int[] myArr ;


    @Override
    public int get(int index) {
        ensureListLenght(index);
        System.out.println("Getting " + myArr[index] + " from " + index);
        return myArr[index];

    }

    @Override
    public void put(int index, int value) {
        ensureListLenght(index);
        myArr[index] = value;

        System.out.println("Adding " + value + " at index " + index);

        }

    private void ensureListLenght(int index) {
        if (myArr == null){
            myArr = new int[index *2 +1];

        }
        else
         {
            if (index > myArr.length) {
                {
                int[] newArray = new int[index * 2];
                for (int i = 0; i < myArr.length; i++) {
                    newArray[i] = myArr[i];
                }
                myArr = newArray;
                }

            }
    }
    }


    @Override
    public int length() {

        return myArr.length;
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i <myArr.length ; i++) {
            if (value == myArr[i]){
                return true;
            }
        }
        return false;
    }

    @Override
    public void addAll(MyList other) {

        int initialLenght =  myArr.length;
        ensureListLenght(myArr.length + other.length());
        for (int i = 0; i < other.length() ; i++) {
            myArr[initialLenght++] = other.get(i);

        }

    }
}
