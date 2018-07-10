package codingBat;

public class frontBack {

    public static void main(String[] args){
        System.out.println("FRONT back of the string is :" + frontBack("HelloWorld"));
    }


    public static String frontBack(String str) {
            if (str.length() <= 1 )
                return str;
            String strn = str.substring(1, str.length()-1);

        return str.charAt(str.length()-1) + strn + str.charAt(0);

    }

}
