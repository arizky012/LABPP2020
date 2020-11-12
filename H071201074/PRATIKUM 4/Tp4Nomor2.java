import java.util.Scanner;
class Tp4Nomor2{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int a, b, c;

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        int[][] matrixA = new int[a][b];
        int[][] matrixB = new int[b][c];
        int[][] multi = new int[a][c];

        System.out.println();
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                matrixA[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < b; i++){
            for (int j = 0; j < c; j++){
                matrixB[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < multi.length; i++){
            for (int j = 0; j < matrixA.length + 1; j++){
                for (int k = 0; k < matrixA.length; k++){
                    multi[i][j] += (matrixA[i][k] * matrixB[k][j]);
                }
            }
        }
        System.out.println();
        for (int i = 0; i < a; i++){
            for (int j = 0; j < c; j++){
                System.out.printf("%d\t", multi[i][j]);
            }
            System.out.println();
        }
    }
}