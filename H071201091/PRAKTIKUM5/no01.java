import java.util.*;

 // Compiler version JDK 11.0.2

 class no01{
   public static void main(String args[]){ 
    Scanner ara = new Scanner (System.in);
    int a = ara.nextInt();
    int b = ara.nextInt();
    
    cariFPB(a,b);
   }
   public static void cariFPB(int x, int y){
     do {
       int c = y;
       y = x%y;
       x = c;
   } while (y != 0);
     int result = x;
     System.out.println(result);
   }
 }
