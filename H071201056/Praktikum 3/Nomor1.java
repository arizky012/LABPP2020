import java.util.Scanner;
public class Nomor1 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int x = inputan.nextInt();
        System.out.println("masukkan nilai X");
        int y = inputan.nextInt();
        System.out.println("masukkan nilai Y");
        inputan.close();
        int i, j;
       

        while (i <= j) {
            System.out.print(i+ " ");
            if (i%2 == 0 && i != 0) {
                System.out.printf("genap ");

            } else if (i%2 != 0) {
                System.out.print("ganjil ");

            } else System.out.print("nol\n");

            if (i > 0) {  
                System.out.print("positif\n");
            } else
            if (i < 0) {  
                System.out.print("negatif\n");
            }
            i++;

        }
    
}

}
