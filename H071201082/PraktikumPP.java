import java.util.Scanner;

// No 1 Praktikum 4

public class PraktikumPP {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Input Angka ");
        int n = user.nextInt();
        int[] w = new int [n];
        int fpb = 0;

        for (int i = 0 ; i < n ; i++){
            w[i] = user.nextInt();
        }
        System.out.println("Relatif Prima :");
        for (int i = 0 ; i < n ; ++i) {
            for (int j = i + 1 ; j < n ; ++j){
                int min = Math.min(w[i], w[j]);
                    for (int k = 1 ; k <= min ; ++k){
                        if ((w[i] % k == 0) && (w[j] % k == 0)){
                            fpb = k;

                        }
                    }
                    if (fpb == 1) {
                        System.out.println(w[i] + " " + w[j]);
                    }
            }
        }
        
        user.close();
    }
}
