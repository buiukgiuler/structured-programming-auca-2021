import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         int sum = 0;
         int number = 0;

         while (number < 20) {
             number++;
             if (number ==10 || number == 11)
                 continue;
             sum += number;

             }

         System.out.println("The number is " + number);
         System.out.println("The sum is " + sum);

         }
 }