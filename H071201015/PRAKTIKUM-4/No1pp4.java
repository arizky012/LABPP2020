import java.util.Scanner;

 class No1pp4 {
  public static void main(String[] args) {

      Scanner val = new Scanner(System.in);
      int n = val.nextInt();
      int[] bil = new int[n];
      int big = 0;

      for (int i = 0;i < n ;i++ ) {
        bil[i] = val.nextInt();
      }

      big = bil[0];
      for (int i = 0; i< n;i++){
        if (big < bil[i]) {
          big = bil[i];
        }
      }

        for (int h = 0; h < n -1 ;h++){
          for (int l = h +1;l < n ;l++ ) {
            int count = 0;
            for (int m = 1;m  < big ;m++ ) {
              if (bil[h] % m == 0 && bil[l] % m == 0) {
                count++;
              }
               if (bil[h] % 2 == 0 && bil[l] % 2 == 0) {
                System.out.print("");
              }
            }
            if (count == 1) {
              System.out.print(bil[h] + " " + bil[l]);
              System.out.println(" ");
            }
            else{
              System.out.print("");
            }
          }
        }

        val.close();
  }
}
