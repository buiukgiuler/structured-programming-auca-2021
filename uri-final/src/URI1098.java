public class URI1098 {

    public static void main(String[] args) {
        for(double i = 0; i <= 2; i += 0.2) {
            System.out.printf("I=%.1f J=%.1f\n", i, i+1);
            System.out.printf("I=%.1f J=%.1f\n", i, i+2);
            System.out.printf("I=%.1f J=%.1f\n", i, i+3);
        }
    }
}