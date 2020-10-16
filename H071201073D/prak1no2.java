import java.util.Scanner;

public class prak1no2{

    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int waktu = n.nextInt();
        int jam = waktu/3600;
        int menit = (waktu%3600)/60;
        int detik = waktu% 60;
    
        System.out.println("konversi waktu (jam:menit:detik)");
        System.out.println(jam  + ":" + menit + ":" + detik);



        

































































        
    }
}