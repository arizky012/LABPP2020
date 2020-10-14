import java.util.Scanner;

public class Tp3 {
   public static void main(String[] args) {
     Scanner input = new Scanner (System.in);

     System.out.println("Masukkan Nilai :");
     double h = input.nextDouble();
     double a = input.nextDouble();  
     double b = input.nextDouble();

     double hasil = h * (Math.tan(Math.toRadians(a)) - Math.tan(Math.toRadians(b)));
     if ( 90 > a && a> b) {
        System.out.printf("%.1f m" , hasil);
             }
         else {
             System.out.println("Error");
         }

     }
   }

