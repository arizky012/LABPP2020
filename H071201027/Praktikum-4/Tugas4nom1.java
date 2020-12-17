import java.util.Scanner;

public class Tugas4nom1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int [] N= new int[n];
         int count;
         
        for (int i = 0; i < n; i++) {
            N [i]= in.nextInt();
        }
           
        for (int i = 0; i<n; i++) {
            for (int j =i+1; j < n; j++) {
                count= 0;
            for (int k = 1; k <= Math.min(N[i],N[j]); k++) {
                    if((N[i]%k == 0) && (N[j]%k ==0))
                    count ++;
                    }
                    
                    if( count ==1)
                    System.out.println(N[i]+ " "+N[j]);  
        }
        
    }
    
    
    }
}
