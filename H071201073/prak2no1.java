
import java.util.Scanner;
import java.util.InputMismatchException;

public class prak2no1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int e = in.nextInt();

            int genap = 0;
            int ganjil = 0;
            int positif = 0;
            int negatif = 0;

            if (a % 2 == 0) {
                genap += 1;
                if (a >= 0 && a != 0) {
                    positif += 1;
                } else if (a < 0 && a != 0) {
                    negatif += 1;
                }
            } else {
                ganjil += 1;
                if (a >= 0 && a != 0) {
                    positif += 1;
                } else if (a < 0 && a != 0) {
                    negatif += 1;
                }
            }
            if (b % 2 == 0) {
                genap += 1;
                if (b >= 0 && b != 0) {
                    positif += 1;
                } else if (b < 0 && b != 0) {
                    negatif += 1;
                }
            } else {
                ganjil += 1;
                if (b >= 0 && b != 0) {
                    positif += 1;
                } else if (b < 0 && b != 0) {
                    negatif += 1;
                }
            }
            if (c % 2 == 0) {
                genap += 1;
                if (c >= 0 && c != 0) {
                    positif += 1;
                } else if (c < 0 && c != 0) {
                    negatif += 1;
                }
            } else {
                ganjil += 1;
                if (c >= 0 && c != 0) {
                    positif += 1;
                } else if (c < 0 && c != 0) {
                    negatif += 1;
                }
            }
            if (d % 2 == 0) {
                genap += 1;
                if (d >= 0 && d != 0) {
                    positif += 1;
                } else if (d < 0 && d != 0) {
                    negatif += 1;
                }
            } else {
                ganjil += 1;
                if (d >= 0 && d != 0) {
                    positif += 1;
                } else if (d < 0 && d != 0) {
                    negatif += 1;
                }
            }
            if (e % 2 == 0) {
                genap += 1;
                if (e >= 0 && e != 0) {
                    positif += 1;
                } else if (e < 0 && e != 0) {
                    negatif += 1;
                }
            } else {
                ganjil += 1;
                if (e >= 0 && e != 0) {
                    positif += 1;
                } else if (e < 0 && e != 0) {
                    negatif += 1;
                }

            }
            System.out.println(genap + "  bilangan genap");
            System.out.println(ganjil + "  bilangan ganjil");
            System.out.println(positif + "  bilangan positif");
            System.out.println(negatif + "  bilangan negatif");

        } catch (InputMismatchException angka) {
            System.out.print("Inputan Tidak Valid ");
        }
    }
}
