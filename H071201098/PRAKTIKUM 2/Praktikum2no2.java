import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;
public class Praktikum2no2 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("** MENU **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println("");
        System.out.println("Input Angka Sesuai Dengan Menu Yang Diinginkan :");
        int pilihan = input.nextInt();
       
            if (pilihan == 1) {
                System.out.println("** Pilih Bangun Datar **");
                System.out.printf("1.Persegi \n2.Persegi panjang\n3.Segitiga\n4.lingkaran\n5.jajar genjang\n6.trapesium\n7.belah ketupat\n8.layang-layang");
                System.out.println("");
                System.out.println("Input Angka Sesuai Dengan Bangun Datar Yang Diinginkan :");
                
                System.out.println("");
                int bd = input.nextInt();
                if (bd == 1){
                    System.out.println("*Persegi*");   
                    System.out.println("Input sisi");
                    double sisi = input.nextDouble();
                     double luasp = (sisi*sisi);
                    System.out.printf("Luas persegi  = %.1f" ,luasp);
                }else if (bd ==2){
                    System.out.println("*Persegi Panjang*");
                    System.out.println("Input Panjang");
                    double ppp = input.nextDouble();
                    System.out.println("Input Lebar");
                    double lpp = input.nextDouble();
                    double luaspp = (ppp*lpp);
                    System.out.printf("Luas persegi panjang = %.1f" ,luaspp);
                }else if (bd == 3){
                    System.out.println("*Segitiga*"); 
                    System.out.println("Input Alas");
                    double as = input.nextDouble();
                    System.out.println("Input Tinggi");
                    double ts = input.nextDouble();
                    double luass = ((as*ts)/2);
                    System.out.printf("Luas Segitiga = %.1f" ,luass);
                }else if (bd == 4){
                   System.out.println("*Lingkaran*");
                    System.out.println("Input r");
                    double rl = input.nextDouble();
                    double luasl ;
                    luasl = (Math.PI*rl*rl);
                    System.out.printf("Luas Lingakran = %.1f", luasl);
                }else if (bd == 5){
                    System.out.println("*Jajar Genjang*");
                    System.out.println("Input Alas");
                    double aj = input.nextDouble();
                    System.out.println("Input Tinggi");
                    double tj = input.nextDouble();
                    double luasjg = aj*tj;
                    System.out.printf("Luas jajar genjang = %.1f", luasjg);
                }else if (bd == 6){
                    System.out.println("*Trapesium*");
                    System.out.println("Input Sisi A "); 
                    double sisia = input.nextDouble();
                    System.out.println("Input Sisi B");
                    double sisib = input.nextDouble();
                    System.out.println("Input Tinggi");
                    double ttr = input.nextDouble();
                    double luastr = (sisia+sisib)*ttr/2;
                    System.out.printf("Luas Trapesium = %.1f", luastr);
                }else if (bd == 7){
                    System.out.println("*Belah Ketupat*");
                    System.out.println("");
                    System.out.println("Input d1");
                    double d1 = input.nextDouble();
                    System.out.println("Input d2");
                    double d2 = input.nextDouble();
                    double luasbk = d1*d2/2;
                    System.out.printf("Luas Belah Ketupat = %.1f", luasbk);
                }else if (bd == 8){
                   System.out.println("*Layang - Layang*");
                    System.out.println("Input d1");
                    double d1 = input.nextDouble();
                    System.out.println("Input d2");
                    double d2 = input.nextDouble();
                    double luaslayang = d1*d2/2;
                    System.out.printf("Luas Layang - Layang = %.1f", luaslayang);

                }else {
                    System.out.println("Inputan Salah");
                }
               
            }else if (pilihan == 2){
                System.out.println("** Pilih Bangun Ruang **");
                System.out.printf("1.Kubus\n2.Kerucut\n3.Bola\n4.Balok\n5.Prisma Segitiga");
                System.out.println(" ");
                System.out.println("Input Angka Sesuai Dengan Bangun Ruang Yang Diinginkan :");
                int br = input.nextInt();
                System.out.println("");
                if (br == 1){
                   System.out.println("*Kubus*");
                    System.out.println("Masukkan Sisi");
                    double s = input.nextDouble();
                    double vk = Math.pow(s, 3);
                    System.out.printf("Volume Persegi = %.1f" ,vk);
                }else if (br == 2){
                    System.out.println("*Kerucut*");
                    System.out.println("Masukkan Tinggi");
                    double tk = input.nextDouble();
                    System.out.println("Masukkan Jari-Jari Lingkaran Alas");
                    double rk = input.nextDouble();
                    double vkc = ((Math.PI*rk*rk*tk)/3);
                    System.out.printf("Volume Kerucut = %.1f" ,vkc);
                }else if (br == 3){
                   System.out.println("*Bola*");
                    System.out.println("Masukkan Jari-Jari Bola");
                    double rb = input.nextDouble();
                    double vb = ((4*(Math.PI)*(Math.pow(rb, 3)))/3);
                    System.out.printf("Volume Bola = %.1f" ,vb);
                }else if (br == 4){
                    System.out.println("*Balok*");
                    System.out.println("Masukkan Panjang");
                    double pb = input.nextDouble();
                    System.out.println("Masukkan Lebar");
                    double lb = input.nextDouble();
                    System.out.println("Masukkan Tinggi");
                    double tb = input.nextDouble();
                    double vbalok = pb*lb*tb;
                    System.out.printf("Volume balok = %.1f",vbalok );
                }else if (br == 5){
                    System.out.println("*Prisma Segitiga*");
                    System.out.println("Masukkan Alas");
                    double als = input.nextDouble();
                    System.out.println("Masukkan Tinggi Segitiga");
                    double ts = input.nextDouble();
                    System.out.println("Masukkan Tinggi Prisma");
                    double tps = input.nextDouble();
                    double vps = als*ts*tps/2;
                    System.out.printf("Volume Prisma = %.1f",vps);


                }else {
                    System.out.println("Inputan Salah");
                }
            }else {
                System.out.println("Inputan Salah");
            }
        input.close();
    }
}
