import java.util.*;

public class Problem09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("\ni             m(i)     ");
        System.out.println("---------------------");
        for (double i = 1; i <= 901; i += 100) {
            System.out.printf("%-15f", i);
            System.out.printf("%-6.4f\n", PI(i));
        }
    }

    public static double PI(double n) {
        double pi = 0;
        for (double i = 1; i <= n; i++) {
            pi += Math.pow(-1, i + 1) / (2 * i - 1);
        }
        pi *= 4;
        return pi;
    }
}