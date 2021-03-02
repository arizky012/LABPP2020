import java.util.Scanner;

public class nomor2 {
    static Scanner ara = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("\n*TUGAS PRAKTIKUM 3*\nNOMOR 2");
        System.out.println("\nNama: Ufairah Damara Bashir \nNIM: H07120191 \njurusan: ILMU KOMPUTER B");

        System.out.println("\nPesan:");
        System.out.println("Nilai X dan Y adalah integer.");
        System.out.println("- Output akan tercetak secara horizontal sebanyak X.");
        System.out.println("- Output akan mencetak secara vertikal semua nilai dari 1 sampai Y.");

        System.out.println("\nMasukkan nilai X :");
        int X = ara.nextInt();
        System.out.println("Masukkan nilai Y :");
        int Y = ara.nextInt();
        System.out.println("\nOutput:");

        if (X<Y){
            for (int i = 1; i<=Y; i++){
                System.out.print(i+" ");
                if (i%X==0){
                    System.out.println();
                }
            }
        }else{
            System.out.println("inputan harus X<Y");
        }System.out.println();
        
    }
}
