import java.util.*;
public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        Random rnd = new Random();

        System.out.print("Number of testa?");
        int nTests = inp.nextInt();

        int numofCorrectanswers = 0;

        int i = 0;
        while (i < nTests) {
            int op1 = -50 + rnd.nextInt(101);
            int op2 = -50 + rnd.nextInt(101);
            System.out.printf("%d + %d = ", op1,op2);
            int unitAnswer = inp.nextInt();
            if (op1 + op2 == unitAnswer) {
                ++numofCorrectanswers;
            }
        ++i;
        }

        System.out.println("Number of correct answers: " + numofCorrectanswers);
        System.out.println("Number of incorrect answers: " + (nTests - numofCorrectanswers));

    }


}
