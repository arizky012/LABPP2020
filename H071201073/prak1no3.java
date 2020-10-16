import java.util.Scanner;
public class prak1no3 {

        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float h = input.nextFloat();
        float a = input.nextFloat();
        float b = input.nextFloat();

        if (90>a){
            float TANa = (float) Math.tan(Math.toRadians(a));
            float TANb = (float) Math.tan(Math.toRadians(b));
            float x;
            float y;
            y = h*TANa;
            x = y-(h*TANb);
            System.out.printf("%.1f m", x);

        }
        }

    }

        