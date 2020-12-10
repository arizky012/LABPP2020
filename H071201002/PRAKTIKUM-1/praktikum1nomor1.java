import java.util.Scanner;
public class praktikum1nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "Masukkan waktu (jam) dan kecepatan rata-rata (km/jam) : ");
        int s = input.nextInt();
        int a = input.nextInt();
        int efficiency = 14;

        double x = s*a;
        double bensin = x/efficiency;

        // System.out.println((String.format("%.3f", bensin)) + " L");
        System.out.printf("%.3f L", bensin);
    }
}
