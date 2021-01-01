import java.util.Scanner;

public class P3no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int a = 0, b = 0;
        if (x < y) {
            a = x;
            b = y;
        } else {
            a = y;
            b = x;
        }
        for (int i = a; i <= b; i++) {
            if (i < 0) {
                if (i % 2 == 0) {
                    System.out.println(i + " genap negatif");
                } else {
                    System.out.println(i + " ganjil negatif");
                }
            } else if (i == 0) {
                System.out.println(i + " nol");
            } else {
                if (i % 2 == 0) {
                    System.out.println(i + " genap positif");
                } else {
                    System.out.println(i + " ganjil posotif");
                }
            }
        }
        input.close();
    }
}
