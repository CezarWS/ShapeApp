package codingBat;

public class JavaDemoCoding {
    private static Object s;

    //    Given a string, take the last char and return a new string with
// the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
    public static void main(String[] args) {
        System.out.println("The string is  : " + everyNth("Hello world!", 3));
    }


    public static String everyNth(String str, int n) {
        String result = "";

        // Look at every nth char
        for (int i = 0; i < str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }
}