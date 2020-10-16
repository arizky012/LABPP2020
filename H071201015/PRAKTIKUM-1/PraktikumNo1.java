package com.raka;

import java.util.Scanner;

public class PraktikumNo1 {

    public static void main(String[] args) {
        Scanner value1 = new Scanner(System.in);
        Scanner value2 = new Scanner(System.in);
	    int t , v;
	    float f;

        System.out.println("---Menghitung bensin yang digunakan dalam suatu perjalanan---" );
        System.out.printf("Waktu Perjalanan (dalam jam) : " );
	    t = value1.nextInt();

        System.out.printf("Kecepatan rata-rata (Km/jam) : ");
	    v = value2.nextInt();

	    f = (float)(t * v)/ 14;
        System.out.printf("Bensin yang digunakan : %.3f", f);
        System.out.println(" L");

    }
}
