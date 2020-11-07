import princeton.stdlib.StdIn;

public class Pascals_Triangle {
    public static void main(String[] args) {
        int num;
        int j;
        System.out.println("number of rows?");
        num = StdIn.readInt();
        int Middle;
        Middle = 1;
        for (int i = 0; i < num; i++) //depth of rows
             {
            for(j=0; j <= i; j++)//amount of numbers per row
            {
                if (j==0 || i==0)
                    Middle = 1;//if row is 1 or beginning or ending of a row equals 1
                else
                    Middle = Middle*(i-j+1)/j;//position(j) in row - what row(i) +1 / postion in row(j)

                System.out.print(Middle + " "); //spacing between numbers
            }
            System.out.println("\n");//new row everytime a row is completed
        }
    }
}
