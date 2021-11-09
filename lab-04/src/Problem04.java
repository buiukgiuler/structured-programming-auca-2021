import java.util.*;
public class Problem04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("complexity level??");
        int mounth = inp.nextInt();

        switch (mounth) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");