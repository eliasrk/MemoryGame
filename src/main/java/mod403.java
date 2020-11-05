import edu.princeton.stdlib.StdIn;
import edu.princeton.stdlib.StdOut;

public class mod403 {
    public static void main(String[] args) {
        System.out.println("hello world");

        int numberOne = 12;
        Integer numberTwo = 30;

        if (numberOne < 50) {
            System.out.println("hello everyone");
        } else {
            System.out.println("nope");
        }

        boolean trueOrFalse = false;

        int numberThree = numberTwo > 18 ? 50 : 100;

        switch (numberThree) {
            case 12:
                System.out.println("First");
            case 15:
                System.out.println("Second");
            default:
                System.out.println("Now");
        }
        //schleifen
        for (int x = 0; x > 10; x++) {
            System.out.println(x);
        }
        while (numberOne < 20) {
            System.out.println(numberOne);
            numberOne++;
        }
        do {
            numberOne++;
        } while (numberOne < 30);

        for (int x = 1; x <= 10; x++) {
            if (x == 5) {
                break;
            }
            if (x == 7) {
                break;
            }
            System.out.println(x);
        }
        int z = 12;
        while (z < 50) {
            if ( z == 20); {
                continue;
            }
                z++;
        }
        StdOut.print("hello");
        int number = StdIn.readInt();

    }
}