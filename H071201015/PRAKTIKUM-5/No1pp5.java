import java.util.Scanner;

 class No1pp5 {

   static int cariFPB(int a, int b){
     int big = 0;
     int fpb = 0;

     if (a > b) {
       big = a;
     }
     else {
       big = b;
     }

     for (int i = 1;i <= big ;i++ ) {
       if (a % i == 0 && b % i == 0) {
         fpb = i;
       }
     }
     return fpb;
   }

  public static void main(String[] args) {
    Scanner val = new Scanner (System.in);

    int a = val.nextInt();
    int b = val.nextInt();
    int fpb = cariFPB(a, b);

    System.out.println("FPB dari " + a + " dan " + b + " = " + fpb);
    val.close();
  }
}
