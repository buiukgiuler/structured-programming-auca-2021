import java.util.Scanner;

public class URI1037 {

    public static void main(String[] args) {
        float N;
        Scanner input =new Scanner(System.in);
        N = input.nextFloat();
        //Set the range
        if (N >=0 && N <= 25.0000) {
            System.out.printf("Intervalo [0,25]n");
        }else if (N >= 25.00001 && N <= 50.0000000) {
            System.out.printf("Intervalo (25,50]n");
        }else if (N >= 50.00001 && N <= 75.0000000) {
            System.out.printf("Intervalo (50,75]n");
        }else if (N >= 75.00001 && N<=100.0000000) {
            System.out.printf("Intervalo (75,100]n");
        }else {
            System.out.print("Fora de intervalon");
        }

    }

}