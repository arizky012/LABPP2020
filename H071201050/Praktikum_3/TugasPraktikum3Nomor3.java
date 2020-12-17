import java.util.Scanner;
public class TugasPraktikum3Nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            int n = input.nextInt();
            int a = 0;
            int b = 1;
            System.out.print(a + " ");
            System.out.print(b + " ");
            for (int i = 2; i < n; i++){
                int nextNum = a + b;
                System.out.print(nextNum + " ");
                a = b;
                b = nextNum;
            }
        }
        catch (Exception e){
            System.out.println("Inputan Tidak Valid!");
        }
        input.close();
    }
}
