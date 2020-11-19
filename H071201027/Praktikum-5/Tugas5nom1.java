import java.util.Scanner;

class Tugas5nom1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int hasilFPB= cariFPB(a, b);
		System.out.printf("FPB dari %d dan %d = %d", a, b, hasilFPB);
	}

	static int cariFPB(int a, int b) {
		int count = 0;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) 
				count = i;
		}
		return count;
	}
}