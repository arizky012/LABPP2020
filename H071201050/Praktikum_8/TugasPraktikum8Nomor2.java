import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TugasPraktikum8Nomor2 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String inputNamaFile = input.nextLine();
        String namaFile = inputNamaFile + ".txt";
        String inputCopiedFile = input.nextLine();
        String copiedFile = inputCopiedFile + ".txt";
        copy(namaFile, copiedFile);
        input.close();
    }

    public static void copy(String sourceFile, String copiedFile) {
        File file = new File(sourceFile);
        if (!file.exists() || !file.isFile()) {
            System.out.println();
            System.out.println("\"Gagal\"");
            return;
        } else {
            String copiedFileName = sourceFile.replace(sourceFile, copiedFile);
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader((sourceFile)))) {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter((copiedFileName)));
                // Menentukan Panjang Array untuk menyimpan panjang karakter tiap baris
                BufferedReader x = new BufferedReader(new FileReader(sourceFile));
                int count = 0;
                while (x.readLine() != null) {
                    count++;
                }
                int[] charArray = new int[count];
                x.close();
                // Mengisi Array dengan panjang karakter tiap baris pada File
                BufferedReader y = new BufferedReader(new FileReader(sourceFile));
                String line = new String();
                int count2 = 0;
                int length;
                while ((line = y.readLine()) != null) {
                    length = line.length();
                    charArray[count2] = length;
                    count2++;
                }
                y.close();
                // Menentukan Nilai Max dari Array
                int max = charArray[0];
                for (int i = 0; i < charArray.length; i++) {
                    if (charArray[i] > max) {
                        max = charArray[i];
                    }
                }
                // Menulis Hasil Salinan dengan format rata kanan
                String line2 = new String();
                while ((line2 = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(String.format("%" + max + "s", line2));
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
                System.out.println();
                System.out.println("\"Berhasil\"");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
