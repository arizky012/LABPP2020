import java.util.Scanner;
/**
 * nomor4
 */
public class nomor4 {
    static Scanner ara = new Scanner (System.in);
    
    public static void main(String[] args) {
        System.out.println("\n*TUGAS PRAKTIKUM 3*\nNOMOR 2");
        System.out.println("\nNama: Ufairah Damara Bashir \nNIM: H07120191 \njurusan: ILMU KOMPUTER B");

        System.out.println("\nPesan:");
        System.out.println("Input:");
        System.out.println("- terdiri dari dua bilangan integer yaitu harga barang dan nilai yang dibayarkan");
        System.out.println("Output");
        System.out.println("- Mencetak kembalian dari transaksi tersebut disertai detail jumlahnya");

        System.out.println("\nInput");
        System.out.println("Harga barang:");
        int a = ara.nextInt();
        System.out.println("Harga yang dibayarkan:");
        int b = ara.nextInt();
        
        System.out.println("\nOutput:");
        int c = b-a;
        int k100 = 0;
        int k50 = 0;
        int k20 = 0;
        int k10 = 0;
        int k5 = 0;
        int k2 = 0;
        int k1 = 0;

        if (b<a){
            System.out.println("Uang Anda kurang" + c);
        }else if (b==a){
            System.out.println("Tidak ada kembalian");
        }
        else if (b>a){
            while (c>=100000){
                c-=100000;
                k100++;
            }
            while (c>=50000){
                c-=50000;
                k50++;
            }
            while (c>=20000){
                c-=20000;
                k20++;
            }
            while (c>=10000){
                c-=10000;
                k10++;
            }
            while (c>=5000){
                c-=5000;
                k5++;
            }
            while (c>=2000){
                c-=2000;
                k2++;
            }
            while (c>=1000){
                c-=1000;
                k1++;
            }
        }
        System.out.println(k100 + " Uang Rp100.000");
        System.out.println(k50 + " Uang Rp50.000");
        System.out.println(k20 + " Uang Rp20.000");
        System.out.println(k10 + "Uang Rp10.000");
        System.out.println(k5 + " Uang Rp5.000");
        System.out.println(k2 + " Uang Rp2.000");
        System.out.println(k1 + " Uang Rp1.000");
        System.out.println();
    }
}