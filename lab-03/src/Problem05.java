import java.sql.SQLOutput;
import java.util.*;

public class Problem05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Number of points?");
        double gradesOfStudents = inp.nextDouble();

        if (gradesOfStudents >= 90) {
            System.out.println("Grade:A");
        } else {
            System.out.println("Grade:B");

            if (gradesOfStudents < 80) {
                System.out.println("Grade:C");
            }
            }
        }

    }

