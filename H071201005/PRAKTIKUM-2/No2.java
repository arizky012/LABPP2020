import java.util.Scanner;

public class No2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try {
            System.out.println(" ** Menu ** ");
            System.out.println(" 1. Mencari Luas Bangun Datar");
            System.out.println(" 2. Mencari Volume Bangun Ruang\n");
            System.out.println(" Input angka sesuai dengan Menu yang diinginkan :");
            int MenuUtama = input.nextInt();

            int Completion = 0;
            double Luas = 0.0;
            double Volume = 0.0;
            double Pi = 3.14159;
            String NamaBangun = "Bangun";
            String NamaRuang = "Ruang";

            if(MenuUtama == 1){
                System.out.println("\n ** Pilih Bangun Datar**");
                System.out.println("1.Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Lingkaran\n5. Jajar Genjang\n6. Trapesium\n7. Belah Ketupat\n8. Layang-layang\n");
                System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan :");
                int MenuDatar = input.nextInt();

                if (MenuDatar == 1){
                    NamaBangun = "Persegi";
                    System.out.println("\nInput Panjang Sisi");
                    double Sisi = input.nextDouble();
                    Luas = Sisi*Sisi;
                    Completion++;
                }else if (MenuDatar == 2){
                    NamaBangun = "Persegi Panjang";
                    System.out.println("\nInput Panjang");
                    double Panjang = input.nextDouble();
                    System.out.println("\nInput Lebar");
                    double Lebar = input.nextDouble();
                    Luas = Panjang*Lebar;
                    Completion++;
                }else if (MenuDatar == 3){
                    NamaBangun = "Segitiga";
                    System.out.println("\nInput Alas");
                    double Alas = input.nextDouble();
                    System.out.println("\nInput Tinggi");
                    double Tinggi = input.nextDouble();
                    Luas = Alas*Tinggi/2f;
                    Completion++;
                }else if (MenuDatar == 4){
                    NamaBangun = "Lingkaran";
                    System.out.println("\nInput Jarijari");
                    double Jarijari = input.nextDouble();
                    Luas = Pi*Jarijari*Jarijari;
                    Completion++;
                }else if (MenuDatar == 5){
                    NamaBangun = "Jajar Genjang";
                    System.out.println("\nInput alas");
                    double alas = input.nextDouble();
                    System.out.println("\nInput Tinggi");
                    double Tinggi = input.nextDouble();
                    Luas = alas*Tinggi;
                    Completion++;
                }else if (MenuDatar == 6){
                    NamaBangun = "Trapesium";
                    System.out.println("\nInput S1");
                    double S1 = input.nextDouble();
                    System.out.println("\nInput S2");
                    double S2 = input.nextDouble();
                    System.out.println("\nInput Tinggi");
                    double Tinggi = input.nextDouble();
                    Luas = (S1 + S2)*Tinggi/2f;
                    Completion++;
                }else if (MenuDatar == 7){
                    NamaBangun = "Belah Ketupat";
                    System.out.println("\nInput d1");
                    double d1 = input.nextDouble();
                    System.out.println("\nInput d2");
                    double d2 = input.nextDouble();
                    Luas = d1*d2/2f;
                    Completion++;
                }else if (MenuDatar == 8){
                    NamaBangun = "Layang-Layang";
                    System.out.println("\nInput d1");
                    double d1 = input.nextDouble();
                    System.out.println("\nInput d2");
                    double d2 = input.nextDouble();
                    Luas = d1*d2/2f;
                    Completion++;
                }else{
                    System.out.println("Maaf tidak terdapat pilihan pada menu");
                }
                if(Completion == 1){
                    System.out.printf("\nLuas %s = %.1f\n", NamaBangun, Luas);
                }
            }else if (MenuUtama ==  2){
                System.out.println("\n ** Pilih Bangun Ruang** ");
                System.out.println("1. Kubus\n2. Balok\n3. Limas\n4. Prisma\n5. Tabung\n6. Kerucut\n7. Bola\n");
                System.out.println("Input angka sesuai dengan bagun ruang yang diinginkan :");
                int MenuRuang = input.nextInt();

                if (MenuRuang == 1){
                    NamaRuang = "Kubus";
                    System.out.println("\nInput Panjang Sisi");
                    double Sisi = input.nextDouble();
                    Volume = Sisi*Sisi*Sisi;
                    Completion++;
                }else if (MenuRuang == 2){
                    NamaRuang = "Balok";
                    System.out.println("\nInput Lebar");
                    double Lebar = input.nextDouble();
                    System.out.println("\nInput Panjang");
                    double Panjang = input.nextDouble();
                    System.out.println("\nInput Tinggi");
                    double Tinggi = input.nextDouble();
                    Volume = Lebar*Panjang*Tinggi;
                    Completion++;
                }else if (MenuRuang == 3){
                    NamaRuang = "Limas";
                    System.out.println("\nInput Luas Alas");
                    double LuasAlas = input.nextDouble();
                    System.out.println("\nInput Tinggi");
                    double Tinggi = input.nextDouble();
                    Volume = LuasAlas*Tinggi;
                    Completion++;
                }else if (MenuRuang == 4){
                    NamaRuang = "Prisma";
                    System.out.println("\nInput Luas Alas");
                    double LuasAlas = input.nextDouble();
                    System.out.println("\nInput Tinggi");
                    double Tinggi = input.nextDouble();
                    Volume = LuasAlas*Tinggi;
                    Completion++;
                }else if (MenuRuang == 5){
                    NamaRuang = "Tabung";
                    System.out.println("\nInput Jarijari");
                    double Jarijari = input.nextDouble();
                    System.out.println("\nInput Tinggi");
                    double Tinggi = input.nextDouble();
                    Volume = Pi*Jarijari*Jarijari*Tinggi;
                    Completion++;
                }else if (MenuRuang == 6){
                    NamaRuang = "Kerucut";
                    System.out.println("\nInput JariJari");
                    double Jarijari = input.nextDouble();
                    System.out.println("\nInput Tinggi");
                    double Tinggi = input.nextDouble();
                    Volume = Pi*Jarijari*Jarijari*Tinggi/3f;
                    Completion++;
                }else if (MenuRuang == 7){
                    NamaRuang = "Bola";
                    System.out.println("\nInput Jarijari");
                    double Jarijari = input.nextDouble();
                    Volume = Pi*Jarijari*Jarijari*Jarijari*4f/3f;
                    Completion++;
                }else{
                    System.out.println("Maaf tidak terdapat pilihan pada menu");
                }
                if (Completion == 1){
                    System.out.printf("\n Volume %s= %.1f\n", NamaRuang, Volume);
                }
            }else{
                System.out.println("Maaf tidak terdapat pilihan pada menu");
            }
        }catch (Exception e){
            System.out.println("\nInput Tidak Valid");
        }
    }
}
