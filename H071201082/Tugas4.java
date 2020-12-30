import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int oneThousand = 0;
        int twoThousand = 0;
        int fiveThousand = 0;
        int tenThousand = 0;
        int twentyThousand = 0;
        int fiftyThousand = 0;
        int oneHundredThousand = 0;
        System.out.print("Harga barang yang ingin anda beli ");
        int hargabarang = user.nextInt();
        System.out.print("Uang anda saat ini sebanyak ");
        int nilaiuang = user.nextInt();

        if (hargabarang<nilaiuang){
            int kembalian = nilaiuang - hargabarang;
            while (kembalian > 0){
                if (kembalian - 100000 >= 0){
                    kembalian = kembalian - 100000;
                    oneHundredThousand++;
                }else if (kembalian - 50000 >= 0){
                    kembalian = kembalian - 50000;
                    fiftyThousand++;
                }else if (kembalian - 20000 >= 0){
                    kembalian = kembalian - 20000;
                    twentyThousand++;
                }else if (kembalian - 10000 >= 0){
                    kembalian = kembalian - 10000;
                    tenThousand++;
                }else if (kembalian - 5000 >= 0){
                    kembalian = kembalian - 5000;
                    fiveThousand++;
                }else if (kembalian - 2000 >= 0){
                    kembalian = kembalian - 2000;
                    twoThousand++;
                }else if (kembalian - 1000 >= 0){
                    kembalian = kembalian - 1000;
                    oneThousand++;
                }
            }

            System.out.println("Kembalian anda : ");
            System.out.println(oneHundredThousand+ " Uang Rp 100.000");
            System.out.println(fiftyThousand+ " Uang Rp 50.000");
            System.out.println(twentyThousand+ " Uang Rp 20.000");
            System.out.println(tenThousand+ " Uang Rp 10.000");
            System.out.println(fiveThousand+ " Uang Rp 5.000");
            System.out.println(twoThousand+ " Uang Rp 2.000");
            System.out.println(oneThousand+ " Uang Rp 1.000");
        }else{
            System.out.print(" Uang anda tak mencukupi :( ");
        }

    }
}
