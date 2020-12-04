package memory;

import princeton.stdlib.StdIn;
import princeton.stdlib.StdOut;
import static princeton.stdlib.StdRandom.shuffle;

public class FinalMemoryGame {
    public static void main(String[] args) {

        Welcome();
        int columns = StdIn.readInt();
        while(columns>6){
            System.out.println(columns + " ist zu gröss");
            columns--;
        }
        char[][] symbolArray = new char [100][100];
        createGameBoard(symbolArray,columns);
    }
    public static char[] Option(int columns){

        char[] option;
        char[] option1;
        char[] option2;
        char[] option3 ={'§','$','%','&','(',')','=',':'};
        char[] option6;


        if(columns == 5){
            char[] five ={'#','A','c','<','>'};
            option2 = new char[five.length + option3.length];
            System.arraycopy(five, 0, option2, 0, five.length);
            System.arraycopy(option3, 0, option2, five.length, option3.length);

            option1 = option2;
            option = new char[option1.length + option2.length];
            System.arraycopy(option1, 0, option, 0, option1.length);
            System.arraycopy(option2, 0, option, option1.length, option2.length);

        }else if(columns ==6){
            char[] six ={'#','A','c','<','>','Ä','z','v','s','h','Ü'};
            option6 = new char[six.length + option3.length];
            System.arraycopy(six, 0, option6, 0, six.length);
            System.arraycopy(option3, 0, option6, six.length, option3.length);

            option1 = option6;
            option = new char[option1.length + option6.length];
            System.arraycopy(option1, 0, option, 0, option1.length);
            System.arraycopy(option6, 0, option, option1.length, option6.length);
        }
        else {
            option1 = option3;
            option = new char[option1.length + option3.length];
            System.arraycopy(option1, 0, option, 0, option1.length);
            System.arraycopy(option3, 0, option, option1.length, option3.length);
        }
        shuffle(option);
    return option;}
    public static void Welcome(){
        System.out.println("den ´?´ verstecken sich Symbole, die paarweise vorkommen.Finden Sie diese!\n " +
                "Wählen Sie Zwei Positionen zum Aufdecken in der Form:Zeile1Spalte1Zeile2Spalte2,\n" +
                "(Bsp. 2142 vergleicht das Symbol In Zeile 2 und Spalte 1 mit dem Symbol in Zeile 4 und Spalte 2):");
        System.out.println("wie gross?(4-6)?");
    }
    public static int[][] createGameBoard( char[][]symbolArray,int columns) {
        System.out.println("Positionen ausprobieren");
        //setting a columns at 4 however can be made larger.
        int rows = columns + 1;
        int cols = columns;

        //the options for the answer table.
        Option(columns);
        boolean loop = true;
        //round is which round the player is in.
        int  round = 1;
        //Count is for where in the char array to select from.
        int count = 0;
        //Creating answer array
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    if (row != 0) {
                        symbolArray[row][col] = Option(columns)[count];
                        count++;
                    }
                }
            }
            //Creating the gameboard.
        while (loop) {
            //eg number given by player 4589.
            int position = StdIn.readInt();
            int position2, position4;
            //creates second half(89).
            int position3 = position % 100;
            //creates first half(45).
            position = position /100;
            //creates second half of first pair(5).
            position2 = position %10;
            //creates second half of second pair(9).
            position4 = position3 %10;
            //creates first half of first pair(4).
            position = position/10;
            //creates first half of second pair(8).
            position3 = position3/10;
            //for proper indexing
            position2 = position2 -1;
            position4 = position4 -1;
            System.out.println();
            //row and column number.
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
            //Displaying the array for the user.
            for (int row = 0; row < rows; row++) {
                //fixing spacing if size is changed by the user.
                if (row != 0) {
                    System.out.print(row + " ");
                    if (row < 10) {
                        System.out.print(" ");
                    }
                }
                for (int col = 0; col < cols; col++) {
                    int ten = row;
                    //fixing spacing for above column 10.
                    if (col > 9) {
                        if (row < 10) {
                            while (ten != 0) {
                                ten = ten / 10;
                                System.out.print(" ");
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
                //Fixing spacing.
                System.out.println(" ");
            }
            //Checking system sees if.
            if (symbolArray[position][position2] == symbolArray[position3][position4]) {
                System.out.print("Treffer, Super…");
                System.out.println();
                System.out.print(round + " mal versucht");
                loop = false;
                System.exit(1);
            }
                else {
                    System.out.println("Leider kein Treffer" );
                    //adding and subtract 1 in position2 and 4 is due to indexing issues correct by line 94.
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
        return createGameBoard(symbolArray,columns);
    }
}















