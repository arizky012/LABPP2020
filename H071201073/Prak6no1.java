import java.util.Scanner;

class Prak6no1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kata = in.nextLine();
        int jumlah = kata.length();

        int dec = kata.length() * kata.length();
        String hexa = String.format("%x", dec);
        String octal = String.format("%o", jumlah);

        // pembagian kalimat
        kata = kata.replace(" ", "");
        int kalimat1 = kata.length() / 2;
        String kata1 = kata.replaceAll("\\s+", "");
        String result = "";
        for (int i = 0; i < kalimat1 - 1; i++) {
            result += kata1.charAt(i);
        }

        // palindrome
        String kata2 = kata.replaceAll("\\s+", "");
        int tanpaSpasi = kata2.length() / 2;
        String result1 = "";
        for (int i = (tanpaSpasi - 1); i >= 0; i--) {
            result1 += kata2.charAt(i);
        }

        char simbol = ' ';
        if (Character.isDigit(hexa.charAt(0))) {
            simbol = '!';
        } else {
            simbol = '?';

        }
        System.out.print("#" + hexa + result.toUpperCase() + result1.toUpperCase() + octal + simbol);
    }
}
