package halfAndPrint;

public class Test {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        Compute calculate = new Compute();
        Print printValue  = new Print();
        calculate.compute(numbers, printValue);
        Half halfArr = new Half();
        int[] halfNumber = calculate.compute(numbers, halfArr);
        calculate.compute(halfNumber, printValue);
    }
}
