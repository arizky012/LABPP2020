import java.util.Scanner;

import javax.swing.text.html.parser.Element;

public class prak4no1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int elemen[] = new int[n];
        int FPB = 0;

        for (int a = 0; a < n; a++) {
            elemen[a] = in.nextInt();
        }
        for (int a = 0; a < n; a++) {
            for (int b = a + 1; b < n; b++) {
                int min = Math.min(elemen[a], elemen[b]);
                for (int c = 1; c <= min; c++) {
                    if ((elemen[a] % c == 0) && (elemen[b] % c == 0)) {
                        FPB = c;
                    }
                }
                if (FPB == 1) {
                    System.out.println(elemen[a] + " " + elemen[b]);
                }
            }
        }
    }
}