import java.util.Scanner;
import java.util.Random;

public class P5Nomor2{
    public static void main(String[] arg){
        Scanner scaner = new Scanner(System.in);
        Random ran = new Random();
        int n = scaner.nextInt();
        int m = scaner.nextInt();
        String serialNumber = generateSerial(n,m);
        System.out.println(serialNumber);
    }

        static String generateSerial (int a, int b){
        Random ran = new Random();
        String str = Integer.toString(a,b);

        for (int i = 1; i <= a; i++){
            for (int j = 1; j <= b ; j++){
                str += ran.nextInt(10);
                }
                if (i < a){
                    str += "-";
                }
            }
        return str;
    }
    
}