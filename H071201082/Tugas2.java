import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int x = user.nextInt();
        int y = user.nextInt();

        for (int i = 1; i <= y; i++){
            if (i%x == 0){
                System.out.println(i+ " ");
            }else {
                System.out.print(i+ " ");
            }
        }
    }
}
