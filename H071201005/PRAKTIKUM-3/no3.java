import java.util.Scanner;

public class no3 {
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(System.in);
            int n, a = 0, b = 1, next;
            n = input.nextInt();
            System.out.print(a + " " + b);
            for(int count = 2; count<n; count++){
                next = a+b;
                System.out.print(" " + next);
                a = b;
                b = next;
            }
        }
        catch(Exception e){
            System.out.println("data harus bilangan bulat");
        }
    }
}
