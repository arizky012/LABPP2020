//Nilam Magfira Az-zahra - H071201036

import java.util.Scanner;

public class Tugas1no1 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Nilai K dan N = ");
        float K = x.nextFloat();
        float N = x.nextFloat();

        float PK = ((K / N) * 100);

        System.out.printf("Persentase = %.2f%%", PK);
    }
}
