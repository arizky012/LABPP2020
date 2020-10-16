import java.util.Scanner;

public class SoalPraktikum3 {
    public static void main(String[] args) {
        
        Scanner nilai = new Scanner(System.in);

            // inputan pertama h = 100, a = 60, b = 45
            // inputan kedua h = 120, a = 87, b = 50


            int h = nilai.nextInt();
            int a = nilai.nextInt();
            int b = nilai.nextInt();

        if (90 > a && a > b){
            
            int c = 90 - a;
            int c2 = 90 - b;
            double tanA = Math.tan(Math.toRadians(c));
            double tanB = Math.tan(Math.toRadians(c2));

            double p = (h / tanA);
            double p2 = (h / tanB);
            
            double d = p - p2;

            System.out.printf("%.1f m", d);

            nilai.close();
        } else {
            System.out.println("error");
        }
      

    }
}
