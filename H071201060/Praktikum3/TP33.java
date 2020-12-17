import java.util.Scanner;

public class TP33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        System.out.printf("%d ",a);
        int b = 1;
        System.out.printf("%d ", b );
        for(int i = 3; i <= n; i++){
            
            int next = a + b;
            System.out.printf("%d ", next);
            a = b;
            b = next;
            
        }
        scan.close();
    }
    
}
