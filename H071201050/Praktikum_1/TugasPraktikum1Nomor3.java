import java.util.Scanner;
public class TugasPraktikum1Nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float h;
        h = input.nextFloat();
        float a;
        a = input.nextFloat();
        float b;
        b = input.nextFloat();

        if (90 > a){
            if (a > b){
                float TANa;
                TANa = (float) Math.tan(Math.toRadians(a));
                float TANb;
                TANb = (float) Math.tan(Math.toRadians(b));
                float x;
                float y;
                y = h * TANa;                                   // y = Jarak menara dengan kapal
                x = y - (h * TANb);                             // x = panjang kapal
                System.out.printf("%.1f m", x);
            }
            else{
                System.out.println("Error!");
            }
        }
        else{
            System.out.println("Error!");
        }
    }
}