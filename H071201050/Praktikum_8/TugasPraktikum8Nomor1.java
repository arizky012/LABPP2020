import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class TugasPraktikum8Nomor1 {
    public static void main(String[] args) {
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
                String line = new String();
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(line);
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
