import java.util.Scanner;

public class Soal2Praktikum2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar \n2. Mencari Volume Bangun Ruang");
        System.out.println("Input angka sesuai dengan menu yang diinginkan");
        int pilihan = input.nextInt();
        
        switch(pilihan) {
            case 1 :
                System.out.println("** Pilih Bangun Datar **");
                System.out.println("1. Persegi \n2. Persegi Panjang \n3. Segitiga \n4. Lingkaran");
                System.out.println("5. Jajar Genjang \n6. Trapesium \n7. Belah Ketupat \n8. Belah ketupat");
                System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan :");
                int pilih = input.nextInt();
                    switch(pilih){
                        case 1 :
                            System.out.println("Input sisi");
                            float s = input.nextFloat();
                            double persegi = s * s;
                            System.out.printf("Luas Persegi = %.1f", persegi); break;
                        case 2 :
                            System.out.println("Input Panjang");
                            float p = input.nextFloat();
                            System.out.println("Input Lebar");
                            float l = input.nextFloat();
                            double persegipanjang = p * l;
                            System.out.printf("Luas Persegi Panjang = %.1f", persegipanjang); break;
                        case 3:
                            System.out.println("Input Alas");
                            float a = input.nextFloat();
                            System.out.println("Input Tinggi");
                            float t = input.nextFloat();
                            double segitiga = (a * t) / 2;
                            System.out.printf("Luas Segitiga = %.1f", segitiga); break;
                        case 4 :
                            System.out.println("Input Jari-Jari");
                            float r = input.nextFloat();
                            double lingkaran = (Math.PI * r * r);
                            System.out.printf("Luas Lingkaran = %.1f", lingkaran); break;
                        case 5 :
                            System.out.println("Input Alas");
                            float A = input.nextFloat();
                            System.out.println("Input Tinggi");
                            float T = input.nextFloat();
                            double jajargenjang = A * T;
                            System.out.printf("Luas Jajar Genjang = %.1f", jajargenjang); break;
                        case 6 :
                            System.out.println("Input Alas Atas");
                            float a1 = input.nextFloat();
                            System.out.println("Input Alas Bawah");
                            float a2 = input.nextFloat();
                            System.out.println("Input Tinggi");
                            float t1 = input.nextFloat();
                            double trapesium = (((a1 + a2) * t1) / 2);
                            System.out.printf("Luas Trapesium = %.1f", trapesium); break;
                        case 7 :
                            System.out.println("Input Diagoanal 1");
                            float d1 = input.nextFloat();
                            System.out.println("Input Diagonal 2");
                            float d2 = input.nextFloat();
                            double belahketupat = (d1 * d2) / 2;
                            System.out.printf("Luas Belah Ketupat = %.1f", belahketupat); break;
                        case 8 :
                            System.out.println("Input Diagoanal 1");
                            float D1 = input.nextFloat();
                            System.out.println("Input Diagonal 2");
                            float D2 = input.nextFloat();
                            double layanglayang = (D1 * D2) / 2;
                            System.out.printf("Luas Belah Ketupat = %.1f", layanglayang); break;
                        default :
                            System.out.println("Maaf Inputan Salah"); break;                        
                        } break;
            case 2 :
                System.out.println("** Pilih Bangun Datar **");
                System.out.println("1. Kubus \n2. Balok \n3. Prisma Segitiga \n4. Limas Segiempat");
                System.out.println("5. Limas Segitiga \n6. Tabung \n7. Kerucut \n8. Bola");
                System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan :");
                int Pilih = input.nextInt();
                    switch(Pilih){
                        case 1 :
                            System.out.println("Input Sisi");
                            float S = input.nextFloat();
                            double kubus = S * S * S;
                            System.out.printf("Volume Kubus = %.f", kubus); break;
                        case 2 :
                            System.out.println("Input Panjang");
                            float P = input.nextFloat();
                            System.out.println("Input Lebar");
                            float L = input.nextFloat();
                            System.out.println("Input Tinggi");
                            float T = input.nextFloat();
                            double balok = P * L * T;
                            System.out.printf("Volume Balok = %.f", balok); break;
                        case 3 :
                            System.out.println("Input Luas Alas");
                            float LA = input.nextFloat();
                            System.out.println("Input Tinggi");
                            float T1 = input.nextFloat();
                            double PS = LA * T1;
                            System.out.printf("Volume Prisma Segitiga = %.f", PS); break;
                        case 4 :
                            System.out.println("Input Panjang");
                            float P1 = input.nextFloat();
                            System.out.println("Input Lebar");
                            float L1 = input.nextFloat();
                            System.out.println("Input Tinggi");
                            float T2 = input.nextFloat();
                            double LS4 = (P1 * L1 * T2) / 3;
                            System.out.printf("Volume Limas Segiempat = %.f", LS4); break;
                        case 5 :
                            System.out.println("Input Luas Alas");
                            float LA1 = input.nextFloat();
                            System.out.println("Input Tinggi");
                            float T3 = input.nextFloat();
                            double LS3 = (LA1 * T3) / 3;
                            System.out.printf("Volume Limas Segitiga = %.f", LS3); break;
                        case 6 :
                            System.out.println("Input Jari-Jari");
                            float R = input.nextFloat(); 
                            System.out.println("Input Tinggi");
                            float T4 = input.nextFloat();
                            double tabung = (R * R * T4) / 3;
                            System.out.printf("Volume Tabung = %.f", tabung); break;
                        case 7 :
                            System.out.println("Input Jari-Jari");
                            float R1 = input.nextFloat();
                            System.out.println("Input Tinggi");
                            float T5 = input.nextFloat();
                            double kerucut = (Math.PI * R1 * R1 * T5) / 3;
                            System.out.printf("Volume Kerucut = %.f", kerucut); break;
                        case 8 :
                            System.out.println("Input Jari-Jari");
                            float R2 = input.nextFloat();
                            double bola = (4 * Math.PI * R2 * R2 * R2) / 3;
                            System.out.printf("Volume Bola = %.f", bola); break;
                        default :
                            System.out.println("Maaf Inputan Salah"); break;
                    } break;
        } input.close();
        

        
    }
}
