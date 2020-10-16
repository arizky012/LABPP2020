import java.util.Scanner;

public class TugasPraktikum1No3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float h;
        h = input.nextFloat();
        float a;
        a = input.nextFloat();
        float b;
        b = input.nextFloat();

        if (90>a){
            if (a>b){
                float x;
                float y;
                y = h*(float) Math.tan(Math.toRadians(a));
                x = y-(h*(float) Math.tan(Math.toRadians(b)));
                System.out.printf("%.1f m", x);
                
            }
        }
    }

}