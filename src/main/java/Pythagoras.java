import princeton.stdlib.StdIn;


public class Pythagoras {
    public static void Method1() {
        System.out.println("what length is A?");
        int A = StdIn.readInt ();
        System.out.println("what length is B?");
        int B = StdIn.readInt ();
        double C = Math.pow(A,2) + Math.pow(B,2);//A squared + B squared = C squared
        C= Math.sqrt(C);// square root C
        System.out.println(C);
    }public static void Method2() {
        System.out.println("what length is B?");
        int B = StdIn.readInt ();
        System.out.println("what length is C?");
        int C = StdIn.readInt ();
        double A = Math.pow(C,2)- Math.pow(B,2);//C squared - B squared = A squared
        A= Math.sqrt(A);//square root A
        System.out.println(A);
    }
    public static void Method3(){
        System.out.println("what length is C?");
        int C = StdIn.readInt ();
        System.out.println("what length is A?");
        int A = StdIn.readInt ();
        double B = Math.pow(C,2)- Math.pow(A,2);//C squared + A squared = B squared
        B= Math.sqrt(B);//square root B
        System.out.println(B);
    }
    public static void main(String[] args) {
        int sides;
        System.out.println("which side don´t you have ?");
        System.out.println("1 = C 2 = A 3 = B");
        sides = StdIn.readInt ();
        if (sides == 1) {
            Method1();
        }
        if (sides == 2) {
            Method2();
        }
        if (sides == 3) {
            Method3();
        }
    }
}
