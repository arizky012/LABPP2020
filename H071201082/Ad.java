import java.util.Scanner;

// No 3 Praktikum 5

public class Ad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usia = input.nextInt();
        myDay(usia); 
        input.close();
    }
    public static void myDay(int usia) {
        int tahun = usia / 365;
        int bulan = (usia % 365) / 30;
        int hari = (usia % 365) % 30;

        System.out.println(tahun + " Tahun");
        System.out.println(bulan + " Bulan");
        System.out.println(hari + " Hari");
    }
}
