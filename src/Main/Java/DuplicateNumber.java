package Main.Java;

import java.util.ArrayList;
import java.util.List;


    /*You have got a range of numbers between 1 to N, where one of the number is
    repeated. You need to write a program to find out the duplicate number.*/
    public class DuplicateNumber {
        public int findDuplicateNumber(List<Integer> numbers){
            int highestNr = numbers.size()-1;
            int total = getSum(numbers);
            int duplicate = total - (highestNr*(highestNr+1)/2);
            return  duplicate;
        }

        public int getSum(List<Integer> numbers){
            int sum = 0;
            for (int nr : numbers) {
                sum += nr;

            }
            return sum;


            }

        public static void main(String[] args){
            List<Integer> numbers = new ArrayList<Integer>();
            for (int i = 1; i < 30 ; i++) {
                numbers.add(i);
            }
            numbers.add(22);
            DuplicateNumber dn = new DuplicateNumber();
            System.out.println("Duplicate number is : " + dn.findDuplicateNumber(numbers));

            }

        }
