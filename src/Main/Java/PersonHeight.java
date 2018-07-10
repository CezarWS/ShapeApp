package Main.Java;

public class PersonHeight {
    public static void main(String[] args) {
        /*5. Write a program that converts the height of a person from feet
        and inches (e.g 5 feet 10 inches) to centimeters (178cm). The value should be integer. To convert a double
        value to an integer, you can use the cast operator: double d = 33.4; int i = (int)d; // i will be 33;*/
        //convert cm in inch
        //convert from inch to feet

        int cm = 183;
        int inch = 253;
        int feet = 334;

        double cmToInch = cm * 0.394;
        double inchToFeet = cmToInch / 12;

        double leftInches = cmToInch % 12;

        System.out.printf("A person has : " + inchToFeet + " inch" + " and : " + leftInches + "feet");


    }
}
