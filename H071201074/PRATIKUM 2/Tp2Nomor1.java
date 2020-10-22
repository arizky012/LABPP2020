import java.util.Scanner;

class Tp2Nomor1{
    public static void main(String[] arg){
        Scanner x = new Scanner(System.in);

        try{
            int num1 = x.nextInt();
            int num2 = x.nextInt();
            int num3 = x.nextInt();
            int num4 = x.nextInt();
            int num5 = x.nextInt();

            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;

            if (num1 < 0){
                c += 1;
            } else{
                d += 1;
            } 
            if ((num1%2) == 0){
                a += 1;
            } else {
                b += 1;
            } 
            if (num2 < 0){
                c += 1;
            } else {
                d += 1;
            } 
            if ((num2%2) == 0){
                a += 1;
            } else {
                b += 1;
            } 
            if (num3 < 0){
                c += 1;
            } else {
                d += 1;
            } 
            if ((num3%2) == 0){
                a += 1;
            } else {
                b += 1;
            } 
            if (num4 < 0){
                c += 1;
            } else {
                d += 1;
            } 
            if ((num4%2) == 0){
                a += 1;
            } else {
                b += 1;
            } 
            if (num5 < 0){
                c += 1;
            } else{
                d += 1;
            } 
            if ((num5%2) == 0){
                a += 1;
            } else {
                b += 1;
            }
            System.out.println( a + " angka genap");
            System.out.println( b + " angka ganjil");
            System.out.println( d + " angka positif");
            System.out.println( c + " angka negatif");
        } catch ( Exception e){
            System.out.println("Inputan tidak sesuai");
        }
    }
}