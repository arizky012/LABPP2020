import java.util.*;

 // Compiler version JDK 11.0.2

 class nomorDua{
   static Scanner ara = new Scanner (System.in);
   public static void main(String args[]){
    System.out.println("pesan:");
    System.out.println("- Array A dua dimensi terdiri dari inputan i dan j");
    System.out.println("- Array B dua dimensi terdiri dari inputan j dan k");
    
    System.out.println("\ninput i, j , k : "); 
    int i = ara.nextInt();
    int j = ara.nextInt();
    int k = ara.nextInt();
    
    int total = 0;
    
    int A[][] = new int [i][j];
    int B[][] = new int [j][k];
    int C[][] = new int [i][k];
    
    System.out.println("\ninput elemen A :");
    for (int a = 0; a<i;a++){
      for (int b = 0; b <j; b++){
        A[a][b] = ara.nextInt();
      }
    }
    
    System.out.println("\ninput elemen B :");
    for (int a = 0; a<j; a++){
      for (int b = 0; b<k; b++){
        B[a][b] = ara.nextInt();
      }
    }
    
    System.out.println("\nHasil:");
    for (int a = 0; a<i;a++){
      for (int b = 0; b<k;b++){
        total = 0;
        for (int c = 0; c<j;c++){
          total = total + A[a][c] * B[c][b];
          C[a][b] = total;
          
        }
        System.out.print(C[a][b] + " ");
      }
      System.out.println();
    }
   }
}