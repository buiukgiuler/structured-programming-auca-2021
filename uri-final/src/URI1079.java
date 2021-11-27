import java.util.Scanner;

public class URI1079 {

    public static void main(String[] args) {

        double N;
        double number1, number2, number3;
        double average;
        Scanner inp =new Scanner(System.in);
        N = inp.nextDouble();

        for (int i = 1; i <= N; i++) {
            number1 = inp.nextDouble();
            number2 = inp.nextDouble();
            number3 = inp.nextDouble();
            average = ( number1*2 + number2*3 + number3*5 ) / 10;
            System.out.printf("%.1f", average);
        }
    }

}