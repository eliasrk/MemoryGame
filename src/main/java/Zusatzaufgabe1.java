import princeton.stdlib.StdIn;
import princeton.stdlib.StdOut;


public class Zusatzaufgabe1 {
    public static void main(String[] args) {

        StdOut.print("Enter a year:");
        int number,leapyear,lastdate;
        number = StdIn.readInt();
        if (number % 4 == 0) {
            System.out.println("Leap Year");
            leapyear = 1;
        }else {
            System.out.println("Not a Leap Year");
            leapyear = 0;
        }
        StdOut.print("Enter last day of last year:");
        lastdate = StdIn.readInt();
        double day;
        double firstsunday = 0;
        switch (lastdate){
            case 1:
                firstsunday = 6;
                break;
            case 2:
                firstsunday = 5;
                break;
            case 3:
                firstsunday = 4;
                break;
            case 4:
                firstsunday = 3;
                break;
            case 5:
                firstsunday = 2;
                break;
            case 6:
                firstsunday = 1;
                break;
            case 7:
                firstsunday = 7;
                break;
        }
        for (int month = 1; month <13; month++) {

                switch (month) {
                    case 1:
                        day = firstsunday;
                        System.out.println("january " + day);
                        firstsunday = day;
                        break;
                    case 2:
                        day = firstsunday +35-31-7;
                        System.out.println("February " + day);
                        firstsunday = day;
                        break;
                    case 3:
                        if (leapyear == 1) {
                        day = firstsunday +35-29-7;
                        System.out.println("March " + day);
                        firstsunday = day;
                        break;
                    } else {
                        day = firstsunday+35-28-7;
                        System.out.println("March " + day);
                        firstsunday = day;
                        break;
                    }
                    case 4:
                        day = firstsunday +35-31;
                        System.out.println("April " + day);
                        firstsunday = day;
                        break;
                    case 5:
                        day = firstsunday +35-30-7;
                        System.out.println("May " + day);
                        firstsunday = day;
                        break;
                    case 6:
                        day = firstsunday +35-31-7;
                        System.out.println("June " + day);
                        firstsunday = day;
                        break;
                    case 7:
                        day = firstsunday +35-30;
                        System.out.println("July " + day);
                        firstsunday = day;
                        break;
                    case 8:
                        day = firstsunday +35-31-7;
                        System.out.println("August " + day);
                        firstsunday = day;
                        break;
                    case 9:
                        if (leapyear==0){
                            day = firstsunday +35-31-7;
                        }else{
                            day = firstsunday +35-31;
                        }
                        System.out.println("September " + day);
                        firstsunday = day;
                        break;
                    case 10:
                        if (leapyear==0){
                            day = firstsunday +35-30;
                        }else{
                            day = firstsunday +35-30-7;
                        }
                        System.out.println("October " + day);
                        firstsunday = day;
                        break;
                    case 11:
                        day = firstsunday +35-31-7;
                        System.out.println("November " + day);
                        firstsunday = day;
                        break;
                    case 12:
                        if (leapyear==0){
                            day = firstsunday +35-30-7;
                        }else{
                            day = firstsunday +35-30;
                        }
                        System.out.println("December " + day);
                        firstsunday = day;
                        break;






                }

        }
        }
    }
