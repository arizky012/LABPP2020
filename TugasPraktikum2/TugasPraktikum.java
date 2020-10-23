import java.util.Scanner;
public class TugasPraktikum {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        try {
        int a = user.nextInt();
        int b = user.nextInt();
        int c = user.nextInt();
        int d = user.nextInt();
        int e = user.nextInt();
        int genap = 0;
        int positif = 0 ;
        int ganjil = 0 ;
        int negatif = 0;

        if (a%2 == 0){
            genap++;
        }else{
            ganjil++;
        }if (a<0){
            negatif++;
        }else if (a == 0){

        }else{
            positif++;
        }
        if (b%2 == 0){
           genap++;
        }else{
            ganjil++;
        }if (b<0){
            negatif++;
        }else if (b == 0){

        }else{
            positif++;
        }
        if (c%2 == 0){
            genap++;
        }else{
            ganjil++;
        }if (c<0){
            negatif++;
        }else if (c == 0){

        }else{
            positif++;
        }
        if (d%2 == 0){
            genap++;
        }else{
            ganjil++;
        }if (d<0){
            negatif++;
        }else if(d == 0){

        }else{
            positif++;
        }
        if (e%2 == 0){
            genap++;
        }else{
            ganjil++;
        }if (e<0){
            negatif++;
        }else if (e == 0){
        
        }else{
            positif++;
        }
        System.out.println(genap+ " Angka genap");
        System.out.println(ganjil+ " Angka ganjil");
        System.out.println(positif+ " Angka positif");
        System.out.println(negatif+ " Angka negatif");
        }catch (Exception) {
            System.out.println("Inputan tidak valid");
        }
    }
}
