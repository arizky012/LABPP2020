import java.util.Scanner;


public class Tp1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan waktu perjalan dan kecapatan rata-rata : ");
       int w = input.nextInt(); 
       int r = input.nextInt();
       float bensin = (w * r)/14.0f;
       System.out.printf("Bensin yang digunakan :  %.3f L" , bensin); 
    
    }
}
