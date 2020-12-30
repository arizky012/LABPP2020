import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Masukkan nilai awal : ");
        int x = user.nextInt();
        System.out.print("Masukkan nilai akhir : ");
        int y= user.nextInt();
        System.out.println("Keterangannya :");
    
        for (; x <= y ; x++){
            if (x < 0 && x%2 == 0){
                System.out.println(x+ " angka genap negatif ");
            }else if (x < 0 && x%2 != 0){
                System.out.println(x+ " angka ganjil negatif ");
            }else if (x > 0 && x%2 == 0){
                System.out.println(x+ " angka genap positif ");
            }else if (x > 0 && x%2 != 0){
                System.out.println(x+ " angka ganjil positif ");
            }else{
                System.out.println(x+ " angka nol ");
            }
        }
    }
    
}
