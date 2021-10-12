import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");

        double celsius = in.nextDouble();

        double farenheit = (celsius * 9.0/5) + 32;

        System.out.printf(  celsius + " celsius is " + "%.1f farenheit" , farenheit);

    }
}