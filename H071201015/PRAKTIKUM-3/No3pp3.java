import java.util.Scanner;

public class No3pp3 {

    public static void main(String[] args) {
	Scanner value = new Scanner (System.in);

  System.out.println("Input angka : ");
	   int n = value.nextInt();
	   int a = 0;
	   int b = 1;
		 int next ;
		 int count = 2;
		System.out.print(a + " ");
		System.out.print(b + " ");

		for (int i = 0; count < n; i++){
			next = a + b;
			System.out.print(next + " ");
			a = b;
			b = next;
			count = count + 1;
		}
    value.close();
	}
}
