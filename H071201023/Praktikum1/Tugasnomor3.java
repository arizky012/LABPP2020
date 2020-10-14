import java.util.Scanner;
public class Tugasnomor3{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // ketinggian menara
        float h = input.nextFloat();
        // sudut elevasi ujung belakang kapal
        float a = input.nextFloat();
        a = (float) Math.tan(Math.toRadians(a));
        // sudut elevasi ujung depan kapal
        float b = input.nextFloat();
        b = (float) Math.tan(Math.toRadians(b));

        if (90 > a && a > b){
            float x = (a * h) - (b * h);
            System.out.printf("Panjang Kapal Adalah : %.1f m", x);
        } else {
            System.out.printf("Errorr..");
        }

    }

}


