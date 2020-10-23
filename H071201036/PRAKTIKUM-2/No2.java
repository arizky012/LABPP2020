package Praktikum2;
import java.util.Scanner;
public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang\n");
        System.out.println("Input angka sesuai dengan Menu Yang diinginkan : ");
        int x = input.nextInt();

        if (x == 1){
        System.out.println("** Pilih Bangun Datar **");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("5. Jajar Genjang");
        System.out.println("6. Trapesium");
        System.out.println("7. Belah Ketupat");
        System.out.println("8. Layang-Layang\n");
        System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan : ");
        int y = input.nextInt();
            if (y == 1){
            System.out.println("Input sisi");
            float a = input.nextFloat();
            float Luas = a*a;
            System.out.printf("Luas persegi = %.1f", Luas);
            }else if(y == 2){
            System.out.println("Input Panjang");
            float a = input.nextFloat();
            System.out.println("Input Lebar");
            float b = input.nextFloat();
            float Luas = a*b;
            System.out.printf("Luas persegi panjang = %.1f", Luas);
            }else if(y == 3){
            System.out.println("Input Alas");
            float a = input.nextFloat();
            System.out.println("Input Tinggi");
            float b = input.nextFloat();
            float Luas = (a*b)/2;
            System.out.printf("Luas segitiga = %.1f", Luas);
            }else if(y == 4){
            System.out.println("Input Jari-jari");
            double r = input.nextFloat();
            double Luas = Math.PI * r * r;
            System.out.printf("Luas lingkaran = %.1f", Luas);
            }else if(y == 5){
            System.out.println("Input Alas");
            float a = input.nextFloat();
            System.out.println("Input Tinggi");
            float b = input.nextFloat();
            float Luas = a*b;
            System.out.printf("Luas jajar genjang = %.1f", Luas);
            }else if(y == 6){
            System.out.println("Input Sisi Atas");
            float a = input.nextFloat();
            System.out.println("Input Sisi Bawah");
            float b = input.nextFloat();
            System.out.println("Input Tinggi");
            float c = input.nextFloat();
            float Luas = ((a+b)*c)/2;
            System.out.printf("Luas trapesium = %.1f", Luas);
            }else if(y == 7){
            System.out.println("Input Diagonal 1");
            float a = input.nextFloat();
            System.out.println("Input Diagonal 2");
            float b = input.nextFloat();
            float Luas = (a*b)/2;
            System.out.printf("Luas belah ketupat = %.1f", Luas);
            }else if(y == 8){
            System.out.println("Input Diagonal 1");
            float a = input.nextFloat();
            System.out.println("Input Diagonal 2");
            float b = input.nextFloat();
            float Luas = (a*b)/2;
            System.out.printf("Luas layang-layang = %.1f", Luas);
            }
        }
        if (x == 2){
        System.out.println("** Pilih Bangun Ruang **");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("4. Kerucut");
        System.out.println("5. Limas Segitiga");
        System.out.println("6. Limas Segiempat");
        System.out.println("7. Prisma Segitiga");
        System.out.println("8. Bola\n");
        System.out.println("Input angka sesuai dengan nomor bangun ruang yang diinginkan : ");
        int z = input.nextInt();
            if (z == 1){
            System.out.println("Input sisi");
                float a = input.nextFloat();
                float Volume = a*a*a;
                System.out.printf("Volume kubus = %.1f", Volume);
            }else if(z == 2){
                System.out.println("Input Panjang");
                float a = input.nextFloat();
                System.out.println("Input Lebar");
                float b = input.nextFloat();
                System.out.println("Input Tinggi");
                float c = input.nextFloat();
                float Volume = a * b * c;
                System.out.printf("Volume balok = %.1f", Volume);
            }else if(z == 3){
            System.out.println("Input Jari-jari");
            double r = input.nextDouble();
            System.out.println("Input Tinggi");
            double t = input.nextDouble();
            double Volume = Math.PI * r * r * t;
            System.out.printf("Volume tabung = %.2f", Volume);
            }
        }
        input.close();
    }
}