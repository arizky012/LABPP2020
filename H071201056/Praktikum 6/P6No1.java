import java.util.Scanner;
public class P6No1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String izza = scan.nextLine();
        
        
        int hexa = izza.length()*izza.length();
        String hexadecimal = String.format("%x",hexa);
        int oct = izza.length();
        String octal = String.format("%o",oct);

        String pal="";
        String pal2="";
        String kata2="";
        
        int kata  = izza.length()/2;

        String cerah  = izza.substring(0, (izza.length()/2)-1);{
        pal = cerah.toUpperCase();
         
        for (int i=kata-1; i>=0; i--){
            kata2=kata2 + izza.charAt(i);
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

    
      


    


