import java.util.Scanner;
public class TugasPraktikum1Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Time;
        Time = input.nextInt();
        int Velocity; 
        Velocity = input.nextInt();
        float Bensin = (Time * Velocity) / 14.0f;
        System.out.printf("Bensin Yang Digunakan : " + "%.3f L", Bensin);
    }
}