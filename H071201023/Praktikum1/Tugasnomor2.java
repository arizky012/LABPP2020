import java.util.Scanner;
public class Tugasnomor2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Detik");
        int detik = input .nextInt();
        int hour;
        hour = detik/3600;
        int minute;
        minute = (detik/60) - (hour*60);
        int second;
        second = detik - (minute*60) - (hour*3600);
        System.out.printf("%02d:%02d:%02d", hour, minute, second);
    }
}
