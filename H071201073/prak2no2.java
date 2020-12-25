import java.util.Scanner;

public class prak2no2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("**MENU**");
        System.out.println("1. Mencari luas bangunan datar ");
        System.out.println("2. Mencari volume bangunan datar ");
        System.out.println("Input angka sesuai dengan menu yang diinginkan : ");
        int angka = in.nextInt();
        int bangunDatar;
        if (angka == 1) {
            System.out.println(" ");
            System.out.println("** Pilih Bangun Datar **");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Jajar Genjang ");
            System.out.println("6. Trapesium");
            System.out.println("7. Belah Ketupat");
            System.out.println("8. Layang-Layang");
            System.out.println(" ");
            System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan : ");
            bangunDatar = in.nextInt();
            switch (bangunDatar) {
                // Persegi
                case 1:
                    System.out.println("Input sisi persegi: ");
                    int sisi = in.nextInt();
                    double sisi2 = sisi * sisi;
                    System.out.println("Luas Persegi adalah: " + sisi2);
                    break;
                // Persegipanjang
                case 2:
                    System.out.println("Input Panjang Persegi Panjang: ");
                    int panjang = in.nextInt();
                    System.out.println("Input Lebar Persegi Panjang: ");
                    int lebar = in.nextInt();
                    double luas = panjang * lebar;
                    System.out.println("Luas Persegi Panjang: " + luas);
                    break;
                // Segitiga
                case 3:
                    System.out.println("Input Alas: ");
                    int alas = in.nextInt();
                    System.out.println("Input Tinggi: ");
                    int tinggi = in.nextInt();
                    double luasSegitiga = (alas * tinggi) / 2;
                    System.out.println("Luas Segitiga adalah: " + luasSegitiga);
                    break;
                // Lingkaran
                case 4:
                    System.out.println("Input Phi: ");
                    double phi = Math.PI;
                    System.out.println("Input Jari-jari:  ");
                    int jari2 = in.nextInt();
                    double luasLingkaran = phi * Math.pow(jari2, 2);
                    System.out.printf("Luas Lingkaran adalah: " + "%.2f \n", luasLingkaran);
                    break;
                // Jajar Genjang
                case 5:
                    System.out.println("Input Alas: ");
                    int alas2 = in.nextInt();
                    System.out.println("Input Tinggi: ");
                    int tinggi2 = in.nextInt();
                    double luasGenjang = alas2 * tinggi2;
                    System.out.println("Luas Jajar Genjang adalah: " + luasGenjang);
                    break;
                // Trapesium
                case 6:
                    System.out.println("Input Panjang Sisi Sejajar: ");
                    int panjangSisi = in.nextInt();
                    System.out.println("Input Tinggi: ");
                    int tinggi3 = in.nextInt();
                    double luasTrapesium = (panjangSisi * tinggi3) / 2;
                    System.out.println("Luas Trapesium adalah: " + luasTrapesium);
                    break;
                // Belahketupat
                case 7:
                    System.out.println("Input Alas: ");
                    int alas4 = in.nextInt();
                    System.out.println("Input Tinggi: ");
                    int tinggi4 = in.nextInt();
                    double luasBelah = alas4 * tinggi4;
                    System.out.println("Luas Belah Ketupat adalah: " + luasBelah);
                    break;
                // Layang-layang
                case 8:
                    System.out.println("Input Diagonal1: ");
                    int diagonal1 = in.nextInt();
                    System.out.println("Input Diagonal2: ");
                    int diagonal2 = in.nextInt();
                    double luasLayang = (diagonal1 * diagonal2) / 2;
                    System.out.println("Luas Layang-layang adalah: " + luasLayang);
                    break;
            }
        } else if (angka == 2) {
            System.out.println(" ");
            System.out.println("** Pilih Bangun Ruang **");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Limas SegiEmpat");
            System.out.println("4. Prisma Segitiga");
            System.out.println("5. Limas Segitiga ");
            System.out.println("6. Silinder");
            System.out.println("7. Kerucut");
            System.out.println("8. Bola");
            System.out.println("Input angka sesuai dengan nomor bangun ruang yang diinginkan : ");
            bangunDatar = in.nextInt();
            switch (bangunDatar) {
                // Kubus
                case 1:
                    System.out.println("Input Rusuk: ");
                    int rusuk = in.nextInt();
                    double volume = Math.pow(rusuk, 3);
                    System.out.println("Volume Bangun Datar Kubus adalah: " + volume);
                    break;
                // Balok
                case 2:
                    System.out.println("Input Panjang: ");
                    int panjangBalok = in.nextInt();
                    System.out.println("Input Lebar: ");
                    int lebarBalok = in.nextInt();
                    System.out.println("Input tinggi: ");
                    int tinggiBalok = in.nextInt();
                    double volumeBalok = panjangBalok * lebarBalok * tinggiBalok;
                    System.out.println("Volume Bangun Datar Balok adalah: " + volumeBalok);
                    break;
                // Limas segiempat
                case 3:
                    System.out.println("Input Luas Alas: ");
                    int luasAlas = in.nextInt();
                    System.out.println("Input Lebar: ");
                    int tinggiLimas4 = in.nextInt();
                    double volumeLimas4 = (luasAlas * tinggiLimas4) / 3;
                    System.out.println("Volume Bangun Datar Segi Empat adalah: " + volumeLimas4);
                    break;
                // Prisma Segitiga
                case 4:
                    System.out.println("Input alas: ");
                    int alasPrisma3 = in.nextInt();
                    System.out.println("Input t: ");
                    int t = in.nextInt();
                    System.out.println("Input Tinggi: ");
                    int tinggiPrisma3 = in.nextInt();
                    double volumePrisma3 = (alasPrisma3 * t * tinggiPrisma3) / 2;
                    System.out.println("Volume Prisma Segitiga adalah: " + volumePrisma3);
                    break;
                // Limas Segitiga
                case 5:
                    System.out.println("Input alas: ");
                    int alasLimas3 = in.nextInt();
                    System.out.println("Input t: ");
                    int t3 = in.nextInt();
                    System.out.println("Input Tinggi: ");
                    int tinggiLimas3 = in.nextInt();
                    double volumeLimas3 = (alasLimas3 * t3 * tinggiLimas3) / 6;
                    System.out.println("Volume Limas Segitiga adalah: " + volumeLimas3);
                    break;
                // Silinder
                case 6:
                    System.out.println("Input phi: ");
                    double phiSilinder = Math.PI;
                    System.out.println("Input jari-jari: ");
                    int jariSilinder = in.nextInt();
                    System.out.println("Input Tinggi: ");
                    int tinggiSilinder = in.nextInt();
                    double volumeSilinder = phiSilinder * Math.pow(jariSilinder, 2) * tinggiSilinder;
                    System.out.printf("Volume Silinder adalah: " + "%.2f", volumeSilinder);
                    break;
                // Kerucut
                case 7:
                    System.out.println("Input phi: ");
                    double phiKerucut = Math.PI;
                    System.out.println("Input jari-jari: ");
                    int jariKerucut = in.nextInt();
                    System.out.println("Input Tinggi: ");
                    int tinggiKerucut = in.nextInt();
                    double volumeKerucut = (phiKerucut * Math.pow(jariKerucut, 2) * tinggiKerucut) / 3;
                    System.out.printf("Volume Kerucut adalah: " + "%.2f", volumeKerucut);
                    break;
                // Bola
                case 8:
                    System.out.println("Input phi: ");
                    double phiBola = Math.PI;
                    System.out.println("Input jari-jari: ");
                    int jariBola = in.nextInt();
                    double volumeBola = (4 * phiBola * Math.pow(jariBola, 3)) / 3;
                    System.out.printf("Volume Bola adalah: " + "%.2f", volumeBola);
                    break;
            }
        } else {
            System.out.println("Input Tidak Valid");
        }
        in.close();
    }
}
