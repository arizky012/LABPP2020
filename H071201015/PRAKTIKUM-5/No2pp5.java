import java.util.Scanner;
import java.util.Random;

 class No2pp5 {
   public static String generateSerial(int n, int m) {
     Random rando = new Random();
     String str = "";

     for (int h = 0;h < n ;h++ ) {
       for (int i = 0;i < m ;i++ ) {
         int num = rando.nextInt(10);
         String str1 = Integer.toString(num);
         str += str1;
     }
     if (h < n-1) {
       str = str + "-";
     }
   }
     return str;
   }

  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    String serialNumber = generateSerial(n, m);
    System.out.println(serialNumber);
    scanner.close();
  }
}
