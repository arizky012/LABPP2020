import java.util.Scanner;

public class Prak6no2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kata = in.nextLine();
        int count = kata.length();
        int num[] = new int[count];

        // mengubah string ke int
        // untuk character yang ganjil
        for (int i = 0; i < count; i++) {
            num[i] = kata.codePointAt(i);
        }

        // seleksi index genap dan ganjil
        char[] rentang = kata.toCharArray();
        String result = "";
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                result += rentang[i];
            } else {
                int ubah = num[i];
                result += ubah;
            }
        }

        // penentuan jumlah karakter
        int panjang = result.length();
        int panjangResult = (int) Math.ceil(result.length() / 16.0);
        int sisa = (panjangResult * 16) - panjang;

        for (int i = 0; i < sisa; i++) {
            result += '?';
        }

        // cetak matriks
        char[] resultArray1 = result.toCharArray();
        int a = 0;
        for (int i = 0; i < 4; i++) {// baris
            for (int j = 0; j < 4; j++) {// kolom
                for (int k = 0; k < panjangResult; k++) {// jumlah karakter
                    System.out.print(resultArray1[a]);
                    a++;
                }
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}