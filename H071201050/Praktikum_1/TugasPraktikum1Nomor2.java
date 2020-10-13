import java.util.Scanner;
public class TugasPraktikum1Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Cara 1
        int second;
        second = input.nextInt();
        int minute;
        int hour;
        hour = second / (60 * 60);
        second = second - ((60 * 60) * hour);
        minute = second / 60;
        second = second - (60 * minute);
        System.out.printf("%02d:%02d:%02d%n", hour, minute, second);

        // Cara 2
        /*
        int second;
        second = input.nextInt();
        int minute;
        int hour;
        int remainder;
        hour = second / 3600;
        remainder = second % 3600;
        minute = remainder / 60;
        remainder = remainder % 60;
        second = remainder;
        System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
        */
    }
}