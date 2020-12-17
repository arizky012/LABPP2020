import java.util.Scanner;

public class Tugas6nom2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kata = in.nextLine();
        String[][] array = new String[4][4];

        if (kata.length() >= 16) {
            kata = charCodePointAt(kata);
            int count = 0;
            int character = charArray(kata);
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    array[i][j] = "";
                    for (int k = 0; k < character; k++) {
                        if (count < kata.length()) {
                            array[i][j] += kata.charAt(count);
                        } else {
                            array[i][j] += '?';
                        }
                        count++;
                    }
                }
            }
           
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    static String charCodePointAt(String a) {
        int hurufGanjil;
        char hurufGenap;
        String kataBaru = "";
        for (int i = 0; i < a.length(); i++) {
            if (i % 2 != 0) {
                hurufGanjil = Character.codePointAt(a, i);
                kataBaru += hurufGanjil;
            } else {
                hurufGenap = a.charAt(i);
                kataBaru += hurufGenap;
            }
        }
        return kataBaru;
    }

    static int charArray(String a) {
        int character = 0;
        while ((16 * character) < a.length()) {
            character++;
        }
        return character;
    }

}
