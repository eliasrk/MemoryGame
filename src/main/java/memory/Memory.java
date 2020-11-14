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
        int game = 1;
        while (game == 1) {
        int position, position1;
        System.out.println("where would you like to remove?");
        position = StdIn.readInt();
        System.out.println("where would you like to remove?");
        position1 = StdIn.readInt();
        switch (position) {
                case 1:
                    gameBoard[1][1] = '§';
                    break;
                case 2:
                    gameBoard[1][2] = '(';
                    break;
                case 3:
                    gameBoard[1][3] = '%';
                    break;
                case 4:
                    gameBoard[1][4] = '-';
                    break;

                case 5:
                    gameBoard[2][1] = '-';
                    break;
                case 6:
                    gameBoard[2][2] = '(';
                    break;
                case 7:
                    gameBoard[2][3] = '%';
                    break;
                case 8:
                    gameBoard[2][4] = '#';
                    break;

                case 9:
                    gameBoard[3][1] = '&';
                    break;
                case 10:
                    gameBoard[3][2] = '$';
                    break;
                case 11:
                    gameBoard[3][3] = '*';
                    break;
                case 12:
                    gameBoard[3][4] = '$';
                    break;

                case 13:
                    gameBoard[4][1] = '&';
                    break;
                case 14:
                    gameBoard[4][2] = '*';
                    break;
                case 15:
                    gameBoard[4][3] = '#';
                    break;
                case 16:
                    gameBoard[4][4] = '§';
                    break;
            }
        switch (position1) {
                case 1:
                    gameBoard[1][1] = '§';
                    break;
                case 2:
                    gameBoard[1][2] = '(';
                    break;
                case 3:
                    gameBoard[1][3] = '%';
                    break;
                case 4:
                    gameBoard[1][4] = '-';
                    break;

                case 5:
                    gameBoard[2][1] = '-';
                    break;
                case 6:
                    gameBoard[2][2] = '(';
                    break;
                case 7:
                    gameBoard[2][3] = '%';
                    break;
                case 8:
                    gameBoard[2][4] = '#';
                    break;

                case 9:
                    gameBoard[3][1] = '&';
                    break;
                case 10:
                    gameBoard[3][2] = '$';
                    break;
                case 11:
                    gameBoard[3][3] = '*';
                    break;
                case 12:
                    gameBoard[3][4] = '$';
                    break;

                case 13:
                    gameBoard[4][1] = '&';
                    break;
                case 14:
                    gameBoard[4][2] = '*';
                    break;
                case 15:
                    gameBoard[4][3] = '#';
                    break;
                case 16:
                    gameBoard[4][4] = '§';
                    break;
            }
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
                }
            System.out.println();


            }
            gameBoard = gameBoard1;

        }






    }
    }

