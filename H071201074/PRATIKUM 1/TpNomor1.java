import java.util.Scanner;

class TpNomor1{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double bensin;

        System.out.println("masukkan jam dan Kecepatan");
        int jam = x.nextInt();
        int kecepatan = x.nextInt();

        bensin = ( jam * kecepatan ) / 14.0f;

        System.out.printf("Bensin yang digunankan : %.3f L", bensin);


    }
}