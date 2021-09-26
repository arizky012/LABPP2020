import java.util.Scanner;
public class prak3no3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        
        int elemenA = 0;
        System.out.println(elemenA + "  ");
        int elemenB =1;
        System.out.println(elemenB + "  ");

        for (int i = 2; i < n; i++){
            int nextNilai = elemenA + elemenB;
            System.out.println(nextNilai + "  ");
            elemenA = elemenB;
            elemenB = nextNilai;
        }
        in.close();
    }
}
