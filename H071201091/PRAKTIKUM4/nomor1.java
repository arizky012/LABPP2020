import java.util.*;

/**
 * nomor1
 */
public class nomor1 {
    static Scanner ara = new Scanner (System.in);
    public static void main(String[] args) {
        int n = ara.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < a.length;i++){
            a[i] = ara.nextInt();
        }
        for (int i = 0; i <n-1;i++){
            for (int j = i+1; j<n;i++){
                int A1 = a[i];
                int A2 = a[j];

                while (A1!=A2){
                    if (A1>A2){
                        A1 = A1 -A2;
                    }
                    else {
                        A2 = A2-A1;
                    }
                }
                if (A1==1){
                    System.out.println(a[i]+ " " + a[j]);
                }
            }
        }
    }
}