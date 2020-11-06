import princeton.stdlib.StdOut;
import princeton.stdlib.StdIn;

public class aufgabe3 {
    public static void main(String[] args) {



                int number , reverse =  0;

                StdOut. print ( "Enter a number:" );
                number = StdIn.readInt ();
                while (number !=0)
                {
                    int remainder = number % 10;
                    reverse = reverse * 10 + remainder;
                    number = number/10;
                }
                StdOut.println ( "Reverse of entered number:"  + reverse );


    }
}
