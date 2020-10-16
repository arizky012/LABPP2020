import java.util.Scanner;
public class NomorTiga {
    public static void main(String[] args) {
        Scanner kapal = new Scanner(System.in);
        double PanjangKapal;
        System.out.println("masukkan h a b");
            double h = kapal.nextDouble();
            double a = kapal.nextDouble();
            double b = kapal.nextDouble();

        PanjangKapal =h*((Math.tan(Math.toRadians(a))-(Math.tan(Math.toRadians(b)))));

        if(90 > a && a > b) {
            System.out.println("panjang kapal");
            System.out.printf("%.1f m", PanjangKapal);
        }

        else{
                System.out.printf("error");
        }
         
     }
    
}
