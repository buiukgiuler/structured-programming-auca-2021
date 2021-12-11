import java.util.*;

public class Problem02 {
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {

        int year = readNumber("Year:", "Incorrect number of year", 1, 10000);

        int month = readNumber("Month:", "Incorrect number of month", 1, 12);

        int days = getNumberofDays(year, month);

        System.out.println("Number of days: " + days);

    }

    static int readNumber(String msg, String errorMsg, int beg, int end) {
        System.out.print(msg);
        int res = inp.nextInt();
        if (res < beg || end < res) {
            System.out.print(errorMsg + res);
            System.exit(1);
        }
        return res;
    }

    static int getNumberofDays(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return isLeapYear(year) ? 29 : 28;
        }
    }

    static boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
        }
    }


