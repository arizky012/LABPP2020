import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = obj.nextInt();
        }
        obj.close();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int a = Math.min(x[i], x[j]);
                boolean isCoprime = true;

                for (int k = a; k > 1; k--) {

                    if ((x[i] % k == 0) && (x[j] % k == 0)) {

                        isCoprime = false;
                        break;

                    }
                }
                if (isCoprime) {
                    System.out.println(x[i] + " " + x[j]);
                }
            }
        }
    }
}