package Praktikum2;
import java.util.Scanner;
public class No1 {
    public static void main(String[] args) {
        int genap = 0;
        int ganjil = 0;
        int positif = 0;
        int negatif = 0;
        
        try {
            Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();

        if (a % 2 == 0){
            if (a == 0){
            genap = genap + 1 ;
            }
            else{
            genap = genap + 1 ;
            }
        }else{
            ganjil = ganjil + 1;
        }
        if (a >= 1){
            positif = positif + 1;
        }else if (a < 0){
            negatif = negatif + 1;
        }
        if (b % 2 == 0){
            if (b == 0){
            genap = genap + 1 ;
            }
            else{
            genap = genap + 1 ;
            }
        }else{
            ganjil = ganjil + 1;
        }
        if (b >= 1){
            positif = positif + 1;
        }else if (b < 0){
            negatif = negatif + 1;
        }
        if (c % 2 == 0){
            if (c == 0){
            genap = genap + 1 ;
            }
            else{
            genap = genap + 1 ;
            }
        }else{
            ganjil = ganjil + 1;
        }
        if (c >= 1){
            positif = positif + 1;
        }else if (c < 0){
            negatif = negatif + 1;
        }
        if (d % 2 == 0){
            if (d == 0){
            genap = genap + 1 ;
            }
            else{
            genap = genap + 1 ;
            }
        }else{
            ganjil = ganjil + 1;
        }
        if (d >= 1){
            positif = positif + 1;
        }else if (d < 0){
            negatif = negatif + 1;
        }
        if (e % 2 == 0){
            if (e == 0){
            genap = genap + 1 ;
            }
            else{
            genap = genap + 1 ;
            }
        }else{
            ganjil = ganjil + 1;
        }
        if (e >= 1){
            positif = positif + 1;
        }else if (e < 0){
            negatif = negatif + 1;
        }
        System.out.println(genap + " angka genap");
        System.out.println(ganjil + " angka ganjil");
        System.out.println(positif + " angka positif");
        System.out.println(negatif + " angka negatif");
        input.close();
        }catch(Exception e ){
            System.out.println("Inputan Tidak Valid");
        }
    }
}
