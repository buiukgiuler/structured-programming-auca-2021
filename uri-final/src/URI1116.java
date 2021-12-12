import java.util.*;

public class URI1116 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int N = inp.nextInt();

        for (int i = 0; i < N; ++i) {

            int X = inp.nextInt();
            int Y = inp.nextInt();

            if (Y == 0) {
                System.out.print("divisao impossivel\n");
            } else if (X == 0 ) {
                System.out.print("divisao impossivel\n");
            } else {
                double result = X / Y;

                System.out.printf("%.1f\n", result);

            }
        }
    }

}