import java.util.Scanner;

public class TP35 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        float n = 0;
        float jam, menit, detik, sisa, m;

        

        while(cs.hasNext()){
            if (n == 0 ){
                detik = 21600;
                m = cs.nextFloat();
                if ( 0 <= m && m < 360){
                    jam = m / 15;
                    detik = jam * 3600 + detik;
                    jam = detik / 3600;
                    sisa = detik % 3600;
                    menit = sisa / 60;
                    detik = sisa % 60;
                    
                    if (m >= 0 && m < 90){
                        System.out.println("Selamat pagi");
                    System.out.printf("%02.0f : %02.0f : %02.0f \n", Math.floor(jam), Math.floor(menit), Math.floor(detik));
                    m = 0;}
                    else if (m >= 90 && m < 135){
                        System.out.println("Selamat siang");
                    System.out.printf("%02.0f : %02.0f : %02.0f \n", Math.floor(jam), Math.floor(menit), Math.floor(detik));
                    m = 0;}
                    else if (m >= 135 && m < 180){
                        System.out.println("Selamat sore");
                    System.out.printf("%02.0f : %02.0f : %02.0f \n", Math.floor(jam), Math.floor(menit), Math.floor(detik));
                    m = 0;}
                    else if (m >= 180 && m < 270 ){
                        System.out.println("Selamat malam");
                    System.out.printf("%02.0f : %02.0f : %02.0f \n", Math.floor(jam), Math.floor(menit), Math.floor(detik));
                    m = 0;}
                    else {
                        jam = jam - 24;
                    System.out.printf("%02.0f : %02.0f : %02.0f \n", Math.floor(jam), Math.floor(menit), Math.floor(detik));
                    m = 0;}
                    



                } else {
                     cs.close();
                    System.out.println("End of file");
                    return;
                }
            } else {
                System.out.println("end of file");
            }
        }
       
    }

    
    
}
