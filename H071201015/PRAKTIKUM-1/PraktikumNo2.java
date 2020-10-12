package com.raka;

import java.util.Scanner;

public class PraktikumNo2 {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int detik, Jam, Menit, Detik;
        System.out.println("-Mengubah detik menjadi format (jam:menit:detik)--");
        System.out.printf("Input detik : ");
         detik   = value.nextInt();

            Detik    = detik % 60;
            Jam      = detik / 60;
            Menit    = Jam % 60;
            Jam      = Jam / 60;

        System.out.println(Jam + ":"+ Menit + ":"+ Detik);





   }
}





