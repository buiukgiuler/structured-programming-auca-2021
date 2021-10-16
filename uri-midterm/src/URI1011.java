import java.util.Scanner;

public class URI1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        a = sc.nextDouble();

        System.out.printf("VOLUME = %.3f", (4 * Math.PI * Math.pow(a, 3.0)) / 3);


    }

}