import java.util.Scanner;
class Tp3Nomor1 {
    public static void main(String[] arg){
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int y = a.nextInt();
        if ( x < y){
        for ( int i = x; i <= y; i++){
            if( i%2 == 0 && i < 0) {
                System.out.println( i + " genap negatif");
            } else if ( i%2 != 0 && i < 0){
                System.out.println( i + " ganjil negatif");
            } else if (i == 0){
                System.out.println(i + " nol");
            } else if ( i%2 == 0 && i >0){
                System.out.println( i + " genap positif");
            } else if ( i%2 != 0 && i > 0){
                System.out.println( i + " ganjil positif");
            }
        }a.close();
    } else {
        for ( int i = y ; i <= x; i++){
            if( i%2 == 0 && i < 0) {
                System.out.println( i + " genap negatif");
            } else if ( i%2 != 0 && i < 0){
                System.out.println( i + " ganjil negatif");
            } else if (i == 0){
                System.out.println(i +" nol");
            } else if ( i%2 == 0 && i >0){
                System.out.println( i + " genap positif");
            } else if ( i%2 != 0 && i > 0){
                System.out.println( i + " ganjil positif");

        }
        a.close();
    }
    }
}
}
    

