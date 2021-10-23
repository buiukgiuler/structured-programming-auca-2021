import java.util.Scanner;

public class URI1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A,B,C;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double area_triangle = 0.5*A*C;
        double area_radius = 3.14159*C*C;
        double area_trapezium = ((A+B)/2)*C;
        double area_square = B*B;
        double area_rectangle = A*B;

        System.out.printf("TRIANGULO: %.3f\n",area_triangle);
        System.out.printf("CIRCULO: %.3f\n",area_radius);
        System.out.printf("TRAPEZIO: %.3f\n",area_trapezium);
        System.out.printf("QUADRADO: %.3f\n",area_square);
        System.out.printf("RETANGULO: %.3f\n",area_rectangle);
    }
}