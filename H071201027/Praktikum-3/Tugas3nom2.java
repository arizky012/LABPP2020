import java.util.*;
public class Tugas3nom2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Masukkan X");
        int X = x.nextInt();
        System.out.println("Masukkan Y");
        int Y = x.nextInt();
        if(X>Y){
            System.out.println("INPUT ANDA SALAH, INPUT YANG BENAR ADALAH X<Y");
        }else {
            for (int i = 1;  i<X; i++) {
                System.out.print(i+ " " );
               
                } for (int j = X; j<=Y; j++) {
                    System.out.print(j+ " ");
                    if(j%X==0){
                        System.out.println();
                    }
            }
            System.out.println();
        }
      
        
    }

}
