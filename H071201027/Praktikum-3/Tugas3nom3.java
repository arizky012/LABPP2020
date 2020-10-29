import java.util.Scanner;
public class Tugas3nom3 {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
         System.out.println("input nilai awal :");
         int N = X.nextInt();
         int A = 0;
         int B= 1;
         int count=2;
         int next;
     
        System.out.print(A+ " ");
        System.out.print(B+ " ");

         for (int i = 0; count < N; i++) {
             next = A+B;
            
             System.out.print(next+ " ");
            
             A=B;
            
             B = next;
             count =count+1;
            
             
            
       
         }
        
         }
}
