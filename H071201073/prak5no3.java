import java.util.Scanner;

public class prak5no3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        myDay(n);
    }

    public static void myDay(int nilai) {
        int tahun = nilai / 365;
        int bulan = (nilai % 356) / 30;
        int hari = (nilai % 365) % 30;

        System.out.println(tahun + " Tahun");
        System.out.println(bulan + " Bulan");
        System.out.println(hari + " Hari ");

    }
}
