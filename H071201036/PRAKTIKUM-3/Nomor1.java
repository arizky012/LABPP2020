import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukan nilai awal ");
            int x = input.nextInt();
            System.out.print("Masukan nilai akhir ");
            int y = input.nextInt();
            int a = 0, b = 0;

            if (x<y){
                a = x;
                b = y;
            }
            else{
                a = y;
                b = x;
            }

            for (int i = a; i <= b; i++) {
                if (i % 2 == 0 && i < 0) {
                    System.out.println(i + " genap negatif");
                } else if (i % 2 == 0 && i > 0) {
                    System.out.println(i + " genap positif");
                } else if (i % 2 != 0 && i < 0) {
                    System.out.println(i + " ganjil negatif");
                } else if (i % 2 != 0 && i > 0) {
                    System.out.println(i + " ganjil positif");
                } else {
                    System.out.println(i + " nol");
                }
            }
            input.close();
        } catch (Exception n) {
            System.out.print("Data harus bilangan bulat");
        }
    }
}