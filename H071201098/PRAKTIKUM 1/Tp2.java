import java.util.Scanner;

public class Tp2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int s;
        int m;
        int h;
        System.out.println("Masukkan detik :");
        s = input.nextInt();
        
        h = s / 3600;
        m = (s%3600)/60;
        s = (s%3600)%60;
        System.out.printf("%02d : %02d : %02d",h, m, s);

    }
}

