import java.util.Scanner;
public class Nomor1 {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in); 
		int n = read.nextInt();
		int elemen [] = new int[n];


		for(int i = 0; i < n; i++){
			elemen[i] = read.nextInt();
		}
		for(int i = 0; i < n - 1; i++){
			for(int j = i + 1; j < n; j++){
			    int angka1 = elemen[i];
			    int angka2 = elemen[j];

			    while(angka1 != angka2){
			        if(angka1 > angka2){
			        angka1 = angka1 - angka2;
			        }
			        else{
			        angka2 = angka2 - angka1;
			        }	
			    }
			    if(angka1 == 1){
			    System.out.println(elemen[i] + " " + elemen[j]);
	    	    }
			}
		}
	}
} 
