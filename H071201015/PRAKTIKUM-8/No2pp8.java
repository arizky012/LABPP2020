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
        writes.write("\ntessbaris 2");
        writes.write("\nris 3");
        writes.close();


        BufferedReader reed = new BufferedReader(new FileReader(namaFile + ".txt"));
        BufferedReader readchar = new BufferedReader(new FileReader(namaFile + ".txt"));
        String i = " ";
        int space = 0;
        String k = " ";
        // perulangan untuk menghitung baris yang paling panjang
        while ((k = readchar.readLine()) != null) {
          int panjang = k.length();
          if (panjang > space) {
            space = panjang;
          }
        }
        readchar.close();

        // perulangan untuk write ke file copy dengan rata kanan
        while ((i = reed.readLine()) != null) {
          cops.write(String.format("%"+ space + "s\n", i)); // %space untuk align kanan baris
        }
        reed.close();
        cops.close();
        System.out.println("Berhasil");
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
      System.out.println("gagal :(");
    }
    val.close();
  }
}
