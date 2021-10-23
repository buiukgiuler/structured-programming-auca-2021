import java.util.Scanner;

public class URI1014 {
    public static void main(String[] args) {

        double X, Y;

        Scanner sc = new Scanner(System.in);

        X = sc.nextDouble();
        Y = sc.nextDouble();

        System.out.printf("%.3f km/l", X/Y);
    }

}
