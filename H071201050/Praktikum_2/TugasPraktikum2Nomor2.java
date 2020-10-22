import java.util.Scanner;
public class TugasPraktikum2Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println("\nInput angka sesuai dengan Menu tang diinginkan : ");
        int menu = input.nextInt();

        switch (menu){
            case 1:
                System.out.println("** Pilih Bangun Datar **");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Segitiga");
                System.out.println("4. Lingkaran");
                System.out.println("5. Jajar Genjang");
                System.out.println("6. Trapesium");
                System.out.println("7. Belah Ketupat");
                System.out.println("8. Layang-Layang");
                System.out.println("\nInput angka sesuai dengan nomor bangun datar yang diinginkan : ");
                int pilihBangunDatar = input.nextInt();

                switch (pilihBangunDatar){
                    case 1:
                        System.out.println("Input Sisi");
                        double s = input.nextDouble();
                        double luasPersegi = s * s;
                        System.out.printf("Luas Persegi = %.1f", luasPersegi);
                        break;
                    case 2:
                        System.out.println("Input Panjang");
                        double p = input.nextDouble();
                        System.out.println("Input Lebar");
                        double l = input.nextDouble();
                        double luasPersegiPanjang = p * l;
                        System.out.printf("Luas Persegi Panjang = %.1f", luasPersegiPanjang);
                        break;
                    case 3:
                        System.out.println("Input Alas");
                        double a = input.nextDouble();
                        System.out.println("Input Tinggi");
                        double t = input.nextDouble();
                        double luasSegitiga = (a * t) / 2;
                        System.out.printf("Luas Segitiga = %.1f", luasSegitiga);
                        break;
                    case 4:
                        System.out.println("Input Jari-jari");
                        double r = input.nextDouble();
                        double luasLingkaran = Math.PI * Math.pow(r, 2);
                        System.out.printf("Luas Lingkaran = %.1f", luasLingkaran);
                        break;
                    case 5:
                        System.out.println("Input Alas");
                        a = input.nextDouble();
                        System.out.println("Input Tinggi");
                        t = input.nextDouble();
                        double luasJajarGenjang = a * t;
                        System.out.printf("Luas Jajar Genjang = %.1f", luasJajarGenjang);
                        break;
                    case 6:
                        System.out.println("Input a");
                        a = input.nextDouble();
                        System.out.println("Input b");
                        double b = input.nextDouble();
                        System.out.println("Input Tinggi");
                        t = input.nextDouble();
                        double luasTrapesium = ((a + b) * t) / 2;
                        System.out.printf("Luas Trapesium = %.1f", luasTrapesium);
                        break;
                    case 7:
                        System.out.println("Input Diagonal 1");
                        double d1 = input.nextDouble();
                        System.out.println("Input Diagonal 2");
                        double d2 = input.nextDouble();
                        double luasBelahKetupat = (d1 * d2) / 2;
                        System.out.printf("Luas Belah Ketupat = %.1f", luasBelahKetupat);
                        break;
                    case 8:
                        System.out.println("Input Diagonal 1");
                        d1 = input.nextDouble();
                        System.out.println("Input Diagonal 2");
                        d2 = input.nextDouble();
                        double luasLayangLayang = (d1 * d2) / 2;
                        System.out.printf("Luas Belah Ketupat = %.1f", luasLayangLayang);
                        break;
                    default:
                        System.out.println("Masukkan pilihan dengan benar");
                        break;
                }
                break;
            case 2 :
                System.out.println("** Pilih Bangun Ruang **");
                System.out.println("1. Kubus");
                System.out.println("2. Balok");
                System.out.println("3. Tabung");
                System.out.println("4. Kerucut");
                System.out.println("5. Bola");
                System.out.println("6. Prisma");
                System.out.println("7. Limas");
                System.out.println("\nInput angka sesuai dengan nomor bangun ruang yang diinginkan : ");
                int pilihBangunRuang = input.nextInt();
                switch (pilihBangunRuang){
                    case 1:
                        System.out.println("Input Sisi");
                        double s = input.nextDouble();
                        double volumeKubus = Math.pow(s, 3);
                        System.out.printf("Volume Kubus = %.1f", volumeKubus);
                        break;
                    case 2:
                        System.out.println("Input Panjang");
                        double p = input.nextDouble();
                        System.out.println("Input Lebar");
                        double l = input.nextDouble();
                        System.out.println("Input Tinggi");
                        double t = input.nextDouble();
                        double volumeBalok = p * l * t;
                        System.out.printf("Volume Balok = %.1f", volumeBalok);
                        break;
                    case 3:
                        System.out.println("Input Tinggi");
                        t = input.nextDouble();
                        System.out.println("Input Jari-Jari");
                        double r = input.nextDouble();
                        double volumeTabung = Math.PI * Math.pow(r, 2) * t;
                        System.out.printf("Volume Tabung = %.1f", volumeTabung);
                        break;
                    case 4:
                        System.out.println("Input Tinggi");
                        t = input.nextDouble();
                        System.out.println("Input Jari-Jari");
                        r = input.nextDouble();
                        double volumeKerucut = (Math.PI * Math.pow(r, 2) * t) / 3;
                        System.out.printf("Volume Kerucut = %.1f", volumeKerucut);
                        break;
                    case 5:
                        System.out.println("Input Jari-Jari");
                        r = input.nextDouble();
                        double volumeBola = (Math.PI * Math.pow(r, 3) * 4) / 3;
                        System.out.printf("Volume Bola = %.1f", volumeBola);
                        break;
                    case 6:
                        System.out.println("Input Panjang Alas");
                        p = input.nextDouble();
                        System.out.println("Input Lebar Alas");
                        l = input.nextDouble();
                        System.out.println("Input Tinggi");
                        t = input.nextDouble();
                        double volumePrisma = (p * l) * t;
                        System.out.printf("Volume Prisma = %.1f", volumePrisma);
                        break;
                    case 7:
                        System.out.println("Input Panjang Alas");
                        p = input.nextDouble();
                        System.out.println("Input Lebar Alas");
                        l = input.nextDouble();
                        System.out.println("Input Tinggi");
                        t = input.nextDouble();
                        double volumeLimas = ((p * l) * t) / 3;
                        System.out.printf("Volume Prisma = %.1f", volumeLimas);
                        break;
                    default:
                        System.out.println("Masukkan pilihan dengan benar");
                        break;
                }
                break;
            default:
                System.out.println("Masukkan pilihan dengan benar");
                break;
        }
    }
}
