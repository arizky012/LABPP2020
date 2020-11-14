import java.util.Scanner;
public class Nomor1 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int a = inputan.nextInt();
        System.out.println("masukkan nilai X");
        int b = inputan.nextInt();
        System.out.println("masukkan nilai Y");
        inputan.close();
        
        int x = Math.min(a, b);
        int y = Math.max(a, b);


        while (x <= y) {
            System.out.print(x+ " ");
            if (x%2 == 0 && x != 0) {
                System.out.printf("genap ");

            } else if (x%2 != 0) {
                System.out.print("ganjil ");

            } else System.out.print("nol\n");

            if (x > 0) {  
                System.out.print("positif\n");
            } else
            if (x < 0) {  
                System.out.print("negatif\n");
            }
            x++;

        }
    
}

}
