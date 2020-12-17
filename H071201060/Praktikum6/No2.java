import java.util.Scanner;

public class No2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] arr = new String[4][4];
        String kalimat = scan.nextLine();
        char[] kata = kalimat.toCharArray();
        int count = 0;
        String newKalimat = "";
        int karakter = 0;
        while((8 * karakter) < kalimat.length()){
            karakter++;
        }

        if(kalimat.length() >= 16){
        for(int i = 0; i < kalimat.length(); i++){
                if(i % 2 == 0){
                    // System.out.print(kata[i]);
                    newKalimat += kata[i];
                } else{
                    // System.out.print(Character.codePointAt(kalimat, i));
                    newKalimat += Character.codePointAt(kalimat, i);
                }
        }
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = "";
                for(int k = 0; k < karakter; k++){
                    if (count < newKalimat.length()){
                        arr[i][j] += newKalimat.charAt(count);
                    } else {arr[i][j] += '?';}
                    count++;
                }
            }
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    } scan.close();
            
        }
        
    } 

