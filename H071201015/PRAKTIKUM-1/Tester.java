package com.raka;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        double N, K;
        Scanner value1 = new Scanner(System.in);
        System.out.println("---Menghitung Persentase Kehadiran---");
        System.out.println("Banyak Pertemuan (spasi) Banyak Kehadiran ");

        N = value1.nextDouble();
        K = value1.nextDouble();

        if (K <= N) {
            double S;
            S = (K / N) * 100;
            System.out.printf("Persentase Kehadiran = %.2f", S);
            System.out.println("%");
        } else if (K > N) {
            System.out.println("ERROR! INPUT YANG ANDA MASUKKAN SALAH!!");
        }
    }
}
