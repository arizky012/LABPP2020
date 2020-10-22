import java.util.InputMismatchException;
import java.util.Scanner;
public class tugas2_1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        try{
            int bil1 = x.nextInt();
            int bil2 = x.nextInt();
            int bil3 = x.nextInt();
            int bil4 = x.nextInt();
            int bil5 = x.nextInt();
        
          
            int sum1 =0;
            int sum2 =0;
            int sum3 =0;
            int sum4 =0;
        
     
         if(bil1%2==0 ){
                sum1=sum1+1;
        }if(bil2%2==0 ){
                sum1=sum1+1;
        }if(bil3%2==0 ){
                 sum1=sum1+1;
        }if(bil4%2==0 ){
                 sum1=sum1+1;
        }if(bil5%2==0 ){
                 sum1=sum1+1;
     
            }if(bil1%2==1 ){
                  sum2=sum2+1;
            } if(bil2%2==1 ){
                  sum2=sum2+1;
            }if(bil3%2==1 ){
                  sum2=sum2+1;
            }if(bil4%2==1 ){
                  sum2=sum2+1;
            }if(bil5%2==1 ){
                  sum2=sum2+1;}
              
                if(bil1>0 ){
                      sum3=sum3+1;
                }if(bil2>0  ){
                      sum3=sum3+1;
                }if(bil3>0  ){
                      sum3=sum3+1;
                }if(bil4>0  ){
                      sum3=sum3+1;
                }if(bil5>0  ){
                      sum3=sum3+1;}
     
                    if(bil1<0 ){
                          sum4=sum4+1;
                    }if(bil2<0 ){
                          sum4=sum4+1;
                    }if(bil3<0 ){
                          sum4=sum4+1;
                    }if(bil4<0  ){
                          sum4=sum4+1;
                    }if(bil5<0  ){
                          sum4=sum4+1;}
     
       
         System.out.println("banyaknya bilangan genap = "+sum1);
         System.out.println("banyaknya bilangan ganjil = "+sum2);
         System.out.println("banyaknya bilangan positif = "+sum3);
         System.out.println("banyaknya bilangan negatif= "+sum4);
        
        }
catch(InputMismatchException message_eror) {
        System.out.println(" inputan tidak valid");
}
    }
}
