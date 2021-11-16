import java.util.Scanner;

public class URI1043 {
    public static void main(String[] args) {
        float A, B, C, areaTraphisium, perimeterTriangle ;

        Scanner input =new Scanner(System.in);

        A = input.nextFloat();

        B = input.nextFloat();

        C = input.nextFloat();

        if ((A < (float)(B+C)) && (B < (float)(A+C)) && (C < (float)(B+A))) {

            perimeterTriangle = A + B + C;

            System.out.printf("Perimetro = %.1f\n",perimeterTriangle);

        }else {

            areaTraphisium = ((A + B) * C) / 2;

            System.out.printf("Area = %.1f\n",areaTraphisium);
        }
    }

}
