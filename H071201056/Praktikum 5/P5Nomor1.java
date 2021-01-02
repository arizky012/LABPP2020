import java.util.Scanner;
public class P5Nomor1{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int FPB = cariFPB(x,y);
        System.out.printf("FPB dari %d dan %d = %d", x, y, FPB);

    }
    static int cariFPB(int a, int b){
        int kecil = a;
        int besar = b;
        int FPB = 0;
        if ( a > b){
            kecil = b;
            besar = a;
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
    

