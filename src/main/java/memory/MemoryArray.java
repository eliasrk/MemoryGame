package memory;


import princeton.stdlib.StdIn;
import princeton.stdlib.StdOut;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MemoryArray {
    public static void main(String[] args) {
        System.out.println("den ´?´ verstecken sich Symbole, die paarweise vorkommen.Finden Sie diese!\n " +
                "Wählen Sie Zwei Positionen zum Aufdecken in der Form:Zeile1Spalte1Zeile2Spalte2,\n" +
                "(Bsp. 2142 vergleicht das Symbol In Zeile 2 und Spalte 1 mit dem Symbol in Zeile 4 und Spalte 2):");
        char[][] symbolArray = new char [5][5] ;

        createGameBoard(4, 4,symbolArray);


    }

    public static Integer[] randomNumb(Integer[] intArray) {



        List<Integer> intList = Arrays.asList(intArray);

        Collections.shuffle(intList);

        intList.toArray(intArray);

        return intArray;
    }


    public static int[][] createGameBoard(int rows, int cols, char[][]symbolArray) {
        /* code to make it larger
         * if I wanted to making it larger
         * System.out.println("wie gross?");
         * columns = StdIn.readInt();
         **/

        //setting a columns at 4 however can be made larger

        int columns = 4;
        rows = columns + 1;
        cols = columns;
        //randomly picking from 1 to 16
        Integer[] intArray= { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //the options for the answer table to made out of
        char[] option ={'§','$','%','&','(',')','=',':','§','$','%','&','(',')','=',':'};
        boolean fact = true;
        int  round = 1;


        randomNumb(intArray);
        //Creating answer array

            int count = 0;
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    if (row != 0) {
                        symbolArray[row][col] = option[intArray[count]];
                        count++;


                    }

                }
            }



            //Creating the gameboard.
        while (fact == true) {

            //eg number given by player 4589
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
            //for proper indexing
            position2 = position2 -1;
            position4 = position4 -1;
            System.out.println();

            //row and column number
            for (int header = 1; header < columns + 1; header++) {
                if (header == 1) {
                    StdOut.print("  ");

                }

                StdOut.print(" " + header);

            }

            //making the var array aka the ? symbols.
            char[][] array = new char[rows][cols];
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    if (row != 0) {

                        array[row][col] = '?';
                    }
                }
            }

            //Displaying the array for the user
            for (int row = 0; row < rows; row++) {

                //fixing spacing if size is changed by the user
                if (row != 0) {
                    System.out.print(row + " ");
                    if (row < 10) {
                        System.out.print(" ");
                    }
                }

                for (int col = 0; col < cols; col++) {
                    int ten = row;

                    //fixing spacing for above column 10
                    if (col > 9) {
                        if (row < 10) {
                            while (ten != 0) {

                                ten = ten / 10;
                                System.out.print(" ");
                                if (row > 9) {

                                }
                            }
                        }
                        if (row >= 10) {
                            if (col >= 10) {
                                System.out.print(" ");
                            }
                        }
                    }

                    if (row == position && col == position2) {
                        System.out.print(symbolArray[row][col] + " ");

                    } else if (row == position3 && col == position4) {
                        System.out.print(symbolArray[row][col] + " ");
                    } else {
                        System.out.print(array[row][col] + " ");
                    }

                }
                //fixing spacing
                System.out.println(" ");
            }

            //attempt to get a checking system
            if (symbolArray[position][position2] == symbolArray[position3][position4]) {
                System.out.print("Treffer, Super…");
                System.out.println();
                System.out.print(round + " mal versucht");
                System.exit(1);

            }
                else {
                    System.out.println("Leider kein Treffer" );
                    //adding and subtract 1 in position2 and 4 is due to indexing issues correct by line 94
                    position2++;
                    position4++;
                    System.out.println(position + ", " + position2  + " und " +
                            position3 + ", " + position4 + " passt nicht");
                    position2--;
                    position4--;
                    System.out.println(" ");
                    System.out.println("Neue Positionen ausprobieren");

                round++;

                }

            }
        return createGameBoard(4,4,symbolArray);
    }
}