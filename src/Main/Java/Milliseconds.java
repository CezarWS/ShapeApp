package Main.Java;

public class Milliseconds {
    public static void main(String[] args){
        // declare three variables : xHours, yMinutes, zSeconds
        // validate yMinutes, zSeconds
        // convert xHours to minutes
        // sum xHours in minutes to yMinutes
        // convert preious sum to seconds
        //sum yMinutes to zSeconds
        //convert previous sum to milis
        //print result
        int x = 34;
        int y = 32;
        int z = 44;

        int msInSec = z * 1000;
        int msToMin = y * 60 *1000;
        int msToHr =  x * 60 * 60 * 1000;
        int sum = (msInSec + msToMin + msToHr);
        System.out.println("Milliseconds sum is >> " + sum);


    }
}
