import java.util.Scanner;
public class Praktikum3 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        double h = user.nextDouble();
        double a = user.nextDouble();
        a = Math.tan(Math.toRadians(a));
        double b = user.nextDouble();
        b = Math.tan(Math.toRadians(b));

        if (90 > a && a >b){
            double panjangkapal = h * (a-b);
            System.out.printf("Panjang Kapal = %.1f m", panjangkapal);
        }
        else{
            System.out.println(" Stop ");
        }
    }
}

