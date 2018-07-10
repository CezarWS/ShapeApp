package w3resources;

import java.util.ArrayList;
import java.util.List;

public class SearchInArray {
    public static void main(String[] args){

        List<String> colorsList = new ArrayList<String>();
        colorsList.add("red");
        colorsList.add("blue");
        colorsList.add("yellow");
        colorsList.add(0,"white");
        for (int i = 0; i < colorsList.size(); i++) {
            String element = colorsList.get(i);
            if (element.contains("red")) {
                System.out.println("The searched color is : " + element + " and the index is :" +i);
            }
            else
                System.out.println("There is no such element!");

        }

    }
}
