import java.util.Scanner;
import java.io.*;
class P8nomor2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        FileReader x = null;
        BufferedReader y = null;
        FileWriter fWriter = null;
        PrintWriter pWriter = null; 
        
        try {
            String source = scan.next();
            String destination = scan.next();
            scan.close();
            x = new FileReader(source + ".txt");
            y = new BufferedReader(x);
            fWriter = new FileWriter(destination + ".txt");
            pWriter = new PrintWriter(fWriter);
            String read;
            int max = 0;

            while ((read = y.readLine()) != null) {
                max = read.length() > max ? read.length() : max ;
            }
            
            x = new FileReader(source + ".txt");
            y = new BufferedReader(x);

            String check;
            while ((check = y.readLine()) != null) {
                pWriter.write(String.format("%" +max+ "s\n", check));
            }
            
        } catch (IOException ioe) {
            System.out.println("Gagal");
        } finally {
            try {
                if (fWriter != null) {
                    fWriter.close();
                }
                if (pWriter != null) {
                    pWriter.close();
                }
                if (y != null) {
                    System.out.println("Berhasil");
                    y.close();
                }
                if (x != null) {
                    x.close();
                }    
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
        
    }
    
}
