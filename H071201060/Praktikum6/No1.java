import java.util.Scanner;

public class No1{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
    
    String kalimat = scan.nextLine();
    int angka = kalimat.length();
    String heks = String.format("%x", angka*angka);
    String oct = String.format("%o", angka);
    // System.out.println(oct + " " + heks);
    String gabung = kalimat.replaceAll(" ", "");
    // System.out.println(gabung);
    char[] gab = gabung.toCharArray();
    String newKal = "";
    for(int i = gab.length/2 - 2; i >= 0; i--){
        newKal += gab[i];
        newKal.toUpperCase();
    }
    String kal = "";
    for(int i = 0; i < gab.length/2;i++){
        kal += gab[i];
    }
    
    String palindrom = kal.concat(newKal);
    if(heks.charAt(0) >= '1' && heks.charAt(0) <= '9'){

        System.out.println("#" + heks + "" + palindrom.toUpperCase() + "" + oct + "!");
    } else{System.out.println("#" + heks + "" + palindrom.toUpperCase() + "" + oct + "?");}
    scan.close();
    }
}
