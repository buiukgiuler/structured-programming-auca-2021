import java.util.*;

public class Problem02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Number of points?");
        int mounth = inp.nextInt();

        if ( mounth < 1 || 12 < mounth) {
            System.out.println( mounth + "is not a correct number of mounth");
        } else if (mounth == 12 || mounth ==1 || mounth == 2 ) {
            System.out.println("Winter");
        } else if (mounth == 3 || mounth ==3 || mounth == 5) {
            System.out.println("Spring");
        } else if (mounth == 6 || mounth ==7 || mounth == 8) {
            System.out.println("Summer");
        } else {
            System.out.println("Fall");
        }
    }
}