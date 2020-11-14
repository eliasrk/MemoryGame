package memory;

import princeton.stdlib.StdIn;

public class Memory {

    public static void Nothing() {
        String[][] gameBoard = {{"  ", "1", " 2", " 3", " 4"},
                {"1 ", "?", " ?", " ?", " ?"},
                {"2 " + "? " + "? " + "? " + "?"},
                {"3 " + "? " + "? " + "? " + "?"},
                {"2 " + "? " + "? " + "? " + "?"}};
        String[][] gameBoardcomplete = {{"  ", "1", " 2", " 3", " 4"},
                {"1 ", "§ ", "( ", "% ", "-"},
                {"2 " + "- " + "( " + "% " + "#"},
                {"3 " + "& " + "$ " + "* " + "$"},
                {"2 " + "& " + "* " + "# " + "§"}};
        for (String[] row : gameBoard) {
            for (String c : row) {
                System.out.print(c);
            }
            System.out.println();

        }

        int position;
        System.out.println("where would you like to remove?");
        position = StdIn.readInt();



    }
    public static void main(String[] args) {
    Nothing();
    }
}
