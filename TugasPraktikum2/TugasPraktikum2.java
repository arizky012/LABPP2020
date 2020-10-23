import java.util.Scanner;
public class TugasPraktikum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("** Menu **");
            System.out.println("1. Mencari Luas Bangun Datar");
            System.out.println("2. Mencari Volume Bangun Ruang\n");
            System.out.println("Input angka sesuai dengan Menu yang diinginkan :");
            int Menu = input.nextInt();

            double luas = 0.0;
            double volume = 0.0;
            double phi = 3.14;
            String NamaBangun = "";
            String NamaRuang = "";

            if (Menu == 1) {
                System.out.println("\n** Pilih Bangun Datar **");
                System.out.println("1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Lingkaran");
                System.out.println("5. Jajar Genjang\n6. Trapesium\n7. Belah Ketupat\n");
                System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan :");
                int BangunDatar = input.nextInt();

                if (BangunDatar == 1) {
                    System.out.println("\nInput Panjang Sisi");
                    double sisi = input.nextInt();
                    luas = sisi * sisi;
                    NamaBangun = "Persegi";
                } else if (BangunDatar == 2) {
                    System.out.println("\nInput Panjang");
                    double panjang = input.nextDouble();
                    System.out.println("Input Lebar");
                    double lebar = input.nextDouble();
                    luas = panjang * lebar;
                    NamaBangun = "Persegi Panjang";
                } else if (BangunDatar == 3) {
                    System.out.println("\nInput Alas");
                    double alas = input.nextDouble();
                    System.out.println("Input Tinggi");
                    double tinggi = input.nextDouble();
                    luas = alas * tinggi;
                    NamaBangun = "Segitiga";
                } else if (BangunDatar == 4) {
                    System.out.println("\nInput Diameter");
                    double diameter = input.nextDouble();
                    luas = (phi * (diameter * diameter)) / 4;
                    NamaBangun = "Lingkaran";
                } else if (BangunDatar == 5) {
                    System.out.println("\nInput Alas");
                    double alas = input.nextDouble();
                    System.out.println("Input Tinggi");
                    double tinggi = input.nextDouble();
                    luas = (alas * tinggi);
                    NamaBangun = "Jajar Genjang";
                }  else if (BangunDatar == 6) {
                    System.out.println("\nInput Alas Atas");
                    double alas1 = input.nextDouble();
                    System.out.println("Input Alas Bawah");
                    double alas2 = input.nextDouble();
                    System.out.println("Input Tinggi");
                    double tinggi = input.nextDouble();
                    luas = (((alas1 + alas2) * tinggi)/2);
                    NamaBangun = "Trapesium";
                }else if (BangunDatar == 7) {
                    System.out.println("\nInput Diagonal 1");
                    double d1 = input.nextDouble();
                    System.out.println("Input Diagonal 2");
                    double d2 = input.nextDouble();
                    luas = (d1 * d2)/2 ;
                    NamaBangun = "Belah Ketupat";
                }else {
                    System.out.println("Maaf Pilihan yang Anda pilih tidak Terdapat di Menu.");
                }
                if (NamaBangun.length() > 0) {
                    System.out.printf("\nLuas %s = %.1f\n", NamaBangun, luas);
                }

            } else if (Menu == 2){
                System.out.println("\n** Pilih Bangun Ruang **");
                System.out.println("1. Kubus\n2. Balok\n3. Kerucut\n4. Bola\n");
                System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan :");
                int BangunRuang= input.nextInt();	

                if (BangunRuang == 1) {
                    NamaRuang = "Kubus";
                    System.out.println("\nInput Panjang Sisi");
                    double sisi = input.nextInt();
                    volume = sisi * sisi * sisi;
                } else if (BangunRuang == 2) {
                    NamaRuang = "Balok";
                    System.out.println("\nInput Panjang");
                    double panjang = input.nextDouble();
                    System.out.println("Input Lebar");
                    double lebar = input.nextDouble();
                    System.out.println("Input Tinggi");
                    double tinggi = input.nextDouble();
                    volume = panjang * lebar * tinggi;
                } else if (BangunRuang == 3) {
                    NamaRuang = "Kerucut";
                    System.out.println("\nInput Jari-jari");
                    double jari = input.nextDouble();
                    System.out.println("Input Tinggi");
                    double tinggi = input.nextDouble();
                    volume = (phi * (jari * jari) * tinggi) / 3;
                } else if (BangunRuang == 4) {
                    NamaRuang = "Bola";
                    System.out.println("\nInput Jari-jari");
                    double jari = input.nextDouble();
                    volume = (4 * phi * (jari * jari)) / 3;
                } else {
                    System.out.println("Maaf! Pilihan tidak terdapat di menu.");
                }

                if (NamaRuang.length() > 0) {
                    System.out.printf("\nVolume %s = %.1f\n", NamaRuang, volume);
                }
            } else {
                System.out.println("Maaf! Pilihan tidak ada di menu.");
            }
        }
    }
