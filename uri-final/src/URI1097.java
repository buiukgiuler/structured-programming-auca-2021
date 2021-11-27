public class URI1097 {

    public static void main(String[] args) {
        for (int i = 1, j = 7; i <= 9; i += 2, j += 2) {
            for (int m = j; m >= (j - 2); m--) {
                System.out.print("I=" + i + " J=" + m + "\n");
            }
        }

    }

}
