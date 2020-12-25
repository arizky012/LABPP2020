import java.util.Scanner;

public class prak3no1 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        int a = 0;
        int b = 0;

        if (x < y){
        a = x;
        b = y;
        }else{
        a = y;
        b = x;

        }for (int i = a; i <= b; i++){
        if (i < 0){

        if (i % 2 == 0){
        System.out.printf("%d genap negatif\n", i);
        }else{
        System.out.printf("%d ganjil negatif\n", i);
        }
        }else if (i == 0){
        System.out.printf("%d nol\n", i);
        }else

        {if (i % 2 == 0){
        System.out.printf("%d genap positif\n", i);
        }else{
        System.out.printf("%d ganjil positif\n", i);
        }
    }
}
in.close();
            }
    }
    
