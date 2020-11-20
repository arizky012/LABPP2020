import java.util.Scanner;
import java.util.Random;

public class Tp5Nomor2{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        String serialNumber = generateSerial(n,m);
        System.out.println(serialNumber);
    }

    static String generateSerial (int n, int m){
        Random ran = new Random();
        String str = new String();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m ; j++){
                str += ran.nextInt(10);  
            }
            if ( i < n){
                str += "-";
            }
        }
        return str;
    }
    
} 