package memory;

import princeton.stdlib.StdIn;
import princeton.stdlib.StdOut;

import java.util.Random;


public class ClassInstruction {
    public static int getNextRandom(int bounds){
        Random rng = new Random();
        rng.nextInt(bounds);
        return 0;
    }
    public static int[][] createGameBoard(int rows, int cols){


        int [][] array = new int[rows][cols];

        for (int row = 0; row < rows; row++){
            for (int col = 0; col <cols; col++){
                array[row][col] = getNextRandom((rows * cols)/2);
            }
        }
        return array;
    }
    public static void main(String[] args) {
        StdOut.print("size of ");
        int size = StdIn.readInt();
        int [] list = new int [size];
        for (int j : list)
            StdOut.print(j + "");
    int[][] game = createGameBoard(10,5);
    }
}
