import java.util.Scanner;
public class Soal1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inpt = scan.nextLine();
        
        
        int hexa = inpt.length()*izza.length();
        String hexadecimal = String.format("%x",hexa);
        int oct = inpt.length();
        String octal = String.format("%o",oct);

        String pal="";
        String pal2="";
        String kata2="";
        
        int kata  = inpt.length()/2;

        String cerah  = inpt.substring(0, (inpt.length()/2)-1);{
        pal = cerah.toUpperCase();
         
        for (int i=kata-1; i>=0; i--){
            kata2=kata2 + inpt.charAt(i);
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

    
      


    


