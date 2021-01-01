import java.util.Scanner;
public class Tp5Nomor1{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int FPB = cariFPB(x,y);
        System.out.printf("FPB dari %d dan %d = %d", x, y, FPB);

    }
    static int cariFPB(int n, int m){
        int kecil = n;
        int besar = m;
        int FPB = 0;
        if ( n > m){
            kecil = m;
            besar = n;
        }
        for ( int i = kecil ; i > 0; i--){
            if (kecil % i == 0 && besar % i == 0){
                FPB = i;
            break;
            }
        }
        return FPB;
    }
}