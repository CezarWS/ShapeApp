package codingBat;

import java.util.Objects;

//We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
public class IsTeen {
    public static void main (String[] args){
        System.out.println("The number is  :" + loneTeen(25, 13)) ;

    }


    public static boolean loneTeen(int a, int b) {
        if (((a >= 13) && (a > 19)) || (b < 13)&&(b <= 19)) {
            return true;
//            (((a >= 13) && (a <= 19))
        }
        return false;
    }
    }

//True >> a teen si b not teen
//        a not teen si b teen

