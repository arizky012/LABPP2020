import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int x = inputUser.nextInt();
        int y = inputUser.nextInt();

        for (int i = 1; i <= y; i++) {
            if (i % x == 0) {
                System.out.println(i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
        inputUser.close();
    }
}