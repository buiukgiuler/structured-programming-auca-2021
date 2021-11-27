import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float total = 0;

        System.out.println("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();

        while (number != 0) {
            total += number;
            number = input.nextInt();
        }

        System.out.println("The total is total " + total );
    }
}