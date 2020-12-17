import java.util.Scanner;
public class TugasPraktikum3Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try{
            int x = input.nextInt();
            int y = input.nextInt();
            int a = 0, b = 0;
            if (x < y){
                a = x;
                b = y;
            }
            else{
                a = y;
                b = x;
            }
            for (int i = a; i <= b; i++){
                if (i < 0){
                    if (i % 2 == 0){
                        System.out.printf("%d genap negatif\n", i);
                    }
                    else{
                        System.out.printf("%d ganjil negatif\n", i);
                    }
                }
                else if (i == 0){
                    System.out.printf("%d nol\n", i);
                }
                else{
                    if (i % 2 == 0){
                        System.out.printf("%d genap positif\n", i);
                    }
                    else{
                        System.out.printf("%d ganjil positif\n", i);
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println("Inputan Tidak Valid!");
        }
        input.close();
    }
}
