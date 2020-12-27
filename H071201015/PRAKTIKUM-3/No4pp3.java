import java.util.Scanner;

class No4pp3{
  public static void main(String[] args) {
    Scanner value = new Scanner(System.in);

    System.out.println("^***^ Menghitung Kembalian ^***^");
    System.out.println("HARGA BARANG (Rp.) :");
    int x = value.nextInt();
    System.out.println("Uang yang dibayarkan (Rp.) : ");
    int y = value.nextInt();

    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;
    int sum4 = 0;
    int sum5 = 0;
    int sum6 = 0;
    int sum7 = 0;

    int z = y - x;

    while (z >= 0) {

        if (z >= 100000) {
          sum1 = sum1 + 1;
          z = z - 100000;
      }

      else {
        break;
      }
    }

   while (z > 0) {
      if (z >= 50000 ){
        sum2 += 1;
        z = z - 50000;
      }
      else {
        break;
      }
   }

   while (z > 0) {

      if (z >= 20000) {
        sum3 += 1;
        z = z-20000;
      }
      else {
        break;
      }
  }

    while (z > 0) {

      if (z >= 10000){
        sum4 +=1;
        z = z - 10000;
      }
      else {
        break;
      }
    }

    while (z > 0){

      if (z >= 5000){
        sum5 +=1;
        z = z - 5000;
      }
      else {
        break;
      }
    }

    while (z > 0){

      if (z >= 2000){
        sum6 +=1;
        z = z - 2000;
      }
      else {
        break;
      }
    }

    while (z > 0){

      if (z >= 1000){
        sum7 +=1;
        z = z - 1000;
      }
      else {
        break;
      }
    }
    System.out.println("Kembalian : ");
    System.out.println(sum1 + " uang Rp. 100.000");
    System.out.println(sum2 + " uang Rp. 50.000");
    System.out.println(sum3 + " uang Rp. 20.000");
    System.out.println(sum4 + " uang Rp. 10.000");
    System.out.println(sum5 + " uang Rp. 5.000");
    System.out.println(sum6 + " uang Rp. 2.000");
    System.out.println(sum7 + " uang Rp. 1.000");
    value.close();
  }
}
