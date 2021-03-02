import java.util.*;

 // Compiler version JDK 11.0.2

 class no02{
   public static void main(String args[]){ 
    Scanner scanner = new Scanner (System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    String serialNumber = generateSerial(n,m);
    System.out.println(serialNumber);
   }
   public static String generateSerial(int n, int m){
     String str = new String();
     Random r = new Random();
     int N[][] = new int[n][m];
     
     
     for (int i = 0; i < n; i++){
       for (int j = 0; j < m; j++){
         N[i][j] = r.nextInt(9);
         System.out.print(N[i][j]);
       }
       if (i==(n-1)){
         System.out.print("");
       }
       else{
         System.out.print("-");
       }
       
     }
     return str;
 }
 }
