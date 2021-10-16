import java.util.Scanner;

public class URI1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary;
        double value;
        double TOTAL;

        String name;
        name = sc.next();
        salary = sc.nextDouble();
        value = sc.nextDouble();


        TOTAL = salary + value * 0.15;
        System.out.printf("TOTAL = R$ %.2f\n",TOTAL);

    }
}