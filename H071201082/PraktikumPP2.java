import java.util.Scanner;

// No 2 Praktikum 4

public class PraktikumPP2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();
        int k = input.nextInt();
        int[][] matriks1 = new int [i][j];
        int[][] matriks2 = new int [j][k];

        System.out.println("Masukkan elemen matriks pertama : ");
        for (int l = 0 ; l < i ; l++){
            for (int m = 0 ; m < j ; m++){
                matriks1[l][m] = input.nextInt();
            }
        }
        System.out.println("Masukkan elemen matriks kedua : ");
        for (int m = 0 ; m < j ; m++){
            for (int n = 0 ; n < k ; n++){
                matriks2[m][n] = input.nextInt();
            }
        }
        System.out.println("Hasil perkalian matriks : ");
        for (int l = 0 ; l < i ; l++){
            for (int m = 0 ; m < k ; m++){
                int jumlah = 0;
                for (int n = 0 ; n < j ; n++){
                    jumlah = jumlah + matriks1[l][n] * matriks2[n][m];
                }
                System.out.print(jumlah + "\t");
            }
            System.out.println();
        }
        input.close();
  }
}
