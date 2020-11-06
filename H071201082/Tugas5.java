import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jam = 0; 
        int menit = 0;
        int detik = 0;
        try{
        while (scan.hasNext()){
            float M = scan.nextFloat();
            int a = (int) (M * 240);
            
                if (0 <= M && M< 360) {
                        jam = (a / 3600) + 6;
                        menit = (a % 3600)/60;
                        detik = (a % 3600)% 60;
                    

                    if (jam >= 24)
                        jam -= 24;

                    if (jam <= 10){
                        System.out.println("Selamat Pagi");
                        System.out.printf("%02d:%02d:%02d\n\n", jam, menit, detik);
                    } else if (jam <= 11 ) {
                        System.out.println("Selamat Siang");
                        System.out.printf("%02d:%02d:%02d\n\n", jam, menit, detik);
                    } else if (jam <= 18) {
                        System.out.println("selamat Sore");
                        System.out.printf("%02d:%02d:%02d\n\n", jam, menit, detik);
                    } else {
                        System.out.println("Selamat Malam");
                        System.out.printf("%02d:%02d:%02d\n\n", jam, menit, detik);
                    }
                } else
                    System.out.println("harap masukkan 0<=nilai<360");

            }
        }catch (Exception input){
            System.out.println("End of File");
        }
    }
    
}
