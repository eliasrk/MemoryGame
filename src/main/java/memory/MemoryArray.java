package memory;


import princeton.stdlib.StdIn;
import princeton.stdlib.StdOut;

public class MemoryArray {
    public static void main(String[] args) {
        createGameBoard();

    }

    public static int[][] createGameBoard() {

            System.out.println("how big?");
            int columns = StdIn.readInt();
            int rows,cols;
            rows = columns + 1;
            cols = columns;


        for (int header = 1; header < columns+ 1; header++) {
            if (header == 1){
                    StdOut.print(" ");

            }
            StdOut.print(" " + header + );

        }


        char [][] array = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if(row != 0) {

                    array[row][col] = '?';
                }
            }
        }


        for (int row = 0; row < rows; row++) {

            if(row != 0) {
                System.out.print(row + " ");
            }
            for (int col = 0; col < cols; col++) {
                int ten = row;

                if (col >9) {

                    while (ten !=0 && row <=9) {

                        ten = ten / 10;
                        System.out.print(" ");
                    }
                }
                System.out.print(array[row][col]+ " ");
            }
            System.out.println(" ");
        }
        return createGameBoard();
    }
}