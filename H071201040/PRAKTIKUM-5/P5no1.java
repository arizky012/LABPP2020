import java.util.Scanner;
public class P5no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1 = input.nextInt();
        int angka2 = input.nextInt();
        System.out.println("FPB dari " + angka1 + " dan " + angka2 + " = " + cariFPB(angka1, angka2));
        
    }
    public static int cariFPB(int x, int y) {
        int z = 0;
        int besar = y;
        int kecil = x;
        if (x > y) {
            besar = x;
            kecil = y;
        }
        for(int i = 1; i <= besar; i++) {
            if(kecil%i==0 && besar%i==0) 
                z = i;
            
        }
        return z;
        }
    }

