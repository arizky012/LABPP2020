import java.util.Scanner;

class Tugas5nom3{
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		int hari = In.nextInt();
		myDay(hari);
		
	}

	static void myDay(int x) {
		int tahun = x / 365;
		int bulan = (x % 365) / 30;
		int hari = (x % 365) % 30;
		System.out.printf("%d tahun\n%d bulan\n%d hari", tahun, bulan, hari);
	}
}