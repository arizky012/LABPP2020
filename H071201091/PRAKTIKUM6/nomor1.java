import java.util.*;
/**
 * lala
 */
public class nomor1 {
    static Scanner ara = new Scanner (System.in);
    public static void main(String[] args) {
       String kata = ara.nextLine();
       String kapital = kata.toUpperCase();
       String spasi = kapital.replaceAll(" ", "");

       int panjang = spasi.length()/2;
       String set = spasi.substring(0, panjang);

        char [] var = set.toCharArray();
        int jumlah = kata.length()*kata.length();

        String haha = "";

        for (int i = var.length-2;i>=0;i--){
            haha+=var[i];
        }
        String hexa = String.format("#%x", jumlah);

        System.out.printf(hexa);
        System.out.print(set);
        System.out.print(haha);
        System.out.printf("%o",kata.length());

        char [] a = hexa.toCharArray();
        
        int huruf = 0;
        for (int i = 0; i<a.length;i++){
            if (a[i]>='A'&& a[i] <= 'z'){
                huruf++;
                break;
            }
        }
        System.out.printf("%c", huruf==1? '?':'!');
    }
}