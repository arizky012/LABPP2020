import java.util.Scanner;
public class P3no2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        for (int i = 1; i <=y; i++) {
            if (i%x==1) {
                System.out.println(" ");
            }
            System.out.print(i + " " );
        }input.close();
    }
}
