import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TugasPraktikum8Nomor3 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String inputNamaFile = input.nextLine();
        String namaFile = inputNamaFile + ".txt";
        int banyakAsisten = input.nextInt();
        writeTo(namaFile, banyakAsisten);
        input.close();

    }

    public static void writeTo(String fileName, int banyak) throws IOException {
        Scanner input = new Scanner(System.in);
        File file = new File(fileName);
        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        int count = 1;
        bufferedWriter.write("+----------------------+------------+----------+\n");
        bufferedWriter.write("| Nama                 | NIM        | Angkatan |\n");
        bufferedWriter.write("+----------------------+------------+----------+\n");
        while (count <= banyak) {
            String nama = input.nextLine();
            if (nama.length() > 20) {
                System.out.println("Nama Terlalu Panjang");
            } else {
                String formatNama = String.format("%-20s", nama);
                String nim = input.nextLine();
                String angkatan = input.nextLine();
                bufferedWriter.write("| " + formatNama + " | " + nim + " | " + angkatan + "     |\n");
                count++;
            }
        }
        bufferedWriter.write("+----------------------+------------+----------+\n");
        bufferedWriter.newLine();
        // Cek File
        System.out.println();
        if (!file.exists() || !file.isFile()) {
            System.out.println("\"Gagal\"");
        } else {
            System.out.println("\"Berhasil\"");
        }

        input.close();
        bufferedWriter.close();
        fileWriter.close();
    }
}
