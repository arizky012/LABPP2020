import java.util.InputMismatchException;
import java.util.Scanner;
public class Soal1Praktikum2 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try {
           
       
        int a, b, c, d, e, genap = 0, ganjil = 0, negatif = 0, positif = 0;
    
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            d = input.nextInt();
            e = input.nextInt(); 
            input.close();

            


            if (a % 2 == 0){
                genap = genap + 1;
            } else {
                ganjil = ganjil + 1;
            }
            if (b % 2 == 0){
                genap = genap + 1;
            } else {
                ganjil = ganjil + 1;
            }
            if (c % 2 == 0){
                genap = genap + 1;
            } else {
                ganjil = ganjil + 1;
            }
            if (d % 2 == 0){
                genap = genap + 1;
            } else {
                ganjil = ganjil + 1;
            }
            if (e % 2 == 0){
                genap = genap + 1;
            } else {
                ganjil = ganjil + 1;
            }
            System.out.println(genap +" angka genap");
         System.out.println(ganjil + " angka ganjil");

            if (a < 0){
                negatif = negatif + 1;
            } else if (a == 0){

            }else{positif = positif + 1;}
            if (b < 0){
                negatif = negatif + 1;
            } else if (b == 0){

            }else{positif = positif + 1;}
            if (c < 0){
                negatif = negatif + 1;
            } else if (c == 0){

            }else{positif = positif + 1;}
            if (d < 0){
                negatif = negatif + 1;
            } else if (d == 0){

            }else{positif = positif + 1;}
            if (e < 0){
                negatif = negatif + 1;
            } else if (e == 0){

            }else{positif = positif + 1;}
            System.out.println(positif + " angka positif");
         System.out.println(negatif + " angka negatif");
        } catch (InputMismatchException ime){
            System.out.println("Inputan Tidak Valid");
        } finally {
            input.close();
        }
    } 
}
