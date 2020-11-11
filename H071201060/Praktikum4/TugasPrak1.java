import java.util.Scanner;

public class TugasPrak1{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] angka = new int[N];
        int fpb = 0;

        for(int i = 0; i < angka.length; i++){
            angka[i] = input.nextInt();
        }

        for(int i = 0; i < N; i++){
            for(int j = i; j < N; j++ ){
                int min = Math.min(angka[i], angka[j]);
                for(int k = 1; k <= min; k++){
                if((angka[i] % k == 0) && (angka[j] % k == 0)){
                    fpb = k;
                }
            }
            if(fpb == 1){
                System.out.printf("%d %d\n", angka[i],angka[j]);
            }
            }
        }
        input.close();
    } 
}