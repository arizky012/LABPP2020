import java.util.Scanner;

public class prak5no1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println("FPB dari " + n + " dan " + m + " = " + cariFPB(n, m));
    }

    public static int cariFPB(int n, int m) {
        int FPB = 0;
        for (int i = 1; i <= m && i <= n; i++) {
            if (n % i == 0 && m % i == 0)
                FPB = i;

        }
        return FPB;
    }
}
