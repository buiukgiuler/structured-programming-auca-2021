import java.util.Scanner;

public class URI1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int total = 0;
            if (x <= 0 || y <= 0) {
                System.out.println("Wrong answer");
                break;
            }
            if (x > y) {
                int temp = x;
                x = y;
                y = temp;
            }
            for (int i = x; i <= y; i++) {
                total += i;
                System.out.print(i + " ");
            }
            System.out.println("Sum=" + total);
        }
    }
}