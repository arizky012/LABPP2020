import java.util.Scanner;
public class Tugas3nom1{
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Masukkan X");
        int X = ob.nextInt();
        System.out.println("Masukkan Y");
        int Y = ob.nextInt();
        int a= 0,b=0;

        if(X<Y){
            a=X;
            b=Y;
        }else{
            a=Y;
            b=X;
        }
           

       for (int i = a; i<=b; i++) {
         if (i>0){
             if(i%2==0){
                System.out.println(i+ " genap positif");
             }else{
                System.out.println(i+ " ganjil positif");
             }
         }else if (i==0){
            System.out.println( i+ " nol");
        }
        else {
            if(i%2==1){
             System.out.println(i+ " ganjil negatif");
            }else{
             System.out.println(i+ " genap negatif");
            }
        }
       }
    }
}
