import java.util.Scanner;

public class URI1008 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int a;
        int b;
        float c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextFloat();

        System.out.printf("ЧИСЛА = %d\n", a);

        System.out.printf("ЗАРПЛАТА = U$ %.2f\n", b * c);
    }
}