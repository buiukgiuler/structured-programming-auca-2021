
import java.util.Scanner;

public class URI1080 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int N = 100, x, hig = 0, pos = 0;

        for (int i = 1; i <= N; i++) {
            x = inp.nextInt();

            if (hig > x) {
                hig = pos;
                pos = pos;
            } else {
                hig = x;
                pos = i;
            }
        }
        System.out.print(hig + "\n" + pos + "\n");
    }

}