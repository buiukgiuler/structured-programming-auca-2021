import java.util.Scanner;

public class URI1113 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int X, Y;

        do {
            X = inp.nextInt();
            Y = inp.nextInt();

            if (X > Y) {
                System.out.println("Decrescente");
            }else if (X < Y) {
                System.out.println("Crescente");
            }
        } while (X != Y);

    }

}
