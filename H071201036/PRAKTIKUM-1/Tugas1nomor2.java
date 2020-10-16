package Praktikum1;
import java.util.Scanner;
public class Tugas1nomor2 {
    public static void main(String[] args) {

        Scanner W = new Scanner (System.in);
        int second = W.nextInt();

        int jam = (second / 3600);
        int menit = ((second % 3600) / 60);
        int detik = ((second % 3600) % 60);

        System.out.printf("%02d:%02d:%02d", jam, menit, detik); 
    }
}
