package Main.Java;

public class Triangle {

    public static void main(String[] args){
        int a = 17;
        int b = 142;
        int c = 58;

        int sum = a + b + c;
        boolean sumIs180  = (sum == 180);
        boolean aIs90 = a == 90;
        boolean bIs90 = a == 90;
        boolean cIs90 = a == 90;
        boolean oneAngleIs90 = aIs90 || bIs90 || cIs90;

        System.out.print(sumIs180 && oneAngleIs90 ? "Right angle triangle" : "Not a triangle or not a right angle triangle");
    }
}
