import princeton.stdlib.StdOut;
import princeton.stdlib.StdIn;

public class aufgabe3 {
    public static void main(String[] args) {



                int number , reverse =  0;

                StdOut. print ( "Enter a number:" );
                number = StdIn.readInt ();
                while (number !=0)
                {
                    int remainder = number % 10;//% gives the decimal place
                    reverse = reverse * 10 + remainder;//times it by 10 moves the number one decimal place left.
                    number = number/10;//removes what has just been caculated
                }
                StdOut.println ( "Reverse of entered number:"  + reverse );


    }
}
