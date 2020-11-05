import java.util.Scanner;
class Nomor5{
    public static void main(String[] arg) {
        Scanner ex = new Scanner(System.in);
        int sec, mm,hh ,ss ;
        try{
            while(ex.hasNext()){
                float m = ex.nextFloat();
                if (0 <= m && m < 360){
                    sec = (int)(m*86400)/360;
                    hh = (sec/3600)+6;
                    mm = (sec%3600)/60;
                    ss = (sec%3600)%60;
                    if (m >= 0 && m < 90){
                        System.out.println("Selamat Pagi");
                    } else if (m >= 90 && m < 150){
                        System.out.println("Selamat Siang");
                    } else if (m >= 150 && m < 195){
                        System.out.println("Selamat Sore");
                    } else if (m >= 195 && m < 270){
                        System.out.println("Selamat Malam");
                    } else if (m >= 270 && m < 360){
                        System.out.println("Dini hari");
                    }
                    System.out.printf("%02d:%02d:%02d", hh,mm,ss);
                }else{
                    System.out.println("Inputan harus lebih dari 0 dan kurang dari");
                    ex.close();
                }
            }
        }catch(Exception e){
            System.out.println("end of file");
        }

    }
}
