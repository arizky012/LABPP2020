import java.util.Scanner;
class Tp3Nomor2{
    public static void main(String[] arg){
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int y = a.nextInt();

        int num = 1;

        if ( x <= y){
            while ( num  <= y){
                for ( int i = 0; i< x; i++){
                    System.out.print(num+" ");
                    num++;
                    if ( num > y){
                        break;
                    }
                }
                System.out.println();
            }
        } else{
            System.out.println("Tabe ganti ki inputan ta' sesuai syarat");
        }
    }
}