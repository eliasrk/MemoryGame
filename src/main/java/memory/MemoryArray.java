package memory;


import princeton.stdlib.StdIn;
import princeton.stdlib.StdOut;

import java.util.Random;

public class MemoryArray {
    public static void main(String[] args) {
        System.out.println("den ´?´ verstecken sich Symbole, die paarweise vorkommen.Finden Sie diese!\n " +
                "Wählen Sie Zwei Positionen zum Aufdecken in der Form:Zeile1Spalte1Zeile2Spalte2,\n"  +
                "(Bsp. 2142 vergleicht das Symbol In Zeile 2 und Spalte 1 mit dem Symbol in Zeile 4 und Spalte 2):");




        createGameBoard(4, 4);





    }
    public static int getNextRandom(char[] array) {
        int rng = new Random().nextInt(array.length);
        return array[rng];
    }
    public static int[][] createGameBoard(int rows, int cols) {
        //eg number 4589
        int position = StdIn.readInt();
        int position2, position4;
        //creates second half(89)
        int position3 = position % 100;
        //creates first half(45)
        position = position /100;
        //creates second half of first pair(5)
        position2 = position %10;
        //creates second half of second pair(9)
        position4 = position3 %10;
        //creates first half of first pair(4)
        position = position/10;
        //creates first half of second pair(8)
        position3 = position3/10;
        System.out.print(" " + position + " " + position2);
        System.out.print(" " + position3 + " " + position4);
        //for proper indexing
        //position = position -1;
        position2 = position2 -1;
       // position3 = position3 -1;
        position4 = position4 -1;
        System.out.println();



        char[] option ={'§','$','%','&','(',')','=',':','§','$','%','&','(',')','=',':'};



        /*if I wanted to making it larger
            * System.out.println("wie gross?");
            * columns = StdIn.readInt();
            * int columns = 4; is to cap it at 4 until i figure it out
             **/  

            int columns = 4;
            rows = columns + 1;
            cols = columns;

        //making the answer table.
        char [][] symbolArray = new char[rows][cols];


        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if(row != 0) {


                    symbolArray[row][col] = (char) getNextRandom(option);

                }
            }
        }





        //creating the 1 to infinite of rows and columns number
        for (int header = 1; header < columns+ 1; header++) {
            if (header == 1){
                    StdOut.print("  ");

            }

            StdOut.print(" " + header );

        }


        //making the var array aka the ? symbols.
        char [][] array = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if(row != 0) {

                    array[row][col] = '?';
                }
            }
        }

        //Displaying the array
        for (int row = 0; row < rows; row++) {

            //fixing spacing
            if(row != 0) {
                System.out.print(row + " ");
                if (row <10){
                    System.out.print(" ");
                }
            }

            for (int col = 0; col < cols; col++) {
                int ten = row;
                //fixing spacing for above column 10
                if (col >9) {
                    if (row < 10) {

                        while (ten != 0) {


                            ten = ten / 10;
                            System.out.print(" ");
                            if (row > 9) {

                            }
                        }
                    }
                    if (row>=10){
                        if (col >=10){
                            System.out.print(" ");
                        }
                    }

                }

                if (row == position && col == position2){
                    System.out.print(symbolArray[row][col]+ " ");

                }else if(row == position3 && col == position4){
                    System.out.print(symbolArray[row][col]+ " ");
                }else{
                    System.out.print(array[row][col]+ " ");
                }

            }
            //fixing spacing
            System.out.println(" ");
        }

        System.out.println();


        for (int header = 1; header < columns+ 1; header++) {
            if (header == 1){
                StdOut.print("  ");

            }

            StdOut.print(" " + header );

        }

        // display symbol array

        for (int row = 0; row < rows; row++) {

            //fixing spacing
            if(row != 0) {
                System.out.print(row + " ");
                if (row <10){
                    System.out.print(" ");
                }
            }

            for (int col = 0; col < cols; col++) {
                int ten = row;
                //fixing spacing for above column 10
                if (col >9) {
                    if (row < 10) {

                        while (ten != 0) {


                            ten = ten / 10;
                            System.out.print(" ");
                            if (row > 9) {

                            }
                        }
                    }
                    if (row>=10){
                        if (col >=10){
                            System.out.print(" ");
                        }
                    }

                }

                System.out.print(symbolArray[row][col]+ " ");
            }
            //fixing spacing
            System.out.println(" ");
        }


        return createGameBoard(4,4);
    }
}