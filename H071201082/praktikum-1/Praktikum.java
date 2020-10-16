import java.util.Scanner;
public class Praktikum {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int jam = user.nextInt();
        int Kecepatan = user.nextInt();
        float Literbensin = (jam * Kecepatan / 14f);
        System.out.printf("%.3f L", Literbensin);
    }
}
