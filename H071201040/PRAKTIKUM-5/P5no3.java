import java.util.Scanner;
public class P5no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usia = input.nextInt();
        System.out.println(myDay(usia));
    }
    public static String myDay(int usia) {
        int year = usia/365;
        int month = (usia-year*365)/30;
        int day = usia-(year*365)-(month*30);
        String str = year+" tahun\n"+month+" bulan\n"+day+" hari";
		return str;
    }
}
