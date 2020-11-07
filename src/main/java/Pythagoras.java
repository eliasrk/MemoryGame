import princeton.stdlib.StdIn;

public class Pythagoras {
    public static void main(String[] args) {
        int sides;
        System.out.println("which side don´t you have ?");
        System.out.println("1 = C 2 = A 3 = B");
        sides = StdIn.readInt ();
        if (sides == 1) {
            System.out.println("what length is A?");
            int A = StdIn.readInt ();
            System.out.println("what length is B?");
            int B = StdIn.readInt ();
            double C = Math.pow(A,2) + Math.pow(B,2);
            C= Math.sqrt(C);
            System.out.println(C);
        }
        if (sides == 2) {
            System.out.println("what length is B?");
            int B = StdIn.readInt ();
            System.out.println("what length is C?");
            int C = StdIn.readInt ();
            double A = Math.pow(C,2)- Math.pow(B,2);
            A= Math.sqrt(A);
            System.out.println(A);
        }
        if (sides == 3) {
            System.out.println("what length is C?");
            int C = StdIn.readInt ();
            System.out.println("what length is A?");
            int A = StdIn.readInt ();
            double B = Math.pow(C,2)- Math.pow(A,2);
            B= Math.sqrt(B);
            System.out.println(B);
        }
    }
}
