package memory;

public class Memory {

    public static void Nothing() {
        String[][] gameBoard = {{"  ", "1", " 2", " 3", " 4"},
                {"1 ", "?", " ?", " ?", " ?"},
                {"2 " + "? " + "? " + "? " + "?"},
                {"3 " + "? " + "? " + "? " + "?"},
                {"2 " + "? " + "? " + "? " + "?"}};
        for (String[] row : gameBoard) {
            for (String c : row) {
                System.out.print(c);
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {

    }
}
