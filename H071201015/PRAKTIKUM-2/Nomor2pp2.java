
import java.util.Scanner;

public class Nomor2pp2 {

    public static void main(String[] args) {
    Scanner value = new Scanner(System.in);

        System.out.println("*** Menu ***");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println(" ");

        System.out.println("Input angka yang diinginkan : ");
        int opt1 = value.nextInt();

        double val = 0;
        double opt3 = 0;
        double opt4 = 0;
        double opt5 = 0;

        if (opt1 == 1){
            System.out.println("--- Bangun Datar ---");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Jajar genjang");
            System.out.println("6. Trapesium");
            System.out.println("7. Belah Ketupat");
            System.out.println("8. Layang-layang");
            System.out.println(" ");

            System.out.println("Input angka sesuai bangun datar yang diinginkan : ");
            int opt2 = value.nextInt();

            if (opt2 == 1){
                System.out.println("- Persegi -");

                System.out.println("input sisi : ");
                    opt3 = value.nextDouble();

                     val = opt3 * opt3;
                    System.out.printf("Luas persegi = %.1f " , val);
            }

            else if (opt2 == 2 ){
                System.out.println("- Persegi Panjang -");

                System.out.println("input panjang : ");
                opt3 = value.nextDouble();

                System.out.println("input lebar : ");
                opt4 = value.nextDouble();

                val = opt3 * opt4;
                System.out.printf("Luas Persegi Panjang = %.1f " , val);
            }

            else if (opt2 == 3){
                System.out.println("- Segitiga -");

                System.out.println("input alas : ");
                opt3  = value.nextDouble();

                System.out.println("input tinggi : ");
                opt4 = value.nextDouble();

                val =  (opt3 * opt4)/2f;
                System.out.printf("Luas segitiga = %.1f", val);
            }

            else if (opt2 == 4){
                System.out.println("- Lingkaran -");

                System.out.println("input jari-jari : ");
                opt3 = value.nextDouble();

                val = 3.14 * (opt3 * opt3);
                System.out.printf("Luas Lingkaran = %.1f", val);
            }

            else if (opt2 == 5){
                System.out.println("- Jajar Genjang -");

                System.out.println("input alas : ");
                opt3 = value.nextDouble();

                System.out.println("input tinggi : ");
                opt4 = value.nextDouble();

                val = opt3 * opt4;
                System.out.printf("Luas Jajar genjang = %.1f", val);
            }

            else if (opt2 == 6){
                System.out.println("- Trapesium -");

                System.out.println(" input jumlah rusuk sejajar : ");
                opt3 = value.nextDouble();

                System.out.println("input tinggi : ");
                opt4 = value.nextDouble();

                val = (opt3 * opt4)/2f;
                System.out.printf("Luas Trapesium = %.1f", val);
            }

            else if (opt2 == 7){
                System.out.println("- Belah Ketupat -");

                System.out.println("Input diagonal 1 : ");
                opt3 = value.nextDouble();

                System.out.println("input diagonal 2 : ");
                opt4 = value.nextDouble();

                val = (opt3 * opt4)/2f;
                System.out.printf("Luas Belah Ketupat = %.1f", val);

            }

            else if (opt2 == 8){
                System.out.println("- Layang-layang -");

                System.out.println("Input diagonal 1 : ");
                opt3 = value.nextDouble();

                System.out.println("input diagonal 2 : ");
                opt4 = value.nextDouble();

                val = (opt3 * opt4)/2f;
                System.out.printf("Luas Layang-Layang = %.1f", val);

            }

        }
        else if (opt1 == 2){
            System.out.println("--- Bangun Ruang ---");
            System.out.println("1. Kubus ");
            System.out.println("2. Balok");
            System.out.println("3. Prisma Segitiga");
            System.out.println("4. Limas Segiempat");
            System.out.println("5. Limas Segitiga");
            System.out.println("6. Tabung");
            System.out.println("7. kerucut");
            System.out.println("8. Bola");
            System.out.println(' ');
            System.out.println("Input angka sesuai Bangun Ruang yang diinginkan : ");
            int opt2 = value.nextInt();

            if (opt2 == 1){
                System.out.println("- Kubus -");

                System.out.println("Input sisi : ");
                opt3 = value.nextDouble();

                val = opt3 * opt3 * opt3;
                System.out.printf("Volume Kubus = %.1f", val);
            }

            else if (opt2 == 2){
                System.out.println("- Balok -");

                System.out.println("Input Panjang : ");
                opt3 = value.nextDouble();

                System.out.println("Input Lebar : ");
                opt4 = value.nextDouble();

                System.out.println("Input Tinggi : ");
                opt5 = value.nextDouble();

                val = opt3 * opt4 * opt5;
                System.out.printf("Volume Balok = %.1f", val);
            }

            else if (opt2 == 3){
                System.out.println("- Prisma Segitiga -");

                System.out.println("Input Luas alas : ");
                opt3 = value.nextDouble();

                System.out.println("Input Tinggi : ");
                opt4 = value.nextDouble();

                val = opt3 * opt4;
                System.out.printf("Volume Prisma Segitiga = %.1f", val);
            }

            else if (opt2 == 4){
                System.out.println("- Limas Segiempat -");

                System.out.println("Input Panjang : ");
                opt3 = value.nextDouble();

                System.out.println("Input Lebar : ");
                opt4 = value.nextDouble();

                System.out.println("Input Tinggi : ");
                opt5 = value.nextDouble();

                val = (opt3 * opt4 * opt5)/3f;
                System.out.printf("Volume Limas Segiempat = %.1f", val);
            }

            else if (opt2 == 5){
                System.out.println("- Limas Segitiga -");

                System.out.println("Input Luas alas : ");
                opt3 = value.nextDouble();

                System.out.println("Input Tinggi : ");
                opt4 = value.nextDouble();

                val = (opt3 * opt4)/3f;
                System.out.printf("Volume Limas Segitiga = %.1f", val);
            }

            else if (opt2 == 6){
                System.out.println("- Tabung -");

                System.out.println("input jari-jari : ");
                opt3 = value.nextDouble();

                System.out.println("Input Tinggi : ");
                opt4 = value.nextDouble();

                val = 3.14 * (opt3 * opt3) * opt4;
                System.out.printf("Volume Tabung = %.1f", val);
            }

            else if (opt2 == 7){
                System.out.println("- Kerucut -");

                System.out.println("input jari-jari : ");
                opt3 = value.nextDouble();

                System.out.println("Input Tinggi : ");
                opt4 = value.nextDouble();

                val = (3.14 * (opt3 * opt3) * opt4)/3f;
                System.out.printf("Volume Kerucut = %.1f", val);
            }

            else if (opt2 == 8){
                System.out.println("- Bola -");

                System.out.println("Input Jari-jari : ");
                opt3 = value.nextDouble();

                val = 3.14 * (opt3 * opt3 * opt3);
                System.out.printf("Volume Bola = %.1f", val);
            }
        }

    }
}
