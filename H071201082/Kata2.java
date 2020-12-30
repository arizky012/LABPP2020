import java.util.Scanner;
// Praktikum 6 No 2
class Kata2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        
        String newSentence = new String();
        for (int i = 0; i < sentence.length(); ++i) {
            if (i % 2 == 0) {
               newSentence += sentence.charAt(i);
            } else {  
                newSentence += Character.codePointAt(sentence, i);
            }
        } 
        
        int length = newSentence.length();
        double amount = (double) Math.ceil(length / 16.0);

        int j = 0;
        for (int i = 0; i < 16; ++i) {
            for (int k = 0; k < amount ; ++k) {
                if (j < length) {
                    System.out.print(newSentence.charAt(j));
                    j++;
                } else {
                    System.out.print("?");
                }
            }

            if (i % 4 == 3) {
                System.out.println();
            } else{
                System.out.print(' ');
            }
            
        }
    }
}