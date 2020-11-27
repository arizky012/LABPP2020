import java.util.Scanner;

public class Tugas6nom1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String kata = in.nextLine().toUpperCase();
        System.out.print("#" + hexadecimal(kata) + palindromString(kata) + octal(kata));
        char hexChar = String.valueOf(hexadecimal(kata)).charAt(0);
        char symbol = (hexChar >= 'a' && hexChar <= 'z')? '?':'!';
        System.out.println(symbol);
       
    }
    static String setengahKata(String a) {
        String kataBaru = a.replaceAll("\\s+", "");
        int kataLength = kataBaru.length() / 2;
        kataBaru = kataBaru.substring(0, kataLength);
        return kataBaru;
    }   
     static String hexadecimal(String a) {
        int kataLength = a.length();
        int decimal = kataLength * kataLength;
        String hex = String.format("%x", decimal);
        return hex;
   
    }

    static String palindromString(String a) {
        String kata = setengahKata(a);
        String palindrome = "";
        for (int i = kata.length() - 2; i >= 0; i--) {
            palindrome += kata.charAt(i);
        }
        String kataBaru = kata.concat(palindrome);
        return kataBaru;
    }

  
    static String octal(String a) {
        int kataLength = a.length();
        String oct = String.format("%o", kataLength);
        return oct;
    }

}
