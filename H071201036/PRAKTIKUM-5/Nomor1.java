import java.util.Scanner;

class Nomor1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama : ");
        int value1 = scan.nextInt();
        System.out.print("Masukkan bilangan kedua : ");
        int value2 = scan.nextInt();
        scan.close();
        int FPB = cariFPB(value1, value2);
        System.out.println("FPB dari " + value1 + " dan " + value2 + " = " + FPB);
    }

    public static int cariFPB(int value1, int value2) {
        int besar, kecil;
        int FPB = 0;
        besar = value2;
        kecil = value1;
        if (value1 > value2) {
            besar = value1;
            kecil = value2;
        }
        for (int i = kecil; i > 0; i--) {
            if (kecil % i == 0 && besar % i == 0) {
                FPB = i;
            }
        }
        return FPB;
    }
}