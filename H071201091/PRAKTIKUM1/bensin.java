import java.util.Scanner;

/**
 * bensin
 */
public class bensin {
    static Scanner rey = new Scanner(System.in);
    public static void main(String[] args) {
        int jam = rey.nextInt();
        int kecepatan = rey.nextInt();

        double bensiin = (double)kecepatan/jam/14*100;

        System.out.printf("Bensin yang di gunakan = %.3f L\n",bensiin);

    }
}