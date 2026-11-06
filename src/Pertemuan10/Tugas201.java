/*
1. n = (5 + (P mod 4)) = 6
*/

package Pertemuan10;

import java.util.Scanner;

public class Tugas201 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);
        int n;

        do {
            System.out.print("Masukkan nilai n (minimal 1) : ");
            n = abror.nextInt();
            if (n < 1) {
                System.out.println("Masukkan nilai n kembali (nilai n minimal 1)");
            }
        } while (n < 3);

        int jumlahAngka = 0;

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                int hasil = i * j;
                System.out.printf("%4d", hasil);
                jumlahAngka += hasil;
                j++;
            }
            System.out.println();
            i++;
            
        }
        System.out.println("Jumlah seluruh angka : "+ jumlahAngka);

    }
}
