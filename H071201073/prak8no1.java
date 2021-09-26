import java.io.*;
import java.util.Scanner;

public class prak8no1 {
    public static void main(String[] args) {
        Scanner dhian = new Scanner(System.in);
        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            input = new FileInputStream(dhian.next() + ".txt");
            output = new FileOutputStream(dhian.next() + ".txt");
            int n;
            while ((n = input.read()) != -1) {
                output.write(n);
            }
        } catch (IOException ioe) {
            System.out.println("gagal");
        } finally {
            try {
                if (input != null) {
                    System.out.println("Berhasil");
                    input.close();
                }
                if (output != null) {
                    output.close();
                }
            } catch (IOException ioe) {
                System.out.println("Gagal");
            }
        }
    }
}
