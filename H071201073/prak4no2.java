import java.util.Scanner;

public class prak4no2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int[][] matriks1 = new int[i][j];
        int[][] matriks2 = new int[j][k];
        int[][] hasil = new int[i][k];

        System.out.println();
        for (int p = 0; p < i; p++) {
            for (int q = 0; q < j; q++) {
                matriks1[p][q] = in.nextInt();
            }
        }
        System.out.println();
        for (int p = 0; p < j; p++) {
            for (int q = 0; q < k; q++) {
                matriks2[p][q] = in.nextInt();
            }
        }
        System.out.println();
        for (int p = 0; p < i; p++) {
            for (int q = 0; q < k; q++) {
                for (int r = 0; r < j; r++) {
                    hasil[p][q] += matriks1[p][r] * matriks2[r][q];
                }
                System.out.print(hasil[p][q] + " \t ");
            }
            System.out.println();
        }
    }

}
