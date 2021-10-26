import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);

         System.out.print("Temperature in degrees Fahrenheit?");

         double degreeFahrenheit = inp.nextDouble();
         double degreeCelcious = (double) 5/9 * (degreeFahrenheit - 32);

         System.out.printf("The temperature is degrees Celsius is %.2f%n ", degreeCelcious);
    }


}
