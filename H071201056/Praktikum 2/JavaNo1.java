import java.util.InputMismatchException; 
import java.util.Scanner;

public class JavaNo1 {
    public static void main(String[] args) {
        Scanner Sinjai = new Scanner(System.in);

        try {
            int a, b, c, d, e;
            a = Sinjai.nextInt();
            b = Sinjai.nextInt();
            c = Sinjai.nextInt();
            d = Sinjai.nextInt();
            e = Sinjai.nextInt();

        // Hitungan banyaknya bilangan genap dan ganjil

        int j_GenapA = 0;
        int j_GenapB = 0;
        int j_GenapC = 0;
        int j_GenapD = 0;
        int j_GenapE = 0;

        int j_GanjilA = 0;
        int j_GanjilB = 0;
        int j_GanjilC = 0;
        int j_GanjilD = 0;
        int j_GanjilE = 0;

        if(a % 2 == 0) {
            j_GenapA = 1; //menambahkan jumlah keseluruhan angka genap 
            j_GanjilA = 0;
        } else {
            j_GenapA = 0;
            j_GanjilA = 1;
        } 

        if(b % 2 == 0) {
            j_GenapB = 1;
            j_GanjilB = 0;
        } else {
            j_GenapB = 0;
            j_GanjilB = 1;
        } 

        if(c % 2 == 0) {
            j_GenapC = 1;
            j_GanjilC = 0;
        } else {
            j_GenapC = 0;
            j_GanjilC = 1;
        } 

        if(d % 2 == 0) {
            j_GenapD = 1;
            j_GanjilD = 0;
        } else {
            j_GenapD = 0;
            j_GanjilD = 1;
        } 

        if(e % 2 == 0) {
            j_GenapE = 1;
            j_GanjilE = 0;
        } else {
            j_GenapE = 0;
            j_GanjilE = 1;
        } 

        int totalGenap = j_GenapA + j_GenapB + j_GenapC + j_GenapD + j_GenapE;
        int totalGanjil = j_GanjilA + j_GanjilB + j_GanjilC + j_GanjilD + j_GanjilE;

        // Hitungan banyaknya bilangan positif dan negatif

        int j_PositifA = 0;
        int j_PositifB = 0;
        int j_PositifC = 0;
        int j_PositifD = 0;
        int j_PositifE = 0;

        int j_NegatifA = 0;
        int j_NegatifB = 0;
        int j_NegatifC = 0;
        int j_NegatifD = 0;
        int j_NegatifE = 0;

        if(a > 0) {
            j_PositifA = 1;
            j_NegatifA = 0;
        } else if(a == 0) {
                j_PositifA = 0;
                j_NegatifA = 0;
            } else {
                j_PositifA = 0;
                j_NegatifA = 1;
            }

        if(b > 0) {
            j_PositifB = 1;
            j_NegatifB = 0;
        } else if(b == 0) {
                j_PositifB = 0;
                j_NegatifB = 0;
            } else {
                j_PositifB = 0;
                j_NegatifB = 1;
            }

        if(c > 0) {
            j_PositifC = 1;
            j_NegatifC = 0;
        } else if(c == 0) {
                j_PositifC = 0;
                j_NegatifC = 0;
            } else {
                j_PositifC = 0;
                j_NegatifC = 1;
            }

        if(d > 0) {
            j_PositifD = 1;
            j_NegatifD = 0;
        } else if(d == 0) {
                j_PositifD = 0;
                j_NegatifD = 0;
            } else {
                j_PositifD = 0;
                j_NegatifD = 1;
            }

        if(e > 0) {
            j_PositifE = 1;
            j_NegatifE = 0;
        } else if(e == 0) {
                j_PositifE = 0;
                j_NegatifE = 0;
            } else {
                j_PositifE = 0;
                j_NegatifE = 1;
            } 

        int totalPositif = j_PositifA + j_PositifB + j_PositifC + j_PositifD + j_PositifE;
        int totalNegatif = j_NegatifA + j_NegatifB + j_NegatifC + j_NegatifD + j_NegatifE;

        System.out.println(totalGenap + " Angka Genap");
        System.out.println(totalGanjil + " Angka Ganjil");
        System.out.println(totalPositif + " Angka Positif");
        System.out.println(totalNegatif + " Angka Negatif");

    } catch(InputMismatchException ime) {
        System.out.println("Inputan Tidak Valid");    
    }finally {
        Sinjai.close();
    }
    }
}
