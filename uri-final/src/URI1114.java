import java.util.Scanner;

public class URI1114 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int X;
        int Y = 2002;

        do {
            X = inp.nextInt();

            if (X > Y) {
                System.out.println("Senha Invalida");
            } else if (X < Y) {
                System.out.println("Senha Invalida");
            }
        } while (X != Y);
        System.out.println("Acesso Permitido");

    }
}

