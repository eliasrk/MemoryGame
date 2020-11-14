package memory;

import princeton.stdlib.StdIn;

public class Memory {

    public static void main(String[] args) {
        char[][] gameBoard1 = {{' ', '1', '2', '3', '4'},
                {'1', '?', '?', '?', '?'},
                {'1', '?', '?', '?', '?'},
                {'1', '?', '?', '?', '?'},
                {'1', '?', '?', '?', '?'}};
        char[][] gameBoard = {{' ', '1', '2', '3', '4'},
                {'1', '?', '?', '?', '?'},
                {'1', '?', '?', '?', '?'},
                {'1', '?', '?', '?', '?'},
                {'1', '?', '?', '?', '?'}};
        String[][] gameBoardcomplete = {{"  ", "1", " 2", " 3", " 4"},
                {"1 ", "§ ", "( ", "% ", "-"},
                {"2 " + "- " + "( " + "% " + "#"},
                {"3 " + "& " + "$ " + "* " + "$"},
                {"2 " + "& " + "* " + "# " + "§"}};
        for (char[] row : gameBoard1) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();

        }
        int check1 = 0, check2 = 0;
        int game = 1;
        while (game == 1) {


            int position, position1;

            System.out.println("where would you like to remove?");
            position = StdIn.readInt();
            System.out.println("where would you like to remove?");
            position1 = StdIn.readInt();
            gameBoard = gameBoard1;
            switch (position) {
                case 1 -> {
                    gameBoard[1][1] = '§';
                    check1 = 1;
                }
                case 2 -> {
                    gameBoard[1][2] = '(';
                    check1 = 2;
                }
                case 3 -> {
                    gameBoard[1][3] = '%';
                    check1 = 3;
                }
                case 4 -> {
                    gameBoard[1][4] = '-';
                    check1 = 4;
                }
                case 5 -> {
                    gameBoard[2][1] = '-';
                    check1 = 5;
                }
                case 6 -> {
                    gameBoard[2][2] = '(';
                    check1 = 6;
                }
                case 7 -> {
                    gameBoard[2][3] = '%';
                    check1 = 7;
                }
                case 8 -> {
                    gameBoard[2][4] = '#';
                    check1 = 8;
                }
                case 9 -> {
                    gameBoard[3][1] = '&';
                    check1 = 9;
                }
                case 10 -> {
                    gameBoard[3][2] = '$';
                    check1 = 10;
                }
                case 11 -> {
                    gameBoard[3][3] = '*';
                    check1 = 11;
                }
                case 12 -> {
                    gameBoard[3][4] = '$';
                    check1 = 12;
                }
                case 13 -> {
                    gameBoard[4][1] = '&';
                    check1 = 13;
                }
                case 14 -> {
                    gameBoard[4][2] = '*';
                    check1 = 14;
                }
                case 15 -> {
                    gameBoard[4][3] = '#';
                    check1 = 15;
                }
                case 16 -> {
                    gameBoard[4][4] = '§';
                    check1 = 16;
                }
            }
            switch (position1) {
                case 1 -> {
                    gameBoard[1][1] = '§';
                    check2 = 1;
                }
                case 2 -> {
                    gameBoard[1][2] = '(';
                    check2 = 6;
                }
                case 3 -> {
                    gameBoard[1][3] = '%';
                    check2 = 7;
                }
                case 4 -> {
                    gameBoard[1][4] = '-';
                    check2 = 5;
                }
                case 5 -> {
                    gameBoard[2][1] = '-';
                    check2 = 4;
                }
                case 6 -> {
                    gameBoard[2][2] = '(';
                    check2 = 2;
                }
                case 7 -> {
                    gameBoard[2][3] = '%';
                    check2 = 3;
                }
                case 8 -> {
                    gameBoard[2][4] = '#';
                    check2 = 15;
                }
                case 9 -> {
                    gameBoard[3][1] = '&';
                    check2 = 13;
                }
                case 10 -> {
                    gameBoard[3][2] = '$';
                    check2 = 12;
                }
                case 11 -> {
                    gameBoard[3][3] = '*';
                    check2 = 14;
                }
                case 12 -> {
                    gameBoard[3][4] = '$';
                    check2 = 10;
                }
                case 13 -> {
                    gameBoard[4][1] = '&';
                    check2 = 9;
                }
                case 14 -> {
                    gameBoard[4][2] = '*';
                    check2 = 11;
                }
                case 15 -> {
                    gameBoard[4][3] = '#';
                    check2 = 8;
                }
                case 16 -> {
                    gameBoard[4][4] = '§';
                    check2 = 1;
                }
            }

            for (char[] row : gameBoard) {
                for (char c : row) {
                    System.out.print(c);
                }
                System.out.println();

                gameBoard = gameBoard1;


            }


            if (check1 == check2) {
                System.out.println("hello");
                game = 0;
            }

        }


    }
}