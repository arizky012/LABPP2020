import java.util.*;

/**
 * kapal
 */
public class kapal {
    static Scanner ippa = new Scanner (System.in);
    public static void main(String[] args) {
        int h = ippa.nextInt();
        int a = ippa.nextInt();
        int b = ippa.nextInt();

    if (90<a) {
        System.out.println("a harus lebih kecil dari 90");
    }else if (a>b){
        double A = (double)h*(Math.tan(Math.toRadians(a))-Math.tan(Math.toRadians(b)));        
        System.out.printf("%.1f m\n", A);
    }else {
        System.out.println("a harus lebih besar dari b, input ulang nilai a dan b");
    }
    }
}