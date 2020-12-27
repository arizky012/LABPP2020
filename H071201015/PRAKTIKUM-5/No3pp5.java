import java.util.Scanner;

class No3pp5 {
  static void myDay(int day) {
    int tahun = 0;
    int bulan = 0;
    int hari  = 0;

    while ( day >= 365) {
      day = day - 365;
      tahun++;
    }
    while (day >= 30) {
      day = day - 30;
      bulan++;
    }
    if (bulan == 12) {
      hari = 0;
    }
    else {
      hari = day;
    }

    System.out.println(tahun + " tahun");
    System.out.println(bulan + " bulan");
    System.out.println(hari + " hari");

  }

  public static void main(String[] args) {
      Scanner val = new Scanner (System.in);

      System.out.printf("Input usia anda dalam hari : ");
      int day = val.nextInt();

      myDay(day);
      val.close();
  }
}
