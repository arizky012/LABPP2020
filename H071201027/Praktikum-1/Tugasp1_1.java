import java.util.Scanner;

public class Tugasp1_1 {

        public static void main(String[] args) {
           
            Scanner x = new Scanner(System.in);
            System.out.println("masukkan waktu tempuh(jam)=");
            int k = x.nextInt();

            Scanner y = new Scanner(System.in);
            System.out.println("masukkan kecepatan rata-rata (km/jam)=");
            int n= y.nextInt();
           
            double hasil;
            hasil= k*n/14f;
                System.out.printf("Bensin yang digunakan  = %.3f L",hasil);
             
           
             
    }
}
