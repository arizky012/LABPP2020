import java.util.Scanner;

class TpNomor3{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double hasil;

        System.out.println("Masukkan nilai :");
        double h = x.nextDouble();
        double a = x.nextDouble();
        double b = x.nextDouble();
    
        hasil = h * ((Math.tan(Math.toRadians(a)) - (Math.tan(Math.toRadians(b)))));

        if ( 90 > a && a > b ) {
                System.out.printf("%.1f m" , hasil);
        
        }
        else {
            System.out.println( "Error");
        }

        

        
    }
}