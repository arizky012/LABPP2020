import java.util.Scanner;
public class Tugasp1_2 {
    public static void main(String[] args) {
      Scanner z = new Scanner(System.in);
      System.out.println("Masukkan detik =");
      int x = z.nextInt();

      int jam; int sisa; int menit; int detik;

      jam = x/3600; 
      sisa = x%3600;
      menit=sisa/60;
      detik = sisa%60;
        System.out.printf("Konversi jam:menit:detik =\n %02d:%02d:%02d",jam,menit,detik);
       
        
    }
}
