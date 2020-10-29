import java.util.Scanner;

public class TP31 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        if(x <= y){
            for(; x <= y; x++){
                
                if ( x == 0){
                System.out.printf("%d nol\n", x);
                } else if( x % 2 == 1 || x % 2 == -1){
                    if(0 + x > 0){
                        System.out.printf("%d ganjil positif\n", x);
                    } else if(0 + x < 0){
                        System.out.printf("%d ganjil negatif\n", x);
                    }
                } else if( x % 2 == 0){
                    if (0 + x > 0){
                        System.out.printf("%d genap positif\n", x);
                    } else if (0 + x < 0){
                        System.out.printf("%d genap negatif\n", x);
                    }
                }
            }
        } else if(x >= y){
            for(; x >= y; y++){
                
                if ( y == 0){
                System.out.printf("%d nol\n", y);
                } else if( y % 2 == 1 || y % 2 == -1){
                    if(0 + y > 0){
                        System.out.printf("%d ganjil positif\n", y);
                    } else if(0 + y < 0){
                        System.out.printf("%d ganjil negatif\n", y);
                    }
                } else if( y % 2 == 0){
                    if (0 + y > 0){
                        System.out.printf("%d genap positif\n", y);
                    } else if (0 + y < 0){
                        System.out.printf("%d genap negatif\n", y);
                    }
                }
            }
        }
        scan.close();
        
       
    }
}
