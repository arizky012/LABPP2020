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
        System.out.printf("Nama asisten : ");
        assist[i] = val.nextLine();

        if (assist[i].length() > 20) {
          System.out.println("Input ulang");
          assist[i] = val.nextLine(); // input nama

        }

        try {
          System.out.printf("NIM : ");
          nim[i] = val.nextLine(); // input nim
        } catch(InputMismatchException e) {
          System.out.println(e.getMessage());
        }
        System.out.printf("ANGKATAN : ");
        grde[i] = val.nextInt();// input angkatan

      }
      // inisialisasi IO
      try {

        BufferedWriter writes = new BufferedWriter(new FileWriter (namaFile + ".txt", false)); // false untuk overwrite, true untuk append
        // membentuk tabel
        writes.write("+----------------------+-------------+----------+\n");
        writes.write(String.format("| %s%18s %s%10s %s %s", "Nama", "|", "NIM", "|", "Angkatan", "|"));
        writes.write("\n+----------------------+-------------+----------+");
        //loop untuk isi tabel
        for (int i = 0;i < leng ;i++ ) {
          writes.write(("\n|"));
          writes.write(String.format(" %-20s",assist[i])); // %-n dipakai untuk rata kiri
          writes.write(" |");
          writes.write(String.format(" %-11s", nim[i]));
          writes.write(" |");
          writes.write(String.format(" %-8s", grde[i]));
          writes.write(" |");
        }
        writes.write("\n+----------------------+-------------+----------+");

        writes.close();
        System.out.println("Berhasil");
      } catch(Exception e) {
        System.out.println("gagal :(");
        e.printStackTrace();
      }
      val.close();
  }
}
