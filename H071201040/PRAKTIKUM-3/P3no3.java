import java.util.Scanner;

public class P3no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int a1 = 0;
        int a2 = 1;
        int next;
        if (a == 1) {
            System.out.println(a1);
        } else if (a == 2) {
            System.out.println(a1 + " " + a2);
        } else {
            System.out.print(a1 + " " + a2);
            for (int count = 2; count < a; count++) {
                next = a1 + a2;
                System.out.print(" " + next);
                a1 = a2;
                a2 = next;
            }
        }
        input.close();
    }
}
