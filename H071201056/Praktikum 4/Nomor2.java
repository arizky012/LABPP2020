import java.util.Scanner;
public class Nomor2 
{
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Masukkan Input");
		int i= read.nextInt();
		int j = read.nextInt();
		int k = read.nextInt();
		int matriks_A[][] = new int[i][j];
		int matriks_B[][] = new int[j][k];

 
        System.out.printf("\n Matriks A(%d,%d)\n" , i,j);
		for(int a = 0; a < i; a++){
			for(int b = 0; b < j; b++){
			matriks_A[a][b] = read.nextInt();
			}
        }
        
        System.out.printf("\nMatriks B(%d,%d)\n" , j,k);
		for(int b = 0; b < j; b++){
			for(int c = 0; c < k; c++){
			matriks_B[b][c] = read.nextInt();
			}
        }
        System.out.printf("\nHasil Perkalian (Matriks C(%d,%d)\n" ,i,k);

		for(int a = 0; a < i; a++){
			for(int b = 0; b < k; b++){
				int total = 0;
				for(int c = 0; c < j; c++){
					total = total + matriks_A[a][c] * matriks_B[c][b];
					//matriksC[a][c] = matriksA[a][b] + matriksB[b][c];
					//total += matriksC[a][c];*/
                }
				System.out.print(total + " ");
			}
			System.out.println();
		}
	}
}
