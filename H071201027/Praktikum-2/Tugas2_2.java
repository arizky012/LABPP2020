import java.util.Scanner;
public class Tugas2_2 {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        System.out.println("         ** MENU **");
        System.out.println("1.Mencari Luas Bangun datar");
        System.out.println("2.Mencari Volume bangun ruang");
        System.out.println("Input angka sesuai dengan menu yang diinginkan");
        // String pil1 = "";
        // String pil2 = "";
        String bangun = x.next();
        
      
        if (bangun.equals("1")){
          System.out.println(" ** Pilih Bangun Datar ** "); 
          System.out.println(" 1. Persegi \n 2. Persegi Panjang \n 3. Segitiga \n 4. Lingkaran \n 5. Jajar Genjang \n 6. Trapesium \n 7. Belah Ketupat \n 8. Layang-Layang");
          System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan = ");
          String datar = x.next();
          
          if (datar.equals("1")){ 
            System.out.println("** Anda telah memilih persegi **");
          System.out.println("input panjang sisi");
          float s = x.nextFloat();
          System.out.println("LUAS PERSEGI = "+s*s );
          }
          

          if(datar.equals("2")){
            System.out.println("** Anda telah memilih persegi panjang**");
            System.out.println("input panjang");
            float p = x.nextFloat();
            System.out.println("input lebar");
            float l= x.nextFloat();
            float pl = p*l;
            System.out.println("LUAS PERSEGI PANJANG = "+pl);
          }

          if(datar.equals("3")){
            System.out.println("** Anda telah memilih segitiga**");
            System.out.println("input alas");
            float a = x.nextFloat();
            System.out.println("input tinggi");
            float t= x.nextFloat();
            float at = a*t/2;
            System.out.println("LUAS SEGITIGA = "+at);
          }
         
          if(datar.equals("4")){
            System.out.println("** Anda telah memilih Lingkaran**");
            System.out.println("input jari=jari");
            float r = x.nextFloat();
            float phi = 3.14f;
            float ppir = phi*r*r;
            System.out.println("LUAS LINGKARAN = "+ppir);
          }

          if(datar.equals("5")){
            System.out.println("** Anda telah memilih jajargenjang**");
            System.out.println("input Alas");
            float a1 = x.nextFloat();
            System.out.println("input tinggi");
            float t1= x.nextFloat();
            float a1t1= a1*t1;
            System.out.println("LUAS JAJARGENJANG = "+a1t1);
          }

          if(datar.equals("6")){
            System.out.println("** Anda telah memilih Trapesium**");
            System.out.println("input panjang sisi sejajar pertama");
            float p = x.nextFloat();
            System.out.println("input panjang sisi sejajar kedua");
            float l= x.nextFloat();
            System.out.println("input tinggi");
            float t1= x.nextFloat();
            float pl = (p*l)/2*t1;
            System.out.println("LUAS TRAPESIUM = "+pl);
          }

          if(datar.equals("7")){
            System.out.println("** Anda telah memilih belah ketupat**");
            System.out.println("input diagonal 1");
            float a = x.nextFloat();
            System.out.println("input diagonal 2");
            float t= x.nextFloat();
            float at = a*t/2;
            System.out.println("LUAS SEGITIGA = "+at);
          }

          if(datar.equals("8")){
            System.out.println("** Anda telah memilih layang layang**");
            System.out.println("input diagonal 1");
            float a = x.nextFloat();
            System.out.println("input diagonal 2");
            float t= x.nextFloat();
            float at = a*t/2;
            System.out.println("LUAS SEGITIGA = "+at);
          }

        }else if(bangun.equals("2")){
          System.out.println(" ** Pilih Bangun Ruang ** ");
          System.out.println(" 1. Kubus\n 2. Balok\n 3. Tabung\n 4. Kerucut\n 5. Bola\n 6. Prisma segitiga\n 7. Limas segiempat\n 8. Limas segitiga");
          System.out.println("Input angka sesuai dengan nomor bangun ruang yang diinginkan = ");
          String ruang = x.next();

          if(ruang.equals("1")){
            System.out.println("** Anda telah memilih kubus **");
            System.out.println("Input sisi");
            float sisi= x.nextFloat();
            float V = sisi*sisi*sisi;
            System.out.println("VOLUME KUBUS = "+V);
          }
          if(ruang.equals("2")){
            System.out.println("** Anda telah memilih Balok **");
            System.out.println("input panjang ");
            float p = x.nextFloat();
            System.out.println("input lebar");
            float l= x.nextFloat();
            System.out.println("input tinggi");
            float t= x.nextFloat();
            float V = p*l*t;
            System.out.println("VOLUME BALOK = "+V);
          }

          if(ruang.equals("3")){
            System.out.println("** Anda telah memilih Tabung **");
            System.out.println("input jari=jari");
            float r = x.nextFloat();
            System.out.println("input tinggi");
            float t= x.nextFloat();
            float phi = 3.14f;
            float ppir = phi*r*r*t;
            System.out.println("VOLUME TABUNG = "+ppir);
          
          }
          if(ruang.equals("4")){
            System.out.println("** Anda telah memilih Kerucut**");
            System.out.println("input jari-jari");
            float r = x.nextFloat();
            System.out.println("input tinggi");
            float t= x.nextFloat();
            float phi = 3.14f;
            float ppir = phi*r*r*t*1/3;
            System.out.println("VOLUME KERUCUT = "+ppir);
          }

          if(ruang.equals("5")){
            System.out.println("** Anda telah memilih Bola**");
            System.out.println("input jari-jari");
            float r = x.nextFloat();
            float phi = 3.14f;
            float ppir = phi*r*r*r*4/3;
            System.out.println("VOLUME  BOLA = "+ppir);
          }

          
          if(ruang.equals("6")){
            System.out.println("** Anda telah memilih Prisma Segitiga**");
            System.out.println("input alas segitiga");
            float a = x.nextFloat();
            System.out.println("input tinggi segitiga");
            float t= x.nextFloat();
            System.out.println("input tinggi prisma");
            float t1= x.nextFloat();
            float at = a*t/2*t1;
            System.out.println("VOLUME PRISMA SEGITIGA = "+at);
          }

          if(ruang.equals("7")){
            System.out.println("** Anda telah memilih limas Segiempat**");
            System.out.println("input panjang ");
            float p = x.nextFloat();
            System.out.println("input lebar");
            float l= x.nextFloat();
            System.out.println("input tinggi limas");
            float t= x.nextFloat();
            float V = 4/3*p*l*t;
            System.out.println("VOLUME LIMAS SEGIEMPAT = "+V);
            
          }
          if(ruang.equals("8")){
            System.out.println("** Anda telah memilih Limas Segitiga**");
            System.out.println("input alas segitiga");
            float a = x.nextFloat();
            System.out.println("input tinggi segitiga");
            float t= x.nextFloat();
            System.out.println("input tinggi prisma");
            float t1= x.nextFloat();
            float at = 1/3*a*t/2*t1;
            System.out.println("VOLUME LIMAS SEGITIGA = "+at);
          }

        }
    }
}
