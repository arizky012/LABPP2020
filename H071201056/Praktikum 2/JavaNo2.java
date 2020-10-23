import java.util.Scanner;
public class JavaNo2 {
    public static void main(String[] args) {
        Scanner rumus = new Scanner(System.in);
        System.out.println("**menu**");
        System.out.println("1. Mencari luas bangun datar");
        System.out.println("2. Mencari volume bangun ruang");
        System.out.println("");
        System.out.println("input angka sesuai yang diinginkan");
            int bangun= rumus.nextInt();

         if(1== bangun){
            System.out.println("**pilih bangun datar**");
            System.out.println("1. persegi "); 
            System.out.println("2. persegi panjang");
            System.out.println("3. segitiga");
            System.out.println("4. lingkaran");
            System.out.println("5. jajar genjang");
            System.out.println("6. trapesium");
            System.out.println("7. belah ketupat");
            System.out.println("8. layang layang");
            System.out.println("");
            System.out.println("input angka sesuai yang diinginkan");
               int input1 = rumus.nextInt();
              
                    if (1==input1){
                        System.out.println("");
                        System.out.println("*Persegi*");
                        System.out.println("input sisi");
                            double sisi=rumus.nextDouble();
                            double luas_persegi;
                            //rumus luas persegi
                             luas_persegi =(sisi*sisi);
                             System.out.printf("luas persegi = %.1f", luas_persegi);
                    }else if(2==input1){
                        System.out.println("");
                        System.out.println("*Persegi Panjang*");
                        System.out.println("input panjang");
                            double panjang=rumus.nextDouble();
                        System.out.println("input lebar");
                            double lebar=rumus.nextDouble();
                            double luas_persegiPanjang;
                            //rumus luas persegi panjang
                            luas_persegiPanjang=(panjang*lebar);
                            System.out.printf("luas persegi panjang = %.1f", luas_persegiPanjang);
                    }else if(3==input1){
                        System.out.println("");
                        System.out.println("*Segitiga*");
                        System.out.println("input alas");
                            double alas=rumus.nextDouble();
                            System.out.println("input tinggi");
                            double tinggi=rumus.nextDouble();
                            double luas_segitiga=rumus.nextInt();
                                //rumus luas segitiga
                            luas_segitiga=(((1/2)*alas)*tinggi);
                            System.out.printf("luas Segitiga = %.1f", luas_segitiga);
                    }else if(4==input1){
                        System.out.println("");
                        System.out.println("*Lingkaran*");
                        System.out.println("input jari jari");
                            double jari_jari=rumus.nextDouble();
                            double luas_lingkaran=rumus.nextDouble();
                            //rumus luas lingkaran
                            luas_lingkaran=(Math.PI*jari_jari*jari_jari);
                            System.out.printf("luas lingkaran = %.1f", luas_lingkaran);
                    }else if(5==input1){
                        System.out.println("");
                        System.out.println("*Jajargenjang*");
                        System.out.println("input alas");
                            double alas=rumus.nextDouble();
                            System.out.println("input tinggi");
                            double tinggi=rumus.nextDouble();
                            //rumus luas jajar genjang
                            double luas_jajarGenjang=(alas*tinggi);
                            System.out.printf("luas jajarGenjang = %.1f", luas_jajarGenjang);
                    }else if(6==input1){
                        System.out.println("");
                        System.out.println("*Trapesium*");
                        System.out.println("input panjang AB");
                            double a=rumus.nextDouble();
                            System.out.println("input panjang DC");
                            double b=rumus.nextDouble();
                            System.out.println("input tinggi");
                            double t=rumus.nextDouble();
                            double luas_trapesium=rumus.nextDouble();
                                //rumus luas Trapesium
                                luas_trapesium=((a*b*t)/2);
                                System.out.printf("luas Trapesium = %.1f", luas_trapesium);
                    }else if(7==input1){
                        System.out.println("");
                        System.out.println("*belah ketupat*");
                        System.out.println("input panjang d1");
                            double d1=rumus.nextDouble();
                            System.out.println("input panjang d2");
                            double d2=rumus.nextDouble();
                            double luas_belahKetupat;
                                  //rumus luas belahKetupat
                                luas_belahKetupat=((d1*d2)/2);
                                System.out.printf("luas belahKetupat = %.1f", luas_belahKetupat);
                    }else if(8==input1){
                        System.out.println("");
                        System.out.println("*Layang Layang*");
                        System.out.println("input panjang d1");
                            double d1=rumus.nextDouble();
                            System.out.println("input panjang d2");
                            double d2=rumus.nextDouble();
                            double luas_layangLayang;
                                    //rumus luas layang layang
                            luas_layangLayang=((d1*d2)/2);
                            System.out.printf("luas belahKetupat = %.1f", luas_layangLayang);
                     
                      } else { 
                        System.out.println("pilihan habis");
                    }
            
        } else if( 2 == bangun);{
                System.out.println("");
                System.out.println("**pilih bangun ruang**");
                System.out.println("1. kubus "); 
                System.out.println("2. balok");
                System.out.println("3. bola");
                System.out.println("4. kerucut");
                System.out.println("5. prisma segitiga");
                System.out.println("");
                System.out.println("input angka sesuai yang diinginkan");
                    int input2 = rumus.nextInt();

                    if(1 == input2){
                        System.out.println("");
                        System.out.println("*kubus*");
                        System.out.println("input sisi");
                            double sisi=rumus.nextInt();
                            double volume_kubus;
                            //rumus volume kubus
                            volume_kubus=((sisi*sisi)*sisi);
                            System.out.printf("volume kubus = %.1f", volume_kubus);
                    }else if(2 == input2 ){
                        System.out.println("");
                        System.out.println("*Balok*");
                        System.out.println("input panjang");
                            double panjang=rumus.nextDouble();
                        System.out.println("input lebar");
                            double lebar=rumus.nextDouble();
                        System.out.println("input tinggi");
                            double tinggi=rumus.nextDouble();
                            double volume_balok;
                            //rumus volume balok
                            volume_balok=((panjang*lebar)*tinggi);
                            System.out.printf("volume balok = %.1f", volume_balok);
                    }else if(3==input2){
                        System.out.println("");
                        System.out.println("*Bola*");
                        System.out.println("input jari jari");
                            double jari_jari=rumus.nextDouble();
                            double volume_bola;
                            double pi=3.14;
                            //rumus volume bola
                            volume_bola=((4*(Math.PI)*(Math.pow(pi, 3)))/3); 
                            System.out.printf("volume bola = %.1f" , volume_bola);
                    }else if(4==input2){
                        System.out.println("");
                        System.out.println("*kerucut*");
                        System.out.println("input jari jari");
                            double jari_jari=rumus.nextDouble();
                        System.out.println("input tinggi kerucut");
                            double tinggiKerucut=rumus.nextDouble();
                            double volume_kerucut;
                            double pi=3.14;
                                    //rumus volume kerucut
                            volume_kerucut = ((Math.PI*jari_jari*jari_jari*tinggiKerucut)/3);
                            System.out.printf("volume kerucut =%.1f " , volume_kerucut);
                    }else if(5==input2){
                        System.out.println("");
                        System.out.println("*Prisma Segitiga*");
                        System.out.println("input Alas");
                            double alas=rumus.nextDouble();
                        System.out.println("input tinggi segitiga");
                            double tinggiSegitiga=rumus.nextDouble();
                        System.out.println("input tinggi Prisma");
                            double tinggiPrisma=rumus.nextDouble();
                            double volume_PrismaSegitiga;
                                    //rumus volume Prisma Segitiga
                                volume_PrismaSegitiga = ((alas*tinggiSegitiga*tinggiPrisma)/2);
                                System.out.printf("volume Prisma Segitiga = %.1f" , volume_PrismaSegitiga);
                    }else
                        System.out.println("pilihan habis");
            }
            
        
                  
            
         
            
         

          
    
           
        } 
          
    
    
         
}
