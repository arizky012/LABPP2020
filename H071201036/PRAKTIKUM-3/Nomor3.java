import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();

            int a = 0;
            int b = 1;
            System.out.print(a + " " + b);

            for (int i = 2; i < n; i++) {
                int next = a + b;
                System.out.print(" " + next);
                a = b;
                b = next;
            }
        input.close();
        } catch (Exception e) {
            System.out.print("Data harus bilangan bulat");
        }
    }
}
