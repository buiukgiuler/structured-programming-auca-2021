import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {

        double n  = 1.0;
        double sum;
        double sum1;

        sum =4*(1-n/3+n/5-n/7+n/9-n/11);
        sum1 =4*(1-n/3+n/5-n/7+n/9-n/11+n/13);

        System.out.println("Sum = " + sum);
        System.out.println("Sum = " + sum1);
    }
}
