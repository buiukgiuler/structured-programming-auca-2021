import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        double a, b, c, d;
        System.out.println("Enter a, b, c:");

        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        d = b * b - 4 * a * c;
        if (d > 0) {
            double r1, r2;
            r1 = (-b + Math.sqrt(d)) / (2 * a);
            r2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("The equation has two roots" + r1 + " and " + r2);
        }
        else if (d == 0) {
            double r;
            r = -b / (2 * a);
            System.out.println("The equation has one root " + r);
        }
        else {
            System.out.println("The1 equation has no real roots");
        }
    }

}


