package Praktikum1;

import java.util.Scanner;

public class Tugas1nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int A = input.nextInt();
        
        float B = (T * A) / 14f;

        System.out.printf("Bensin Yang Digunakan : %.3f L", B);
    }
}