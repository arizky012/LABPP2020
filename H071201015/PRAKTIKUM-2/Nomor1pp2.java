import java.util.Scanner;
import java.util.InputMismatchException;

public class Nomor1pp2{
  public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    int sumeven = 0;
    int sumodd  = 0;
    int sumpstv = 0;
    int sumngtv = 0;
    int b1 = 0;
    int b2 = 0;
    int b3 = 0;
    int b4 = 0;
    int b5 = 0;

    System.out.println("input elemen : ");

      try {
             b1 = value.nextInt();
             b2 = value.nextInt();
             b3 = value.nextInt();
             b4 = value.nextInt();
             b5 = value.nextInt();
          }
      catch (InputMismatchException ex)
          {
            System.out.println("inputan tidak valid");
            System.exit(1);
          }


      if(b1 % 2 == 0){
         sumeven = sumeven + 1;
      }
      else if (b1 % 2 != 0){
        sumodd =sumodd + 1;
      }
       if (b1 > 0){
        sumpstv = sumpstv + 1;
      }
      else if (b1 < 0){
        sumngtv = sumngtv + 1;
      }
      if(b2 % 2 == 0){
         sumeven = sumeven + 1;
      }
      else if (b2 % 2 != 0){
        sumodd =sumodd + 1;
      }
       if (b2 > 0){
        sumpstv = sumpstv + 1;
      }
      else if (b2 < 0){
        sumngtv = sumngtv + 1;
      }
      if(b3 % 2 == 0){
         sumeven = sumeven + 1;
      }
      else if (b3 % 2 != 0){
        sumodd =sumodd + 1;
      }
       if (b3 > 0){
        sumpstv = sumpstv + 1;
      }
      else if (b3 < 0){
        sumngtv = sumngtv + 1;
      }
      if(b4% 2 == 0){
         sumeven = sumeven + 1;
      }
      else if (b4 % 2 != 0){
        sumodd =sumodd + 1;
      }
       if (b4 > 0){
        sumpstv = sumpstv + 1;
      }
      else if (b4 < 0){
        sumngtv = sumngtv + 1;
      }
      if(b5 % 2 == 0){
         sumeven = sumeven + 1;
      }
      else if (b5 % 2 != 0){
        sumodd =sumodd + 1;
      }
       if (b5 > 0){
        sumpstv = sumpstv + 1;
      }
      else if (b5 < 0){
        sumngtv = sumngtv + 1;
      }

    System.out.println(sumeven + " angka genap");
    System.out.println(sumodd + " angka ganjil;");
    System.out.println(sumpstv + " angka positif");
    System.out.println(sumngtv + " angka negatif");

  }
}
