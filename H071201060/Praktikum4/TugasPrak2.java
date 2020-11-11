import java.util.Scanner;
public class TugasPrak2{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Input");
		int i = input.nextInt();
		int j = input.nextInt();
		int k = input.nextInt();
		int[][] matriksA = new int[i][j];
		int[][] matriksB = new int[j][k];

        System.out.printf("\nMasukkan elemen Matriks A(%d,%d)\n" , i,j);
		for(int a = 0; a < i; a++){
			for(int b = 0; b < j; b++){
				matriksA[a][b] = input.nextInt();
			}
        }
        System.out.printf("\nMasukkan elemen Matriks B(%d,%d)\n" , j,k);
		for(int b = 0; b < j; b++){
			for(int c = 0; c < k; c++){
				matriksB[b][c] = input.nextInt();
			}
        }
        System.out.printf("\nHasil Perkalian (Matriks C(%d,%d)\n" ,i,k);
		for(int a = 0; a < i; a++){
			for(int b = 0; b < k; b++){
				int total = 0;
				for(int c = 0; c < j; c++){
					total = total + matriksA[a][c] * matriksB[c][b];
                }
				System.out.printf("%d \t", total);
			}
			System.out.println();
		}
		input.close();
	}
}