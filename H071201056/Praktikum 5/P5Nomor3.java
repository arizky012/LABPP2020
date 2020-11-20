import java.util.Scanner;
public class P5Nomor3 {
    public static void main(String[] args){
        Scanner method = new Scanner(System.in);
        int u=method.nextInt();
        String Usia = myDay(u) ;
        System.out.println(Usia);

        } 
        static String  myDay(int a){
              
            int x= a/365;
            int y= ((a%365)/30);
            int z=((a%365)%30);
            String hasil=(x  + " Tahun \n" + y + " Bulan\n" + z + " Hari\n");
            return hasil;

        }  
        
                
        

        
       
}

