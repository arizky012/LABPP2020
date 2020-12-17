import java.util.Scanner;
import java.util.Random;

class PotonganPrograman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        String serialNumber = generateSerial(n,m);
        System.out.println(serialNumber);
        input.close();
        
    }
  public static String generateSerial (int n, int m){
        Random rand = new Random();
        String str = "";
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    int random = rand.nextInt(10);
                        String k = Integer.toString(random);
                        str += k;
                }
                if(i + 1 < n){
                    String l = "-";
                    str += l;
                }
            }
            return str;
        }
    
}

