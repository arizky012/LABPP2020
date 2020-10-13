public class SoalPraktikum2 {
    public static void main(String[] args) {

        int detik0 = 140153;
        int jam1, menit1, detik1, sisa1;
        
            sisa1 = detik0 % 3600;
            jam1 = detik0 / 3600;
            menit1 = sisa1 / 60;
            detik1 = (detik0 - (jam1 * 3600 + menit1 * 60));

        System.out.printf("%02d : %02d : %02d \n", jam1, menit1, detik1);
    }
}
