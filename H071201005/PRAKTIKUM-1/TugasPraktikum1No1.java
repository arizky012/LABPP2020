import java.util.Scanner;

public class TugasPraktikum1No1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai waktu =");
        double waktu = input.nextInt();
        System.out.print("masukkan nilai kecepatan =");
        double kecepatan = input.nextInt();
        double jarak = kecepatan*waktu;
        double bensin = jarak/14;
        System.out.println("Bensin yang digunakan :" + String.format("%.3f", bensin));
    }
}