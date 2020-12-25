import java.util.Scanner;
import java.util.Random;

public class prak5no2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
    }

    public static String generateSerial(int n, int m) {
        Random num = new Random();
        String str = " ";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                str += num.nextInt(10);
            }
            if (i < n) {
                str += "-";
            }
        }
        return str;
    }

}
