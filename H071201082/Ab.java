import java.util.Scanner;

// No 1 Praktikum 5 

public class Ab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int faktor = cariFPB(a,b);
        System.out.printf("FPB dari %d dan %d = %d", a , b , faktor);
        input.close();
    }
    public static int cariFPB(int a , int b){
        int kecil = a;
        int besar = b;
        int faktor = 0;

        if (a > b){
            kecil = b;
            besar = a;
        }
        for (int i = kecil ; i > 0 ; --i){
            if (kecil % i == 0 && besar % i == 0){
                faktor = i;
            break;
            }
        }
        return faktor;
    }
}
