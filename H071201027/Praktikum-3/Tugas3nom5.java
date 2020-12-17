import java.util.Scanner;
public class Tugas3nom5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan derjat posisi matahari");

        while (scan.hasNext()) {

            float m = scan.nextFloat();
            int jam=0,menit=0,sisa=0,detik=0;
            int posisi = (int) (m * 240);

            if (m >= 0 && m < 360) {
                 if(posisi > 0) {
                    jam = posisi/3600; 
                   sisa = posisi%3600;
                   menit=sisa/60;
                   detik = sisa%60;
                
                }
              
                jam += 6;
                if (jam > 24)
                    jam -= 24;

                if (jam <= 10) {
                    System.out.println("selamat pagi");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                } else if (jam <= 2) {
                    System.out.println("selamat siang");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                } else if (jam <= 6) {
                    System.out.println("selamat sore");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                } else {
                    System.out.println("selamat malam");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                }
            } else
                System.out.println("harap masukkan 0<=nilai<360");
        }
    }    
}
