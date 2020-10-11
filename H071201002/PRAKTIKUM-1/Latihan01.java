import java.util.Scanner;
/**
 * @author noval
 */

public class Latihan01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan bilangan"); 

        double bil = scan.nextDouble(); 

        double hasil;

        hasil = bil % 1;
        if (hasil>0||hasil<0) {
            System.out.println("bilangan"+bil+"adalah bilangan pecahan");
        } else {
            System.out.println("Bilangan"+bil+"adalah bilangan bulat");
            
        }
                
     }
            
} 