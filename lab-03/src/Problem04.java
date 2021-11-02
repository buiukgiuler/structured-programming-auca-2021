import java.util.*;

public class Problem04 {
    public static void main(String[] args) {
        Scanner inp  = new Scanner(System.in);

        System.out.print("year? ");
        int year = inp.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("This is a leep year");
        } else {
            System.out.println("This is a common year");
        }
    }
}
