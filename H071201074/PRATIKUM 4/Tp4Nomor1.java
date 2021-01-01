import java.util.Scanner;
class Tp4Nomor1{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] x = new int[num];
        int faktor = 0;

        for (int i = 0; i < num; i++){
            x[i] = scan.nextInt();
        }

        for (int i = 0; i < num; i++){
            for (int j = i + 1; j < num; j++){
                int min = Math.min(x[i], x[j]);
                for (int k = 1; k <= min; k++){
                    if ((x[i] % k == 0) && (x[j] % k == 0)){
                        faktor = k;
                    }
                }

                if (faktor == 1){
                    System.out.println(x[i]+ " " + x[j]);
                }
            }
        }
    }
}