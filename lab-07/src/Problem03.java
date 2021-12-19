import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("N: ");
        int n = inp.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; ++i) {
            System.out.print("Enter element with index" + i + ": ");
            a[i] = inp.nextInt();
        }
        printArray(a);
        reverseArray(a);
        printArray(a);
    }

    private static void reverseArray(int[] v)  {
        for (int left = 0, right = v.length - 1; left < right; ++left, --right) {

            int t = v[left];
            v[left] = v[right];
            v[right] = t;
        }

    }

    private static void printArray(int[] a) {
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + "");

        }
        System.out.println();

    }
}


