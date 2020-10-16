import java.util.Scanner;
public class NomorDua {
    public static void main(String[] args) {
        Scanner sec = new Scanner(System.in);
        int detikk ;
        System.out.println(" masukkan detik");
            int detik = sec.nextInt();
    
        int hour = (detik/3600);
        int minute = ((detik%3600)/60);
        int second = (detik%60);

        System.out.printf("%02d:%02d:%02d", hour, minute, second);
    }
}