import java.util.*;

public class Problem05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Number of points?");
        int points = inp.nextInt();

        if (points < 0 || 100 < points) {
            System.out.println(points + "is not in the permitted range.");
        } else if (90 <= points && points <= 100) {
            System.out.println("Grade:A");
        } else if (80 <= points && points <= 90) {
            System.out.println("Grade:B");
        } else if (70 <= points && points < 80) {
            System.out.println("Grade:C");
        } else if (60 <= points && points < 70) {
            System.out.println("Grade:D");
        } else if (0 <= points && points < 70) {
            System.out.println("Grade:F");
        }
    }
}