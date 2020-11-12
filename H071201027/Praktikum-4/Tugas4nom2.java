import java.util.*;
public class Tugas4nom2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();

        int[][] mtrxA=new int[i][j]; 
        int[][] mtrxB=new int[j][k];
        int[][] mtrxAxB=new int[i][k];


        System.out.println("masukkan bilangan matriks A");
        for (int a = 0; a< i; a++) {
            for (int b = 0; b < j; b++) {
                mtrxA[a][b]= in.nextInt();
            }
            
        }

        System.out.println("masukkan bilangan matriks B");
        for (int a = 0; a< j; a++) {
            for (int b = 0; b < k; b++) {
                mtrxB[a][b]= in.nextInt();
            }
            
        }
       
        for (int a = 0; a< mtrxAxB.length; a++) {
            for (int b = 0; b <= mtrxA.length; b++) {
                for (int c = 0; c < mtrxA[0].length; c++) {
                    mtrxAxB[a][b] += (mtrxA[a][c]*mtrxB[c][b]);
                }
                
            }
          
        }
        for (int m = 0; m < i; m++) {
            for (int n = 0; n< k; n++) {
                System.out.printf("%s ",mtrxAxB[m][n]);
            }
            System.out.println();
        }
      
            }
            
}

