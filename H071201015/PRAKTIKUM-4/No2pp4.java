import java.util.Scanner;

 class No2pp4 {
  public static void main(String[] args) {
      Scanner val = new Scanner(System.in);
      int i = val.nextInt();
      int j = val.nextInt();
      int k = val.nextInt();

      int[][] mat1 = new int [i][j];
      int[][] mat2 = new int [j][k];
      int[][] mat3 = new int [i][k];

      System.out.println("input elemen matriks a");
      for (int l = 0;l < i ;l++ ) {
        for (int m = 0;m < j ;m++ ) {
          mat1[l][m] = val.nextInt();
        }
      }
      System.out.println("input elemen matriks b");
      for (int l = 0;l < j ;l++ ) {
        for (int m = 0;m < k ;m++ ) {
          mat2[l][m] = val.nextInt();
        }
      }
      System.out.println();
      //System.out.println("work");

      for (int l = 0;l < i ;l++ ) {
        for (int m = 0;m < k ;m++ ){
          for (int n = 0;n < j ;n++ ) {
            mat3[l][m] += mat1[l][n] * mat2[n][m];
            }
          }
        }
        System.out.println("");
        System.out.println("hasil perkalian matriks a dan matriks b");
        for (int l = 0;l < i ;l++ ) {
          for (int m = 0;m < k ;m++ ) {
            System.out.print( mat3[l][m] + " ");
          }
          System.out.println(' ');
      }
      val.close();
  }
}
