import java.util.Scanner;
class P6no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kata = input.nextLine();
         String reverse = "";
        String kata2 = kata.replaceAll(" ", "");
        String kata3 = kata2.toUpperCase();
        int x = kata3.length();
        int y = x/2;
        
        String half = kata3.substring(0, y);
        for(int i = half.length() -2; i >=0; i--){
        reverse = reverse + half.charAt(i);}
        String hex = Integer.toHexString(kata.length()*kata.length());
        char hexChar = String.valueOf(hex).charAt(0);
        String oct = Integer.toOctalString(kata.length());
        if (hexChar >= 'a' && hexChar <= 'z') {
        System.out.println("#"+hex+half+reverse+oct+"?"); 
        }
        else {
        System.out.println("#"+hex+half+reverse+oct+"!");
        }
    }
}