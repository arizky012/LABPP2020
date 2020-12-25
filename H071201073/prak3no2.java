import java.util.Scanner;
public class prak3no2 {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        if (x < y )
        for (int i = 1; i <= y; i++) {
            if (i % x == 0) {
                System.out.println(i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
        in.close();
}
}
