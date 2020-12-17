import java.util.Scanner;

/**
 * Nomor1
 */
public class Nomor1 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Masukkan Kalimat : ");
        String Kalimat = obj.next();
        int num;

        // toHexString()
        String str = Integer.toHexString(num);
        System.out.println(str);
    }
}