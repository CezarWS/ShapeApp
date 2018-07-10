package Main.Java;

public class CmToFeetAndInch {
        /*6. Write a program that converts the height of a person from centimeters to feet and inches.
         The printed values should be two integers.
        */
    public static void main(String[] args){
        //convert from cm to feet
        //convert from cm to inches
        //print as integers

        int cm = 185;

        double cmToInch = cm* 0.393;
        int firstValue = (int) cmToInch;
        double cmToFeet = cm * 0.032;
        int secondValue = (int) cmToFeet;

        System.out.printf("Conversion from cm to inch is : " + firstValue + " and conversion from cm to feet is  : " + secondValue);

    }

}
