import java.util.Scanner;

public class URI1035 {

    public static void main(String[] args) {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        if((b > c) && (d > a) && (c + d > a + b) && c > 0 && c > 0 && (a % 2 == 0))
            System.out.printf("Valores aceitosn");
        else
            System.out.printf("Valores nao aceitosn");
    }

}