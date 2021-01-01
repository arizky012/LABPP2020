import java.util.Scanner;
public class Tp6Nomor1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        
        
        int hexa = x.length()*x.length();
        String hexadecimal = String.format("%x",hexa);
        int oct = x.length();
        String octal = String.format("%o",oct);

        String pal="";
        String pal2="";
        String kata2="";
        
        int kata  = x.length()/2;

        String cerah  = x.substring(0, (x.length()/2)-1);{
        pal = cerah.toUpperCase();
         
        for (int i=kata-1; i>=0; i--){
            kata2=kata2 + x.charAt(i);
            pal2= kata2.toUpperCase();
            
        }
       
           char simbol='!';
           if(hexadecimal.codePointAt(0)>57){
               simbol ='?';
           }
        
        System.out.printf("#"+hexadecimal+pal.replaceAll("\\s","")+pal2.replaceAll("\\s","")+octal+simbol);
      
        
      }
    }
}

    
      


    


