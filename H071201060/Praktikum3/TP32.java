import java.util.Scanner;
public class TP32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x < y){
            for (int i = 1; i <= y ; i++){
                if(i % x == 0){
                System.out.printf("%d\n", i);
            
                }else {System.out.printf("%d ", i);}
            } 
        }
        scan.close();
    }
}
