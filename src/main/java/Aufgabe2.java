import princeton.stdlib.StdIn;

public class Aufgabe2 {
    public static void main(String[] args) {
        System.out.println("Enter the Number of Rows:");
        int number = StdIn.readInt();


        boolean changer = true;

        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= i; j++) {

                if (changer) {
                    System.out.print("1");

                } else {
                    System.out.print("0");

                }
                changer = !changer;
            }
                System.out.println();
            }
        }
    }
