import java.util.Scanner;

class No2pp3{

  public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    int count = 0;

    System.out.println("-- MENCETAK BILANGAN --");
    System.out.println("Input berapa kolom yang anda inginkan : ");
    int x = value.nextInt();
    System.out.println("input berapa bilangan terkahir :");
    int y = value.nextInt();

      for(int j = 1;j <= y;j++) {
        count += 1;
        System.out.print(j + " ");

        if (count == x) {
          count = 0;
          System.out.println(" ");
        }
      }
      value.close();
  }
}
