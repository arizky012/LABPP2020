import java.util.Scanner;
public class prak3no4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int harga = in.nextInt();
        int uang  = in.nextInt();
        int seribu=0, duaribu=0, limaribu=0, sepuluhribu=0, duapuluhribu=0, limapuluhribu=0, seratusribu=0;

        if (harga <= uang ){
            int jumlah = uang-harga;
            while (jumlah > 0){

            if (jumlah >= 100000){
                jumlah -= 100000;
                seratusribu++;
            } else if (jumlah - 50000 >= 0){
                jumlah -= 50000;
                limapuluhribu++;
            } else if (jumlah - 20000 >= 0){
                jumlah -= 20000;
                duapuluhribu++;
            }else if (jumlah - 10000 >= 0){
                jumlah -= 10000;
                sepuluhribu++;
            }else if (jumlah - 5000 >= 0){
                jumlah -= 5000;
                limaribu++;
            }else if (jumlah - 2000 >= 0){
                jumlah -= 2000;
                duaribu++;
            }else {
                jumlah -= 1000;
                seribu++;
            }
        }
        System.out.println(seratusribu   + "  uang Rp. 100.000");
        System.out.println(limapuluhribu + "  uang Rp. 50.000");
        System.out.println(duapuluhribu  + "  uang Rp. 20.000");
        System.out.println(sepuluhribu   + "  uang Rp. 10.000");
        System.out.println(limaribu      + "  uang Rp. 5.000");
        System.out.println(duaribu       + "  uang Rp. 2.000");
        System.out.println(seribu        + "  uang Rp. 1.000");

        }
        in.close();
            
}

}