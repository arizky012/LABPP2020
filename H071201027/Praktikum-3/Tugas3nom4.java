import java.util.*;


public class Tugas3nom4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
    System.out.println("MASUKKAN HARGA BARANG");
    int barang = x.nextInt();
    System.out.println("MASUKKAN NILAI UANG YANG DI BAYARKAN");
    int uang = x.nextInt();
    int seratus=0,limpu=0,duapu=0,sepul=0,limari=0,duaribu=0,seribu=0;
    int kmbli = uang- barang;

    if( uang>=barang){
        while(kmbli>0 ){
            if ( kmbli-100000>=0){
                kmbli-=100000;
                seratus++;
            }else if( kmbli-50000>=0){
                kmbli-=50000;
                limpu++;
            }else if( kmbli-20000>=0){
                kmbli-=20000;
                duapu++;
            }else if( kmbli-10000>=0){
                kmbli-=10000;
                sepul++;
            }else if( kmbli-5000>=0){
                kmbli-=5000;
                limari++;
            }else if( kmbli-2000>=0){
                kmbli-=2000;
                duaribu++;
            }else {
                kmbli-=1000;
                seribu++;
            }
        }
        System.out.println(seratus+" uang Rp.100.000");
        System.out.println(limpu+" uang Rp.50.000");
        System.out.println(duapu+" uang Rp.20.000");
        System.out.println(sepul+" uang Rp.10.000");
        System.out.println(limari+" uang Rp.5.000");
        System.out.println(duaribu+" uang Rp.2.000");
        System.out.println(seribu+" uang Rp.1.000");
    }else{
        System.out.println("Inputan anda salah, inputan yang benar adalah uang>=harga barang");
    }
    

    
    
    

}
    }
    
