import java.util.*;

/**
 * nomor1
 */
public class nomor1 {
    static Scanner ara = new Scanner (System.in);
    public static void main(String[] args) {
        
        try {
            int a = ara.nextInt();
            int b = ara.nextInt();
            int c = ara.nextInt();
            int d = ara.nextInt();
            int f = ara.nextInt();

            int o = 0;
            int p = 0;
            int q = 0;
            int r = 0;

            if (a<0){
                q += 1;
            } else if (a>0){
                r += 1;
            }
            if ((a%2)==0){
                o += 1;
            } else if ((a%2)!=0){
                p += 1;
            }
            
            if (b<0){
                q += 1;
            } else if (b>0){
                r += 1;
            }
            if ((b%2)==0){
                o += 1;
            } else if ((b%2)!=0){
                p += 1;
            }
            
            if (c<0){
                q += 1;
            } else if (c>0){
                r += 1;
            }
            if ((c%2)==0){
                o += 1;
            } else if ((c%2)!=0){
                p += 1;
            }
            
            if (d<0){
                q += 1;
            } else if (d>0){
                r += 1;
            } 
            if ((d%2)==0){
                o +=1;
            } else if ((d%2)!=0){
                p += 1;
            }
            
            if (f<0){
                q += 1;
            } else if (f>0){
                r += 1;
            }
            if ((f%2)==0){
                o += 1;
            } else if ((f%2)!=0){
                p += 1;
            }
            
            System.out.println(o + " angka genap");
            System.out.println(p + " angka ganjil");
            System.out.println(r + " angka positif");
            System.out.println(q + " angka negatif");
            
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }
}