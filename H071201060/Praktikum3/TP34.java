import java.util.Scanner;

public class TP34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hg = scan.nextInt();
        int nu = scan.nextInt();
        int SR = 0, lpr = 0, dpr = 0, Spr = 0, lr = 0, dr = 0, sr = 0;  
        
        if (hg <= nu){
           int k = nu - hg;
            while(k > 0){
            if (k >= 100000){
               k -= 100000;
               SR++;
             } else if(k >= 50000 && k < 100000){
                k -= 50000;
                lpr++;
             } else if(k >= 20000 && k < 50000){
                k -= 20000;
                dpr += 1;
             } else if(k >= 10000 && k < 20000){
                k -= 10000;
                Spr += 1;
             } else if(k >= 5000 && k < 10000){
                k -= 5000;
                lr++;
             } else if(k >= 2000 && k < 5000 ){
                k -= 2000;
                dr++;
             } else{
                k -= 1000;
                sr++;
             }
            
          }
             System.out.println(SR + " uang RP. 100.000");
             System.out.println(lpr + " uang RP. 50.000");
             System.out.println(dpr + " uang RP. 20.000");
             System.out.println(Spr + " uang RP. 10.000");
             System.out.println(lr + " uang RP. 5.000");
             System.out.println(dr + " uang RP. 2.000");
             System.out.println(sr + " uang RP. 1.000");

    
        }
        scan.close();
    }
}
