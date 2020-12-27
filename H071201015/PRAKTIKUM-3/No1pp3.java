import java.util.Scanner;

public class No1pp3 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.println("Input x dan y");
        int x = value.nextInt();
        int y = value.nextInt();

        if (x == y) {
          System.out.println("Invalid!");
          System.exit(-1);
        }
        else if (x < y){
            if (x % 2 == 0) {
              System.out.println(x + " genap negatif");
            }
            else {
              System.out.println(x + " ganjil negatif");
            }
        }
        else {
            int temp = x;
            x = y;
            y = temp;

            if (x % 2 == 0) {
              System.out.println(x + " genap negatif");
            }
            else {
              System.out.println(x + " ganjil negatif");
            }
        }

        while (x < y) {
            x = x + 1;

            if (x > 0) {
                if (x % 2 == 0) {
                  System.out.println(x + " genap positif");
                }
                else {
                  System.out.println(x + " ganjil positif");
                }
            }
            else if(x < 0) {
                if (x % 2 == 0) {
                  System.out.println(x + " genap negatif");
                }
                else {
                  System.out.println(x + " ganjil positif");
                }
            }
            else {
              System.out.println("0 nol");
            }
        }
        value.close();
    }
}
