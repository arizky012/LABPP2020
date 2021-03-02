import java.util.*;

/**
 * nomor1
 */
public class nomor1 {
    static Scanner ara = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("*TUGAS PRAKTIKUM 3*\nNOMOR 1");
        System.out.println("\nNama: Ufairah Damara Bashir \nNIM: H07120191 \njurusan: ILMU KOMPUTER B");

        System.out.println("\nPesan:");
        System.out.println("- Inputan X dan Y adalah integer");
        System.out.println("- X adalah nilai awal");
        System.out.println("- Y adalah nilai akhir");
        
        System.out.println("- Output:");
        System.out.println("  - Mencetak keterangan negatif atau positif pada rentang X sampai Y");
        System.out.println("  - Mencetak keterangan ganjil atau genap pada rentang X sampai Y");
        
        System.out.println("\nInput Nilai X:");
        int a = ara.nextInt();
        System.out.println("Input Nilai X:");
        int b = ara.nextInt();

        System.out.println("\nOutput nilai X sampai Y beserta keterangan:");

        for (;a<=b;a++){
            if (a<0){
                if (a%2==0){
                    System.out.println(a + " genap negatif");
                }
                if (a%1==0 && a%2!=0){
                    System.out.println(a + " ganjil negatif");
                }
            }else if (a==0){
                System.out.println(a + " nol");
            }else{
                if (a%2==0){
                    System.out.println(a + " genap positif");
                }
                if (a%2==1){
                    System.out.println(a + " ganjil positif");
                }
            }
        }
        System.out.println();
    }
}