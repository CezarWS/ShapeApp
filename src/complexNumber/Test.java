package complexNumber;

import javax.sound.midi.Soundbank;

public class Test {
    public static void main(String args[]){
        ComplexNr num = new ComplexNr(7,1);
        ComplexNr num2 = new ComplexNr(8,2);
        System.out.println(num.add(num2));
        System.out.println(num.negate());

    }
}
