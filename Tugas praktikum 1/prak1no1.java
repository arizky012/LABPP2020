import java.util.Scanner;

public class prak1no1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int p = read.nextInt();
        int k = read.nextInt();
        int efisiensi = 14;
        double n = p*k;
        double bensin = n / 14;
        System.out.printf("Bensin yang digunakan ; "+" %.3f L",bensin);

        


    }
}
