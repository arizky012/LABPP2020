import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
 
public class P8no1 {
 public static void main(String[] args) {
     Scanner object = new Scanner(System.in);
     FileInputStream in = null;
     FileOutputStream out = null;
     String input = object.next();
     String output = object.next();
     try {
        in = new FileInputStream(input+".txt");
        out = new FileOutputStream(output+".txt");
        int data;
        while ((data = in.read()) != -1) {
            out.write(data);
        }
        System.out.println("berhasil");
    } catch (IOException ioe) {
        System.out.println("gagal");
    } finally {
        try {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        } catch (IOException ioe) {
            System.out.println("gagal");
        }
    }
}
}