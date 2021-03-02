import java.util.Scanner;

public class Nomor05 {
    static Scanner ara = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\n*TUGAS PRAKTIKUM 3*\nNOMOR 3");
        System.out.println("\nNama: Ufairah Damara Bashir \nNIM: H07120191 \njurusan: ILMU KOMPUTER B");

        System.out.println("\nPesan:");
        System.out.println("- 1 hari = 360 derajat");
        System.out.println("- Mencetak nilain n (derajat) ke bentuk satuan jam HH:MM:SS");
        System.out.println("- Nilai 0 derajat = 6:00:00");
        System.out.println("Input: \n- 1 bilangan float n (0<=n<=360) yang menunjukkan posisi matahari atau bulan.\n  imputan akan berhenti dengan end of life");
        System.out.println("Output: \n- Mencetak selamat pagi, siang, sore atau malam berdasarkan waktu yang diikuti waktu aslinya");
        System.out.println("\nSilahkan input. \ninputan tak berakhir. \ninputan langsung menghasilkan output\n\n");
        try {
            while (ara.hasNext()) {

                
                float sudut = ara.nextFloat();
                int jam = 0, menit = 0, detik = 0;
                int a = (int) (sudut * 240);
    
                if (sudut >= 0 && sudut < 360) {
                    while (a > 0) {
                        if (a - 3600 >= 0) {
                            a -= 3600;
                            jam++;
                        } else if (a - 60 >= 0) {
                            a -= 60;
                            menit++;
                        } else {
                            a -= 1;
                            detik++;
                        }
                    }
                    jam += 6;
    
                    if (jam >= 24)
                        jam -= 24;

                    if (jam <= 10) {
                        System.out.println("selamat pagi");
                        System.out.printf("%02d:%02d:%02d\n\n", jam, menit, detik);
                    } else if (jam <= 14) {
                        System.out.println("selamat siang");
                        System.out.printf("%02d:%02d:%02d\n\n", jam, menit, detik);
                    } else if (jam <= 18) {
                        System.out.println("selamat sore");
                        System.out.printf("%02d:%02d:%02d\n\n", jam, menit, detik);
                    } else {
                        System.out.println("selamat malam");
                        System.out.printf("%02d:%02d:%02d\n\n", jam, menit, detik);
                    }
                } else
                    System.out.println("harap masukkan 0<=nilai<360");
            }
        } catch (Exception e) {
            System.out.println("inputan hanya angka bernilai 0 sampai 360");
        }
        
    }
}
