import java.util.*;

 // Compiler version JDK 11.0.2

 class no03{
   public static void main(String args[]){
     System.out.println("Masukkan inputan:"); 
     Scanner ara = new Scanner (System.in);
     int input = ara.nextInt();
    
    umur(input);
   }
   public static void umur(int proses){
    System.out.println("\noutput:");
    int tahun = proses/365;
    int bulan = (proses-365)/30;
    int hari = proses-365-30;
    
    System.out.printf("tahun : %d \nbulan : %d \nhari: %d\n", tahun, bulan, hari);
   }
 }
