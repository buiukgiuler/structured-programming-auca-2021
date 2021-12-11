import java.util.*;

public class Problem01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Your coordinate:");
        int userX = inp.nextInt();

        System.out.print("Coordinate of 1st point:");
        int X1 = inp.nextInt();
        System.out.print("Coordinate of 2nd point:");
        int X2 = inp.nextInt();

        int d1 = AuMath.abs(userX - X1);
        int d2 = AuMath.abs(userX - X2);

        if (d1 < d2) {
            System.out.println("1st point is closer.The distance is " + d1);

        } else if (d1 > d2) {
            System.out.println("2nd point is closer.The distance is " + d2);
        } else {
            System.out.println("Distance is the same. It is " + d1);
        }
    }

    private static int auAbs(int value) {
        if (value < 0) {
            value = -value;

        }
        return value;
    }

}