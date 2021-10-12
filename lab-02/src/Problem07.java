import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print(" Enter the radius value");
        double radius = in.nextDouble();

        System.out.print(" Enter the length value");
        double length = in.nextDouble();

        double area = (radius * radius * Math.PI);
        double volume = (area * length);

        System.out.printf("the area is " + "%.4f", area);

        System.out.println();

        System.out.printf("the volume is " + "%.1f", volume);

    }
}
