import java.util.Scanner;

public class URI1005 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double med;

        a = sc.nextFloat();
        b = sc.nextFloat();
        med = (float) (((a * 3.5) + (b * 7.5)) /11);

        String media = String.format("MEDIA = %,.5f", med);
        System.out.print(media +"\n");

    }

}