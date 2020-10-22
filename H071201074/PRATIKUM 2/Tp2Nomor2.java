import java.util.Scanner;

class Tp2Nomor2{
    public static void main(String[] arg) {
        Scanner x = new Scanner(System.in);
        String a, b, c, d, e, f, g, h, i,j ;
        a = "1. Mencari luas bangun data";
        b = "2. Mencari volume bangun ruangan";
        c = "1. persegi";
        d = "2. persegi panjang";
        e = "3. segitiga";
        f = "4. lingkaran";
        g = "1. balok";
        h = "2. kubus";
        i = "3. bola";
        j = "4. tabung";

        System.out.printf("**menu**\n %s\n %s\n", a , b);
        System.out.println("");
        System.out.println("input angka sesuai dengan nomor bangun datar yang diinginkan :");
        int num1 = x.nextInt();

        if(num1 == 1){
            System.out.println("");
            System.out.printf("**pilih bangun datar**\n %s\n %s\n %s\n %s\n", c, d, e, f);
            System.out.println("");
            System.out.println("input angka sesusai dengan nomor bangun datar yang diinginkan");
            int numx = x.nextInt();

            if (numx== 1){
                System.out.println("input sisi");
                double s1 = x.nextDouble();
                double persegi = s1 * s1;
                System.out.printf("Luas Persegi = %.1f", persegi);
            } else if (numx==2){
                System.out.println("input panjang");
                double panjang = x.nextDouble();
                System.out.println("Input lebar");
                double lebar = x.nextDouble();
                double persegip = lebar*panjang;
                System.out.printf("Luas persegi panjang = %.1f", persegip);
            } else if (numx==3){
                System.out.println("input alas");
                double alas = x.nextDouble();
                System.out.println("input tinggi");
                double tinggi = x.nextDouble();
                double segitiga = (( alas * tinggi)/2);
                System.out.printf("luas segitiga = %.1f", segitiga);
            } else if (numx == 4){
                System.out.println("input jari=jari");
                double jari = x.nextDouble();
                double lingkaran = Math.PI * jari * jari;
                System.out.printf("Luas lingakaran = %.1f", lingkaran);
            } else {
                System.out.println("inputan tidak sesuai");
            }
        } else if (num1 == 2){
            System.out.println("");
            System.out.printf("**pilih bangun ruang**\n %s\n %s\n %s\n %s\n", g, h, i, j);
            System.out.println("");
            System.out.println("input angka sesusai dengan nomor bangun datar yang diinginkan");
            int numx = x.nextInt();

            if (numx==1){
                System.out.println("masukan panjang");
                double panjang = x.nextDouble();
                System.out.println("masukkan lebar");
                double lebar = x.nextDouble();
                System.out.println("masukkan tinggi");
                double tinggi = x.nextDouble();
                double balok = panjang * lebar * tinggi;
                System.out.printf("volume balok = %.1f", balok);
            } else if (numx==2){
                System.out.println("masukkan sisi");
                double sisi = x.nextDouble();
                double kubus = sisi*sisi*sisi;
                System.out.printf("volume kubus = %.1f", kubus);
            } else if (numx == 3){
                System.out.println("masukkan jari-jari");
                double jari = x.nextDouble();
                double bola = (4/3.0f) *Math.PI*jari*jari*jari;
                System.out.printf("volume bola = %.1f", bola);
            } else if (numx == 4){
                System.out.println("masukkan tinggi");
                double tinggi = x.nextDouble();
                System.out.println("masukkan jari-jari");
                double jari = x.nextDouble();
                double tabung = Math.PI*(jari*jari)*tinggi;
                System.out.printf("volume tabung = %.1f", tabung);
            }else {
                System.out.println("inputan tidak sesuai");
            }
        }else {
            System.out.println("inputan tidak sesuai");
        }


    }
}