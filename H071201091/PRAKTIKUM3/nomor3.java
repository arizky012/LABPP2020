import java.util.Scanner;

/**
 * nomor3
 */
public class nomor3 {
    static Scanner ippa = new Scanner(System.in);
    public static void main(String[]args) {

        System.out.println("\n*TUGAS PRAKTIKUM 3*\nNOMOR 3");
        System.out.println("\nNama: Ufairah Damara Bashir \nNIM: H07120191 \njurusan: ILMU KOMPUTER B");

        System.out.println("\nPesan:");
        System.out.println("- Sebuah himpunan disebut himpunan A");
        System.out.println("- A adalah himpunan yang anggotanya dimulai dari 0 dan 1");
        System.out.println("- Bilangan selanjutnya adalah jumlah dari 2 angka sebelumnya");
        System.out.println("Input: \n-Nilai n yang menyatakan elemen ke-n dalam himpunan A");
        System.out.println("Output: \n-Mencetak elemen pertama hinggan n dalam A");
        
        int n1 = 0;
        int n2 = 1;

        System.out.println("\nMasukan nilai n:");
        int nn = ippa.nextInt();

        System.out.println("\nOutput:");
        System.out.print(n1 + " ");
        System.out.print(n2 + " ");
        for (int i = 3; i<=nn ; i++){
            int nt = n1 + n2;
            n1 = n2;
            n2 = nt;
            System.out.print(nt + " ");
        }
        System.out.println("\n");
    }
}
