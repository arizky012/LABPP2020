import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan x :");
        int x = input.nextInt();
        System.out.print("Masukkan y :");
        int y = input.nextInt();

        for (int i = 1; i <= y; i++) {
            if (x < y) {
                if (i % x == 0) {
                    System.out.println(i + " ");
                } else {
                    System.out.print(i + " ");
                }
            }else{
                break;
            }
        }
    }
}
