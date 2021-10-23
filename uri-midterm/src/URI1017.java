import java.util.Scanner;

public class URI1017 {
    public static void main(String[] args) {
        double a, b, r;

        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();

        r = (a * b)/12.0;

        System.out.printf("%.3f",r);

    }

}