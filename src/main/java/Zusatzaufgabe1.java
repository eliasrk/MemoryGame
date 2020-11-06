import princeton.stdlib.StdIn;
import princeton.stdlib.StdOut;


public class Zusatzaufgabe1 {
    public static void main(String[] args) {

        StdOut.print("Enter a year:");
        int number;
        number = StdIn.readInt();
        if (number % 4 == 0) {
            System.out.println("Leap Year");
            boolean leapyear = true;
        }else {
            System.out.println("Not a Leap Year");
            boolean leapyear = false;
        }

        }
    }
