package memory;

import princeton.stdlib.StdIn;

public class memory3 {
    public static void main(String[] args) {


        System.out.println("how big?");
        int columns = StdIn.readInt();
        int rows= columns, cols = columns;



        int [][] array = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            if(row == 0){
                int counter = 1;
                for (int col = 0; col < cols; col++) {
                    if(col != 0) {
                        array[row][col] = counter;
                        counter++;
                    }

                }

            }else{
                for (int col = 0; col < cols; col++) {

                    if (col == 0){
                        if(row != 0) {
                        array[row][col]= row;}
                    }else {
                        array[row][col] = 0;

                    }

                }
            }


        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(array[row][col]+ " ");
            }
            System.out.println(" ");

        }

    }


}