import princeton.stdlib.StdIn;

public class Aufgabe1 {
    public static void main(String[] args) {
        System.out.println("Enter an Integer number:");
        StdIn:
        if ( StdIn % 2 == 0 )
            System.out.println("Entered number is even");
        else
            System.out.println("Entered number is odd");
    }
}

