import java.util.Scanner;
public class Praktikum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int detik, menit, jam;
        System.out.print("detik = "); 
        detik = input.nextInt();

        jam =detik / 3600;

        menit =(detik%3600)/60;

        detik = (detik%3600)%60;

        System.out.printf("%02d : %02d : %02d", jam, menit, detik);
    }
    
}
