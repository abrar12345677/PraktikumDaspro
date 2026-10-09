package Pertemuan2;

import java.util.Scanner;

public class Segitiga01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        int alas,tinggi;
        float luas;

        System.out.print("Masukkan alas : ");
        alas = abror.nextInt();
        System.out.print("Masukkan tinggi : ");
        tinggi = abror.nextInt();

        luas = alas * tinggi / 2;

        System.out.println("Luas segitiga :"+ luas);
    }
}
