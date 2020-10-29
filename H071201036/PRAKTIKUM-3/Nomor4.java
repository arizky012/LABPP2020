import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int seribu = 0, duaRibu = 0, limaRibu = 0, sepuluhRibu = 0, duaPuluhRibu = 0, limaPuluhRibu = 0, seratusRibu = 0;
            int hargaBarang = input.nextInt();
            int nilaiUang = input.nextInt();

            if (hargaBarang <= nilaiUang) {
                int kembalian = nilaiUang - hargaBarang;
                while (kembalian > 0) {
                    if (kembalian - 100000 >= 0) {
                        kembalian -= 100000;
                        seratusRibu++;
                    } else if (kembalian - 50000 >= 0) {
                        kembalian -= 50000;
                        limaPuluhRibu++;
                    } else if (kembalian - 20000 >= 0) {
                        kembalian -= 20000;
                        duaPuluhRibu++;
                    } else if (kembalian - 10000 >= 0) {
                        kembalian -= 10000;
                        sepuluhRibu++;
                    } else if (kembalian - 5000 >= 0) {
                        kembalian -= 5000;
                        limaRibu++;
                    } else if (kembalian - 2000 >= 0) {
                        kembalian -= 2000;
                        duaRibu++;
                    } else if (kembalian - 1000 >= 0) {
                        kembalian -= 1000;
                        seribu++;
                    }
                }
                System.out.println(seratusRibu + " uang Rp.100.000");
                System.out.println(limaPuluhRibu + " uang Rp.50.000");
                System.out.println(duaPuluhRibu + " uang Rp.20.000");
                System.out.println(sepuluhRibu + " uang Rp.10.000");
                System.out.println(limaRibu + " uang Rp.5.000");
                System.out.println(duaRibu + " uang Rp.2.000");
                System.out.println(seribu + " uang Rp.1.000");
            } else {
                System.out.print("Maaf uang Anda tidak cukup !!");
            }
        input.close();
        } catch (Exception n) {
            System.out.print("Input data tidak valid");
        }
    }
}
