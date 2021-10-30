import java.util.Scanner;

public class URI1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int hours = n/3600;
        int minutes = n%3600;
        int seconds = minutes%60;
        minutes= minutes/60;

        System.out.println(hours +":"+ minutes + ":" + seconds);
    }
}