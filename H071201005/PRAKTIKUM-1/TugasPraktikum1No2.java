import java.util.Scanner;

public class TugasPraktikum1No2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai detik :");
        int detik;
        detik = input.nextInt();
        int menit;
        int jam;
        jam = detik/(60*60);
        detik = detik-((60*60)*jam);
        menit = detik/60;
        detik = detik-(60*menit);
        System.out.printf("%d:%d:%d", jam, menit, detik);
    }
}
