import java.util.*;

/**
 * waktu
 */
public class waktu {
    static Scanner ara = new Scanner (System.in);
    public static void main(String[] args) {
        int waktu = ara.nextInt();

        int jam = waktu/3600;
        int a  = waktu % 3600;
        int menit = a / 60;
        int detik = a - (menit *60);

        
        //System.out.println(jam);
        System.out.printf("%d:%d:%d\n" , jam, menit, detik);
        }
}