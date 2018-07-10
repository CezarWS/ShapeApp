package halfAndPrint;

public class Print implements Function {

    @Override
    public int evaluate(int value) {

        System.out.println(" The int value is : " + value);
        return value;
    }
}
