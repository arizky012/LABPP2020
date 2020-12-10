import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;

 class No3pp8 {
  public static void main(String[] args)  {
      Scanner val = new Scanner(System.in);

      System.out.printf("Nama File : ");
      String namaFile = val.nextLine();
      System.out.printf("Banyak Asisten :");
      int leng = val.nextInt();

      String[] assist = new String[leng];
      String[] nim = new String[leng];
      int[] grde = new int[leng];

      for (int i = 0;i < leng ;i++) {
        val.nextLine(); // untuk mengonsumsi input enter
        assist[i] = val.nextLine(); // input nama

        if (assist[i].length() > 20) {
          System.out.println("Nama Panjang");
          System.exit(1);
        }

        try {
          nim[i] = val.nextLine(); // input nim
        } catch(InputMismatchException e) {
          System.out.println(e.getMessage());
        }

        grde[i] = val.nextInt();// input angkatan

      }

      try {

        BufferedWriter writes = new BufferedWriter(new FileWriter (namaFile + ".txt", false)); // false untuk overwrite, true untuk append
        writes.write("+----------------------+-------------+----------+\n");
        writes.write(String.format("| %s%18s %s%10s %s %s", "Nama", "|", "NIM", "|", "Angkatan", "|"));
        writes.write("\n+----------------------+-------------+----------+");

        for (int i = 0;i < leng ;i++ ) {
          writes.write(("\n|"));
          writes.write(String.format(" %1$-21s",assist[i]));
          writes.write(String.format("%s","|"));
          writes.write(String.format(" %1$-12s", nim[i]));
          writes.write(String.format("%s", "|"));
          writes.write(String.format(" %1$-8s", grde[i]));
          writes.write(" |");
        }
        writes.write("\n+----------------------+-------------+----------+");

        writes.close();
        System.out.println("Berhasil");
      } catch(Exception e) {
        System.out.println("gagal :(");
        e.printStackTrace();
      }



  }
}
