import java.util.*;

/**
 * nomor2
 */
public class nomor2 {
    static Scanner ara = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("*** Menu ***");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang\n");
        System.out.println("Input angka sesuai dengan menu yang diinginkan :");

        try {
            int a = ara.nextInt();

            if (a==1){
                System.out.println("\n*** Pilih Bangun Datar ***");
                System.out.println("1. Persegi \n2. Persegi Panjang \n3. Segitiga \n4. Linkaran");
                System.out.println("5. Jajar genjang \n6. Trapesium \n7. Belah ketupat \n8. Layang-Layang\n");
                System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan :");

                int pilihan = ara.nextInt();

                if (pilihan == 1){//Persegi
                    System.out.println("\nInput Sisi:");
                    double sisi = ara.nextInt();
                    double hasil = sisi * sisi;
                    System.out.printf("\n*Luas Persegi:*\n%.1f \n\n", hasil);
                }
                else if (pilihan == 2){//Persegi Panjang
                    System.out.println("\nInput Panjang:");
                    double panjang = ara.nextInt();
                    System.out.println("Input Lebar:");
                    double lebar = ara.nextInt();
                    double hasil = panjang * lebar;
                    System.out.printf("\n*Luas Persegi Panjang:*\n%.1f \n\n", hasil);
                }
                else if (pilihan == 3){//Segitiga
                    System.out.println("\nInput Alas:");
                    double alas = ara.nextInt();
                    System.out.println("Input Tinggi:");
                    double tinggi = ara.nextInt();
                    double hasil = 0.5 * alas * tinggi;
                    System.out.printf("\n*Luas segitiga:*\n%.1f \n\n", hasil);
                }
                else if (pilihan == 4){//Lingkaran
                    System.out.println("\nInput Jari-Jari Lingkaran:");
                    double r = ara.nextInt();
                    double hasil = Math.PI * r * r;
                    System.out.printf("\n*Luas Lingkaran:*\n%.2f \n\n", hasil);
                }
                else if (pilihan == 5){//Jajar Genjang
                    System.out.println("\nInput Alas:");
                    double alas = ara.nextInt();
                    System.out.println("Input Tinggi:");
                    double tinggi = ara.nextInt();
                    double hasil = alas * tinggi;
                    System.out.printf("\n*Luas Jajar Genjang:*\n%.1f \n\n", hasil);
                }
                else if (pilihan == 6){//Trapesium
                    System.out.println("\nInput Sisi Sejajar a dan b:");
                    System.out.println("Input Sisi a:");
                    double sejajarA = ara.nextInt();
                    System.out.println("Input Sisi b:");
                    double sejajarB = ara.nextInt();
                    System.out.println("Input Tinggi");
                    double tinggi = ara.nextInt();
                    double hasil = 0.5 * (sejajarA+sejajarB) * tinggi;
                    System.out.printf("\n*Luas Trapesium:*\n%.1f \n\n", hasil);
                }
                else if (pilihan == 7){//belah ketupat
                    System.out.println("\nInput D1iagonal 1:");
                    double alas = ara.nextInt();
                    System.out.println("Input Diagonal 2:");
                    double tinggi = ara.nextInt();
                    double hasil = 0.5 * alas * tinggi;
                    System.out.printf("\n*Luas Belah Ketupat:*\n%.1f \n\n", hasil);
                }
                else if (pilihan == 8){//layang-layang
                    System.out.println("\nInput D1iagonal 1:");
                    double alas = ara.nextInt();
                    System.out.println("Input Diagonal 2:");
                    double tinggi = ara.nextInt();
                    double hasil = 0.5 * alas * tinggi;
                    System.out.printf("\n*Luas Belah Layang-layang:*\n%.1f \n\n", hasil);
                }
                else {
                    System.out.println("\nInput Hanya Angka 1,2,3,4,5,6,7 atau 8\n");
                }
            }
            else if (a==2){
                System.out.println("\n*** Pilih Volume Bangun Ruang ***");
                System.out.println("1. Kubus \n2. Balok \n3. Limas Segiempat \n4. Prisma");
                System.out.println("5. Tabung \n6. Kerucut \n7. Bola \n");
                System.out.println("Input Angka Sesuai dengan Nomor Bangun Ruang yang Diinginkan :");

                int pilihan = ara.nextInt();
                
                if (pilihan == 1){//KUBUS
                    System.out.println("\nInput Rusuk:");
                    double s = ara.nextInt();
                    double hasil = s * s * s;
                    System.out.println("\n*Volume Kubus:* \n" + hasil + "\n");
                }
                else if (pilihan == 2){//BALOK
                    System.out.println("\nInput Panjang:");
                    double p = ara.nextInt();
                    System.out.println("Input Lebar:");
                    double l = ara.nextInt();
                    System.out.println("Input Tinggi:");
                    double t = ara.nextInt();
                    double hasil = p * l * t;
                    System.out.printf("\n*Volume Balok:*\n%.1f \n\n", hasil);
                }
                else if (pilihan == 3){//LIMAS
                    System.out.println("\nInput sisi Alas Limas:");
                    double l = ara.nextInt();
                    System.out.println("Input Tinggi Limas:");
                    double t = ara.nextInt();
                    double hasil = 1/3 * l * l * t;
                    System.out.printf("\n*Volume Limas Segiempat:*\n%.1f \n\n", hasil);
                }
                else if (pilihan == 4){//PRISMA
                    System.out.println("\nInput Luas Alas Prisma:");
                    double l = ara.nextInt();
                    System.out.println("Input Tinggi Prisma:");
                    double t = ara.nextInt();
                    double hasil = l * t;
                    System.out.printf("\n*Volume Prisma:*\n%.1f \n\n", hasil);
                }
                else if (pilihan == 5){//TABUNG
                    System.out.println("\nInput Jari-Jari Alas Tabung:");
                    double r = ara.nextInt();
                    System.out.println("Input Tinggi Tabung:");
                    double t = ara.nextInt();
                    double hasil = Math.PI * r * r * t;
                    System.out.printf("\n*Volume Tabung:*\n%.1f \n\n", hasil);
                }
                else if (pilihan == 6){//KERUCUT
                    System.out.println("\nInput Jari-Jari Lingkaran Alas Kerucut:");
                    double r = ara.nextInt();
                    System.out.println("Input Tinggi Kerucut:");
                    double t = ara.nextInt();
                    double hasil = Math.PI * 1/3 * r * t;
                    System.out.printf("\n*Volume Kerucut:*\n%.1f \n\n", hasil);
                }
                else if (pilihan == 7){//BOLA
                    System.out.println("\nInput Jari-Jari Bola:");
                    double r = ara.nextInt();
                    double hasil = 4.1888 * r * r * r;
                    System.out.printf("\n*Volume Bola:*\n%.1f \n\n", hasil);
                }
                else {
                    System.out.println("\nInput Hanya Angka 1,2,3,4,5,6, atau 7\n");
                }
            }
            else {
                System.out.println("inputan hanya angka 1 atau 2 \n");
            }
        }
        catch (Exception e) {
            System.out.println("\nInputan Tidak Valid\nInput Hanya Angka 1 atau 2\n\n**Silakan Mulai Ulang**\n");

        }
    }
}