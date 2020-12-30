import java.util.Random;
import java.util.Scanner;

// No 2 Praktikum 5

public class Ac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input blok : ");
        int n = input.nextInt();
        System.out.print("Input Digit : ");
        int m = input.nextInt();
        String serialNumber = generateSerial(n,m);
        System.out.println(serialNumber);
        input.close();
    }

    public static String generateSerial(int n , int m){
            Random ran = new Random();
            String str = new String();
            for (int i = 1 ; i <= n ; ++i){
                for (int j = 1 ; j <= m ; ++j){
                    str += ran.nextInt(10);
                }
                if (i < n){
                    str += "-";
                } 
            }
            return str;
    }

}
