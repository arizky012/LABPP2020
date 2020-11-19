import java.util.Scanner;
public class Soal3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1 tahun = 365 hari, 1 bulan = 30 hari, 1 tahun = 1 bulan
        int x = scan.nextInt();
        scan.close();
        myDay(x);
        
    }
    public static void myDay(int x){
        int tahun = x / 365;
        int sisa = x % 365;
        int bulan = sisa / 30;
        int hari = x - (tahun * 365 + bulan * 30);
        System.out.printf("%d tahun\n%d bulan\n%d hari", tahun,bulan,hari);
    }
        

}
