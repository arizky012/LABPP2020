import java.util.Scanner;
public class TugasPraktikum3Nomor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            while (input.hasNext()){
                float M = input.nextFloat();
                if (0 <= M && M <= 360){
                    float second = M * 240; // 1° = 4 menit = 240 detik
                    float minute;
                    float hour = 6; // 0° = 06:00:00
                    float remainder;
                    hour += (int) second / 3600;
                    remainder = (int)second % 3600;
                    minute = (int)remainder / 60;
                    remainder = (int)remainder % 60;
                    second = (int)remainder;
                    if ((hour >= 4 && hour <= 9) && (minute >= 0 && minute <= 59) && (second >= 0 && second <= 59)){ // Pagi = 04:00:00 - 09:59:59
                        System.out.println("Selamat Pagi");
                    }
                    else if ((hour >= 10 && hour <= 13) && (minute >= 0 && minute <= 59) && (second >= 0 && second <= 59)){ // Siang = 10:00:00 - 13:59:59
                        System.out.println("Selamat Siang");
                    }
                    else if ((hour >= 14 && hour <= 17) && (minute >= 0 && minute <= 59) && (second >= 0 && second <= 59)){ // Sore = 14:00:00 - 17:59:59
                        System.out.println("Selamat Sore");
                    }
                    else if ((hour >= 18 && hour < 24) && (minute >= 0 && minute <= 59) && (second >= 0 && second <= 59)){  // Malam = 18:00:00 - 03:59:59
                        System.out.println("Selamat Malam");
                    }
                    else{
                        if (hour == 24){ // 24:00:00 ---> 00:00:00
                            hour = 00;
                            System.out.println("Selamat Malam");
                        }
                        else{ // >=25:00:00 ---> >=01:00:00
                            float remainingHour = hour - 24; 
                            hour = 00;
                            for (int i = 1; i <= remainingHour; i++){
                                hour += 1;
                            }
                            if (hour < 4) {
                                System.out.println("Selamat Malam");
                            }
                            else{
                                System.out.println("Selamat Pagi");
                            }
                        }
                    }
                    System.out.printf("%02.0f:%02.0f:%02.0f\n", hour, minute, second);
                }
                else{
                    System.out.println("Inputan Tidak Valid!");
                    break;
                }
            }
        }
        catch (Exception e){
            System.out.println("Inputan Tidak Valid!");
        }
        input.close();
    }
}
