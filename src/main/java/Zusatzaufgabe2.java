import princeton.stdlib.StdIn;
import princeton.stdlib.StdOut;

public class Zusatzaufgabe2 {
    public static void main(String[] args) {
        int number,powerof, total = 0;
        StdOut. print ( "Enter a number of beans:" );
        number = StdIn.readInt ();
        number --;
        while (number != 0)
        {
            powerof = (int) Math.pow(2, number);
            number --;
            total = total + powerof;
        }
        total ++;
        StdOut.println ( "total beans:"  + total);
    }
}
