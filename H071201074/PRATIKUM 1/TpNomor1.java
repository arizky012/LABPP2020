import java.util.Scanner;

class TpNomor1{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double bensin;
        float L = 14 ;

        System.out.println("masukkan jam dan Kecepatan");
        float jam = x.nextFloat();
        float kecepatan = x.nextFloat();

        bensin = ( jam * kecepatan ) / L;

        System.out.printf("Bensin yang di gunankan : %.3f L", bensin);


    }
}