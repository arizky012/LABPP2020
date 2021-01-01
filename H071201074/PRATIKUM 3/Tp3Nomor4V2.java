import java.util.Scanner;
class Tp3Nomor4V2{
    public static void main(String[] arg) {
        Scanner ex = new Scanner(System.in);
        int barang = ex.nextInt();
        int uang = ex.nextInt();
        
        int kembalian = uang - barang;
        int sisa = kembalian;

        for ( int i = 1 ; i <= 7; i++){
            if ( i == 1){
                int jumlah = sisa / 100000;
                sisa = sisa - ( jumlah * 100000);
                System.out.println( jumlah + " uang Rp. 100000" );
            } else if ( i == 2){
                int jumlah = sisa / 50000;
                sisa = sisa - ( jumlah * 50000);
                System.out.println( jumlah + " uang Rp. 50000");
            } else if ( i == 3){
                int jumlah = sisa / 20000;
                sisa = sisa - ( jumlah * 20000);
                System.out.println( jumlah + " uang Rp. 20000");
            } else if ( i == 4){
                int jumlah = sisa / 10000;
                sisa = sisa - ( jumlah * 10000);
                System.out.println( jumlah + " uang Rp. 10000");
            } else if ( i == 5){
                int jumlah = sisa / 5000;
                sisa = sisa - ( jumlah * 5000);
                System.out.println( jumlah + " uang Rp. 5000");
            } else if ( i == 6){
                int jumlah = sisa / 2000;
                sisa = sisa - ( jumlah * 2000);
                System.out.println( jumlah + " uang Rp. 2000");
            } else{
                int jumlah = sisa / 1000;
                sisa = sisa - ( jumlah * 1000);
                System.out.println( jumlah + " uang Rp. 1000");
            }
        }
    }
}