package complexNumber;

public class ComplexNr {
    private double imaginary;
    private double real;

    protected ComplexNr(double imaginary, double real) {
        this.imaginary = imaginary;
        this.real = real;
    }

    public ComplexNr add(ComplexNr n1) {
        ComplexNr temp = new ComplexNr(0.0, 0.0);
        temp.real = n1.real + this.real;
        temp.imaginary = n1.imaginary + this.imaginary;
        return temp;
    }
   

    public ComplexNr negate() {

            return new ComplexNr(-1 * this.real, -1 * this.imaginary);
            }


    public void multiply(ComplexNr nr) {
        //(a+bi)(c+di) = (ac−bd) + (ad+bc)i




    }

    public void equals(ComplexNr nr) {


    }

    public static void create(double real, double imaginary) {

    }

    @Override
    public String toString() {
        return "ComplexNr{" +
                "imaginary=" + imaginary +
                ", real=" + real +
                '}';
    }
}


