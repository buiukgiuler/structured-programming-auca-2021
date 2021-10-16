import java.util.Scanner;

public class URI1010{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        double c;
        double res;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextDouble();
        res = b * c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextDouble();
        res += b * c;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", res);


    }

}
