import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.close();
        int year = year(x);
        int month = month(x);
        int day = day(x);
        System.out.printf("%d tahun \n%d bulan \n%d hari", year, month, day);
    }
    static int year (int x){
        int year = x / 365;
        return year;
    }
    static int month (int x){
        int month = (x % 365)/30;
        return month;
    }
    static int day (int x){
        int day = (x % 365) % 30;
        return day;
    }
}