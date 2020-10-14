import java.util.Scanner;
public class NomorSatu{
    public static void main(String[] args) {
        Scanner bensin = new Scanner(System.in);
        float hasil;
        System.out.println("masukkan t v");
        int t = bensin.nextInt();
        int v = bensin.nextInt();
        System.out.println("bensin yang digunakan");
        float km = 14;

        
        hasil = ((v*t)/km);

        System.out.printf("%.3f L", hasil);
        
    }
}

