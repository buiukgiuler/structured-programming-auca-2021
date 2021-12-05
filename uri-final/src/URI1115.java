import java.util.Scanner;

public class URI1115 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int X, Y;

        while (((X = inp.nextInt()) != 0) && ((Y = inp.nextInt()) != 0)) {

            if (X > 0 && Y > 0) {
                System.out.println("primeiro");

            } else if (X > 0 && Y < 0) {
                System.out.println("quarto");

            } else if (X < 0 && Y < 0) {

                System.out.println("terceiro");

            } else if (X < 0 && Y > 0) {
                System.out.println("segundo");
            }
        }

    }

}