import java.util.*;

public class Problem04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("1st integer?");
        // a is variable of built-in (primitive) type int
        int a = inp.nextInt();

        System.out.print("2nd integer?");
        // b is variable of built-in (primitive) type int
        int b = inp.nextInt();

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int rem = a % b;

        System.out.println(a + "+" + b + "=" + sum);
        System.out.println(a + "-" + b + "=" + sub);
        System.out.println(a + "*" + b + "=" + mul);
        System.out.println(a + "/" + b + "=" + div);
        System.out.println(a + "%" + b + "=" + rem);

    }
}