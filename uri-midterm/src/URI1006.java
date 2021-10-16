import java.util.Scanner;

public class URI1006 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        double A;
        double B;
        double C;
        double MEDIA;

        A =sc.nextDouble();
        B =sc.nextDouble();
        C =sc.nextDouble();

        MEDIA = (A/10 * 2) + (B/10 * 3) + (C/10 * 5);
        String media = String.format("MEDIA = %,.1f", MEDIA);

        System.out.print(media +"\n");

    }
}