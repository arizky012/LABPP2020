package com.raka;

import java.util.Scanner;

public class PraktikumNo3 {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        float h, a, b, c, d, l;
        System.out.println("Mneghitung panjang kapal dari puncak mercusuar");
        System.out.println("inputlah nilai h, a, b secara berurutan: ");
        
            // h adalah ketinggian dalam meter
           h = value.nextFloat();

            // a adalah sudut depresi terhadap ujung belakang kapal
            // a disini akan diubah langsung ke tan
           a = value.nextFloat();
                a = (float) Math.tan(Math.toRadians(a));

            // b adalah sudut depresi terhadap ujung depan kapal
            // b disini akan diubah langsung ke tan
           b = value.nextFloat();
                b = (float) Math.tan(Math.toRadians(b));

            if ( 90 > a && a > b ) {
                // c adalah jarak kapal bagian depan terhadap bagian bawah menara
                // tan b = c / h
                c = h * b;

                // d adalah jarak kapal bagian belakang terhadap bagian bawah menara
                // tan a = d / h
                d = h * a;

                // l merupakan panjang kapal
                // l bisa didapat dari selisih antara jarak kapal bagian belakang dan depan terhadap bagian bawah menara
                l = d - c;

            System.out.printf("Panjang Kapal : %.1f", l);
            System.out.println(" m");

            }
            else if (a < b){
                System.out.println("Input yang anda masukkan salah");
            }

    }
}
