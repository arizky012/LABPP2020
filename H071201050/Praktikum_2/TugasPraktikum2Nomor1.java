import java.util.InputMismatchException;
import java.util.Scanner;
public class TugasPraktikum2Nomor1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int ganjil = 0;
        int genap = 0;
        int positif = 0;
        int negatif = 0;

        try{
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            d = input.nextInt();
            e = input.nextInt();
        }
        catch (InputMismatchException message_error){
            System.out.println("Inputan Tidak Valid");
        }
        finally{
            // a
            if (a % 2 == 0){
                genap++;
                if (a > 0){
                    positif++;
                }
                else if (a < 0){
                    negatif++;
                }
            }
            else{
                ganjil++;
                if (a > 0){
                    positif++;
                }
                else if (a < 0){
                    negatif++;
                }
            }
            // b
            if (b % 2 == 0){
                genap++;
                if (b > 0){
                    positif++;
                }
                else if (b < 0){
                    negatif++;
                }
            }
            else{
                ganjil++;
                if (b > 0){
                positif++;
            }
                else if (b < 0){
                    negatif++;
                }
            }
            // c
            if (c % 2 == 0){
                genap++;
                if (c > 0){
                    positif++;
                }
                else if (c < 0){
                    negatif++;
                }
            }
            else{
                ganjil++;
                if (c > 0){
                    positif++;
                }
                else if (c < 0){
                    negatif++;
                }
            }
            // d
            if (d % 2 == 0){
                genap++;
                if (d > 0){
                    positif++;
                }
                else if (d < 0){
                    negatif++;
                }
            }
            else{
                ganjil++;
                if (d > 0){
                    positif++;
                }
                else if (d < 0){
                    negatif++;
                }
            }
            // e
            if (e % 2 == 0){
                genap++;
                if (e > 0){
                    positif++;
                }
                else if (e < 0){
                    negatif++;
                }
            }
            else{
                ganjil++;
                if (e > 0){
                    positif++;
                }
                else if (e < 0){
                    negatif++;
                }
            }
            System.out.println(genap + " Angka Genap");
            System.out.println(ganjil + " Angka Ganjil");
            System.out.println(positif + " Angka Positif");
            System.out.println(negatif + " Angka Negatif");
        }
    }
}