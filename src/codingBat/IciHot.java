package codingBat;

public class IciHot {

    //Given two temperatures, return true if one is less than 0 and the other is greater than 100.
    public static void main(String [] args){

        System.out.println("Temperature is :" + icyHot(120, -1));
    }

    public static boolean icyHot(int temp1, int temp2) {
        if((temp1 < 0 ) && (temp2 > 100) || (temp1>100 && temp2 <0)){
            return true;
        }
        return false;
    }

}
