import java.util.*;

 // Compiler version JDK 11.0.2

 class nomorSatu{
   static Scanner ara = new Scanner (System.in);
   public static void main(String args[]){ 
    System.out.println("Input panjang Array: ");
    int n = ara.nextInt();
    int N[] = new int[n];
    
    
    System.out.println("\nInput isi dari Array: ");
    for (int i = 0; i < N.length; i++){
      N[i] = ara.nextInt();
    }
    
    System.out.println("\nOutput: ");
    int prime = 0;
    for (int i = 0;i<N.length;i++){
      for (int j = 0; j < N.length; j++){
        int b = Math.min(N[i], N[j]);
        for (int k = 1; k<=b; k++){
          if ((N[i]%k==0) && (N[j]%k==0)){
          prime = k;
          }
        }
        
        if (prime == 1){
          System.out.println( N[i]+ " " + N[j]);
        }
      }
    }
   }
 }
