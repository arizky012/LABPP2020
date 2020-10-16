import java.util.Scanner;
public class Tugasp1_3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Masukkan panjang kapal");
        double h = x.nextDouble();

        Scanner y = new Scanner(System.in);
        System.out.println("Masukkan sudut elevasi ujung depan kapal");
        double a = y.nextDouble();

        Scanner z = new Scanner(System.in);
        System.out.println("Masukkan sudut elevasi ujung belakang");
        double b = z.nextDouble();

        double langkah1; double langkah2; double hasil;
        langkah1 = h*Math.tan(Math.toRadians(b));
        langkah2 = h*Math.tan(Math.toRadians(a));
        hasil = langkah2-langkah1;
        if(90>a && a>b){
            System.out.printf("Panjang kapal = %.1f m ",hasil);
        } else {
            System.out.println( "error");
        }
      
    }
   
    
}
