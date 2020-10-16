import java.util.Scanner;

public class Tugasnomor1{
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int t = input.nextInt();
         int x = input.nextInt();
         float B = (t * x) / 14f;

         System.out.printf("Jumlah Bensin Yang Dihabiskan : %.3f L", B);

     }
}