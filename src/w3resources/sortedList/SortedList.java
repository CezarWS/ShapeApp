package w3resources.sortedList;

import java.util.*;

public class SortedList{
    public static void main(String[] args){
        List<String> colorsList = new ArrayList<String>();
        colorsList.add("red");
        colorsList.add("blue");
        colorsList.add("yellow");

        Sorted sort = new Sorted();
        int compare = sort.compare("red", "blue");

        System.out.println("List sorted in alphabetical order is : " + compare);
    }



//    public List<String> sortedList(List<String> myList){
//        Collections.sort(myList);
//        int temp = 0;
//        for (int i = 1; i < myList.size() ; i++)
//            for (int j = i; j > 0; j--)
//            if (myList.get(j).equals("red")) {
//
//                }
//        return myList;
//    }



}

