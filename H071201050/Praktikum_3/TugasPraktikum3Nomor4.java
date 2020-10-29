import java.util.Scanner;
public class TugasPraktikum3Nomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            int price = input.nextInt();
            int money = input.nextInt();
            int seratus = 0, limaPuluh = 0, duaPuluh = 0, sepuluh = 0, lima = 0, dua = 0, seribu = 0;
            if (money >= price){
                int change = money - price;
                while (change > 0){
                    if (change - 100000 >= 0){
                        change -= 100000;
                        seratus++;
                    }
                    else if (change - 50000 >= 0){
                        change -= 50000;
                        limaPuluh++;
                    }
                    else if (change - 20000 >= 0){
                        change -= 20000;
                        duaPuluh++;
                    }
                    else if (change - 10000 >= 0){
                        change -= 10000;
                        sepuluh++;
                    }
                    else if (change - 5000 >= 0){
                        change -= 5000;
                        lima++;
                    }
                    else if (change - 2000 >= 0){
                        change -= 2000;
                        dua++;
                    }
                    else{
                        change -= 1000;
                        seribu++;
                    }
                }
                System.out.println(seratus + " uang Rp. 100.000");
                System.out.println(limaPuluh + " uang Rp. 50.000");
                System.out.println(duaPuluh + " uang Rp. 20.000");
                System.out.println(sepuluh + " uang Rp. 10.000");
                System.out.println(lima + " uang Rp. 5.000");
                System.out.println(dua + " uang Rp. 2.000");
                System.out.println(seribu + " uang Rp. 1.000");
            }
            else{
                System.out.println("Uang Tidak Cukup");
            }
        }
        catch (Exception e){
            System.out.println("Inputan Tidak Valid!");
        }
        input.close();
    }
}
