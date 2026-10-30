/*
1. (2 + (P mod 3), 4 + (P mod 3)) = 3,5
2. (5 + (P mod 3), 2 + (P mod 3)) = 6,3
3. 4 + (P mod 4), 6 + (P mod 4) = 5,7
*/
package Pertemuan10;

import java.util.Scanner;

public class Rectangle01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris = abror.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = abror.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        abror.close();
    }    
}

