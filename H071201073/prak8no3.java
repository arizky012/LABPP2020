
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class prak8no3 {
    public static void main(String[] args) {
        Scanner dhian = new Scanner(System.in);
        FileWriter fileWrite = null;
        PrintWriter printWrite = null;

        try {
            System.out.print("");
            String fileName = dhian.nextLine() + ".txt";
            ArrayList<String> nameList = new ArrayList<>();
            ArrayList<String> nimList = new ArrayList<>();
            ArrayList<String> angkatanList = new ArrayList<>();

            System.out.print("");
            int numberAssistance = dhian.nextInt();
            dhian.nextLine();

            for (int i = 0; i < numberAssistance; i++) {
                System.out.print("");
                nameList.add(dhian.next());
                System.out.print("");
                nimList.add(dhian.next());
                System.out.print("");
                angkatanList.add(dhian.next());
            }

            fileWrite = new FileWriter(fileName);
            printWrite = new PrintWriter(fileWrite);
            printWrite.printf("+----------------------+------------+-----------+\n");
            printWrite.printf("|NAMA                  |NIM         |ANGKATAN   |\n");
            printWrite.printf("+----------------------+------------+-----------+\n");
            for (int j = 0; j < numberAssistance; j++) {
                printWrite.printf("| %-20s | %-10s | %-8s  |\n", nameList.get(j), nimList.get(j), angkatanList.get(j));
            }
            printWrite.printf("+----------------------+------------+-----------+\n");

        } catch (IOException ioe) {
            System.out.println("Gagal");
        } finally {
            try {
                if (printWrite != null) {
                    System.out.println("Berhasil");
                    printWrite.close();
                }
                if (fileWrite != null) {
                    fileWrite.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}
