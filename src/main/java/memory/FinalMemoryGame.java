package memory;

import princeton.stdlib.StdIn;
import princeton.stdlib.StdOut;

import static princeton.stdlib.StdRandom.shuffle;
final class split {
    static int position,position2, position3, position4;
    public split(int position,int position2,int  position3,int position4) {
        this.position = position;
        this.position2 = position2;
        this.position3 = position3;
        this.position4 = position4;
    }
}
public class FinalMemoryGame {
    static int columns,rows,cols;
    static int round;
    static boolean loop;
    public static split numberSplit(){
        int position,position2,position3,position4;
        position = StdIn.readInt();
        //creates second half(89).
        position3 = position % 100;
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
        return new split(position,position2,position3,position4);
    }
    public static void Welcome(){
        System.out.println("den ´?´ verstecken sich Symbole, die paarweise vorkommen.Finden Sie diese!\n " +
                "Wählen Sie Zwei Positionen zum Aufdecken in der Form:Zeile1Spalte1Zeile2Spalte2,\n" +
                "(Bsp. 2142 vergleicht das Symbol In Zeile 2 und Spalte 1 mit dem Symbol in Zeile 4 und Spalte 2):");
        System.out.println("wie gross?(4,6,8)?");
        columns = StdIn.readInt();
        while (columns>8){
            columns--;
        }
        while (columns<4){
            columns++;
        }
        rows = columns + 1;
        cols = columns;
    }
    public static char[] Option(int columns){

        char[] option;
        char[] option1;
        char[] option2;
        char[] option3 ={'§','$','%','l','(',')','=',':'};
        char[] option6;

        if(columns == 8){
            char[] eight ={'#','A','c','<','>','Ä','z','v','s','h'
                    ,'~','y','o','!','@','|','*','_','-','B'
                    ,'^','°','²','³'};
            option2 = new char[eight.length + option3.length];
            System.arraycopy(eight, 0, option2, 0, eight.length);
            System.arraycopy(option3, 0, option2, eight.length, option3.length);

            option1 = option2;
            option = new char[option1.length + option2.length];
            System.arraycopy(option1, 0, option, 0, option1.length);
            System.arraycopy(option2, 0, option, option1.length, option2.length);

        }else if(columns ==6){
            char[] six ={'#','A','c','<','>','Ä','z','v','s','h'};
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

        return option;
    }
    public static char[][] Answerboard(char[][]symbolArray){

        int count = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (row != 0) {
                    symbolArray[row][col] = Option(columns)[count];
                    count++;
                }
            }
        }

        return symbolArray;
    }
    public static char[][] Array(){

        char[][] array = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (row != 0) {
                    array[row][col] = '?';
                }
            }
        }

        return array;
    }
    public static void Check(char[][]symbolArray){
        if (symbolArray[split.position][split.position2] == symbolArray[split.position3][split.position4]) {
            System.out.print("Treffer, Super…");
            System.out.println();
            System.out.print(round + " mal versucht");
            loop = false;
            System.exit(1);
        }
        else {
            System.out.println("Leider kein Treffer" );
            //adding and subtract 1 in position2 and 4 is due to indexing issues correct by line 94.
            split.position2++;
            split.position4++;
            System.out.println(split.position + ", " + split.position2  + " und " +
                    split.position3 + ", " + split.position4 + " passt nicht");
            System.out.println("Neue Positionen ausprobieren");
            round++;
        }
    }
    public static int[][] createGameBoard(char[][]symbolArray) {
        if (round ==0) {
            System.out.println("Positionen ausprobieren");
        }
        numberSplit();

        for (int header = 1; header < columns + 1; header++) {
            if (header == 1) {
                StdOut.print("  ");
            }
            StdOut.print(" " + header);
        }


        Array();
        for (int row = 0; row < rows; row++) {
            //fixing spacing if size is changed by the user.
            if (row != 0) {
                System.out.print(row + " ");
                if (row < 10) {
                    System.out.print(" ");
                }
            }
            for (int col = 0; col < cols; col++) {
                if (row == split.position && col == split.position2) {
                    System.out.print(symbolArray[row][col] + " ");
                } else if (row == split.position3 && col == split.position4) {
                    System.out.print(symbolArray[row][col] + " ");
                } else {
                    System.out.print(Array()[row][col] + " ");
                }
            }
            //Fixing spacing.
            System.out.println(" ");
        }

        Check(symbolArray);

        return createGameBoard(symbolArray);
    }
    public static void main(String[] args) {
        char[][] symbolArray = new char [100][100];
        Welcome();
        Answerboard(symbolArray);
        createGameBoard(symbolArray);

    }
}