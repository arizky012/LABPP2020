import java.util.Scanner;

class No5pp3{
  public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    int Jam, Menit, Detik;
    float x;

    System.out.println("Input derajat : ");
    while ( value.hasNextFloat() ){
      x = value.nextFloat();

      if (x >= 360){
        System.out.println("Error");
        break;
      }

      float  y = x * 240f + 21600f;
      Detik    = ((int)y % 60);
      Jam      =  ((int)y / 60);
      Menit    =  (Jam % 60);
      Jam      =  (Jam / 60);

      if (Jam < 12){
        System.out.println("Selamat Pagi");
        System.out.printf("%02d", Jam);
        System.out.printf(":");
        System.out.printf("%02d", Menit);
        System.out.printf(":");
        System.out.printf("%02d\n", Detik);
      }
      else if (Jam >= 12 & Jam < 15 ){
        System.out.println("Selamat Siang");
        System.out.printf("%02d", Jam);
        System.out.printf(":");
        System.out.printf("%02d", Menit);
        System.out.printf(":");
        System.out.printf("%02d\n", Detik);
      }
      else if (Jam >= 15 && Jam < 18){
        System.out.println("Selamat Sore");
        System.out.printf("%02d", Jam);
        System.out.printf(":");
        System.out.printf("%02d", Menit);
        System.out.printf(":");
        System.out.printf("%02d\n", Detik);
      }
      else if (Jam >= 18 && Jam < 24){
        System.out.println("Selamat Malam");
        System.out.printf("%02d", Jam);
        System.out.printf(":");
        System.out.printf("%02d", Menit);
        System.out.printf(":");
        System.out.printf("%02d\n", Detik);
      }
      else {
         Jam = Jam - 24;
         System.out.println("Selamat Pagi");
         System.out.printf("%02d", Jam);
         System.out.printf(":");
         System.out.printf("%02d", Menit);
         System.out.printf(":");
         System.out.printf("%02d\n", Detik);
      }
    }
    value.close();
  }
}
