import java.io.*;
import java.util.Scanner;
class P8nomor1 {
    public static void main(String[] args) {
        Scanner haha = new Scanner (System.in);
        
        FileInputStream in = null;
        FileOutputStream out = null;
        File Checked = null;
         

        try {
            String nama = haha.nextLine(); 
            String nama1 = haha.nextLine();
            haha.close();
            in = new FileInputStream(String.format("%s.txt", nama));
            out = new FileOutputStream(String.format("%s.txt", nama1));
            Checked = new File(String.format("%s.txt", nama));
            int read;
            while ((read = in.read()) != -1) {
                out.write(read);
            }
            if (Checked.exists()) {
                System.out.println("berhasil");
            } 
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
                System.out.println(ioe.getMessage());
            }
        }
    }
}
