import java.util.Scanner;
public class Tp5Nomor3{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int umur = scan.nextInt();
        int tahun = year(umur);
        int bulan = month(umur);
        int hari = day(umur);
        System.out.println(tahun+" tahun");
        System.out.println(bulan+" bulan");
        System.out.println(hari+" hari");
    }
    static int year(int n){
        int tahun = n / 365;
        //System.out.println(tahun);
        return tahun;
    }
    static int month(int n){
        int tahun = n / 365;
        int bulan = (n % 356) / 30;
        //System.out.println(bulan);
        return bulan;
    }
    static int day(int n){
        int tahun = n / 365;
        int bulan = (n % 365) / 30;
        int hari = (n % 365) % 30;
        //System.out.println(hari);
        return hari;
    }
}