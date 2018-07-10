package w3resources;

import java.util.ArrayList;
import java.util.List;

public class NewArray {
    public static void main(String[] args ){
        List<String> colorsList = new ArrayList<String>();
        colorsList.add("red");
        colorsList.add("blue");
        colorsList.add("yellow");
        colorsList.add(0,"white");
        System.out.println(colorsList);
        String newElement = colorsList.set(3,"brown");
        System.out.println("Updated element : " + newElement);
         System.out.println("Udated array is : " + colorsList);
         System.out.println("Element at index 3 is : " + colorsList.get(3));         
        try {
            String removedElement = colorsList.remove(1);
            String removedElement1 = colorsList.remove(2);
            String removedElement2 = colorsList.remove(3);


            System.out.println("Element removed : " + removedElement + removedElement1 + removedElement2);

        }
        catch (IndexOutOfBoundsException exeption){

     System.out.println("Element cannot be removed");

        }
          System.out.println(colorsList);
    }
}
    

