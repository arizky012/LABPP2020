import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println(" * Deret fibonacci * ");
        System.out.print("Berapa baris yang ingin anda ketahui : ");
        int n = user.nextInt();
        int a = 0;
        int b = 1;
        
         System.out.print(a + " ");
         System.out.print(b);

        for (int i = 2;i < n;i++){
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }
}