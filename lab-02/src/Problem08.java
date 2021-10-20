import java.util.Scanner;

public class Problem08 {
    public static final double POUNDS_PER_KILOGRAMS = 0.454;

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number a pounds: ");

        double pounds = inp.nextDouble();

        double kilograms = POUNDS_PER_KILOGRAMS * pounds;

        System.out.printf("%f in %.1f kilograms.%n", pounds, kilograms);

    }

}