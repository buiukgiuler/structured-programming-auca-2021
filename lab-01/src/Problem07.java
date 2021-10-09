import java.util.*;

public class Problem07{

    public static void main(String args[]){
        int a = 1;
        int b = 4;

        for (int i = a; i <= b; i++){
            System.out.printf( i + "^2 = %.0f \n", Math.pow(i, 2));
        }
    }
}