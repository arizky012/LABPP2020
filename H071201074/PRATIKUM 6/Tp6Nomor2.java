import java.util.Scanner;
public class Tp6Nomor2{
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String kalimat_awal = input.nextLine();
		String kalimat = new String();
		for (int i=0; i<kalimat_awal.length(); i++) {
		
			if (i%2 == 0) {
		  	kalimat += kalimat_awal.charAt(i);
			} else {
			  kalimat += kalimat_awal.codePointAt(i);
			}
		}
		
	int banyak = (int) Math.ceil((double)kalimat.length()/16);
	   String[] kata = new String[16];
	   int index = 0;
		for (int i=0; i<16; i++) {
			for (int j=0; j<banyak; j++) {
				if (index < kalimat.length()) {
					kata [i] += kalimat.charAt(index);
				
				} else {
				  kata [i] += "?";
				}
				index++;
			}
		}
		 for (int i=0; i<16; i++){
			System.out.print(kata[i]+ " ");
			if ((i+1)%4 == 0) {
			  System.out.print("\n");
			}
		}

	}

}
