import java.util.Scanner;

public class no5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float m;
        while (input.hasNext()) {
            m = input.nextFloat();
            if(m>=0 && m <360){
                int jam = 0, menit = 0, detik = 0;
                int dSementara = (int) (m * 240);
                jam = dSementara/3600;
                menit = dSementara%3600/60;
                detik = dSementara%60;
                jam += 6;

                if(jam>=24)
                    jam -= 24;
                
                if(jam<11){
                    System.out.println("selamat pagi!");
                    System.out.printf("%02d : %02d : %02d\n",jam,menit,detik);
                }
                else if(jam<15){
                    System.out.println("selamat siang!");
                    System.out.printf("%02d : %02d : %02d\n",jam,menit,detik);
                }
                else if(jam<7){
                    System.out.println("selamat sore!");
                    System.out.printf("%02d : %02d : %02d\n",jam,menit,detik);
                }
                else{
                    System.out.println("selamat malam!");
                    System.out.printf("%02d : %02d : %02d\n",jam,menit,detik);
                }
            }
            else
                System.out.println("masukkan nilai 0<=m<360 !");
        }

    }
}
