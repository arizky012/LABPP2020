import java.util.Scanner;

class TpNomor2{
    public static void main(String[] aargs) {
        Scanner x = new Scanner(System.in);

        System.out.println( "masukkan nilai");
        int nilai = x.nextInt();

        int jam = nilai/3600;
        int menit = (nilai % 3600) / 60;
        int detik = nilai % 60 ;

        System.out.printf("%02d : %02d : %02d" , jam, menit, detik);


    }
}