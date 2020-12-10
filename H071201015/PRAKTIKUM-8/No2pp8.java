import java.io.*;
import java.util.Scanner;

 class No2pp8 {
  public static void main(String[] args) {
    Scanner val = new Scanner(System.in);

    System.out.printf("Nama file : ");
    String  namaFile = val.nextLine();
    System.out.printf("Nama Copy : ");
    String copyFile = val.nextLine();

    try {
        BufferedWriter writes = new BufferedWriter(new FileWriter(namaFile + ".txt", false)); // false untuk overwrite, true untuk append
        BufferedWriter cops = new BufferedWriter(new FileWriter(copyFile + ".txt", false));

        writes.write("baris 1");
        writes.write("\nbaris 2");
        writes.write("\nbaris 3");
        writes.close();

        BufferedReader reed = new BufferedReader(new FileReader(namaFile + ".txt"));
        String i = " ";
        while ((i = reed.readLine()) != null) {
          cops.write(String.format("%15s\n", i));
        }
        reed.close();
        cops.close();
        System.out.println("Berhasil");
    }
    catch(Exception e) {
      System.out.println("gagal :(");
    }
    val.close();
  }
}
