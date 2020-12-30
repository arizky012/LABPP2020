import java.util.Scanner;

// Praktikum 6 no 1
public class Kata{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word, newWord, hexadecimal, octal;
        String palindrom = new String();
        char symbol ;
        int numberOfWord, hexa, oct;
        // Membuat String lalu di manipulasi menjadi huruf kapital
        word = input.nextLine().toUpperCase();

        // Buat kata baru dari kata tanpa spasi
        newWord = word.replaceAll("\\s ", "");

        numberOfWord = newWord.length()/2;

        // Konversi ke hexadecimal dari kalimat awal
        hexa = word.length() * word.length();
        hexadecimal = String.format("%x", hexa);
        

        // memanipulasi kata baru tadi menjadi kata palindrom
        newWord = newWord.substring(0, (word.length()/2)-1);
        for (int i = numberOfWord - 1 ; i >= 0 ; --i){
            palindrom = palindrom + word.charAt(i);
        }

        // Konversi ke octal dari kalimat awal
        oct = word.length();
        octal = String.format("%o", oct);
    
        // Simbol bila karakter awal hexa = huruf maka "!" jika karakter awal hexa = angka "?"
        if (Character.isLetter(hexadecimal.charAt(0))){
            symbol = '?';
        }else {
            symbol = '!';
        }
        System.out.printf("#"+hexadecimal + newWord.replaceAll("\\s", "") + palindrom.replaceAll("\\s", "")+ octal +symbol);
        

    }
}