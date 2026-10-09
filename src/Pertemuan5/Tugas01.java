/*
Kamus 
-Diskon dasar = (8 + (1 mod 5))% = 9%
-Batas jumlah buku = (2 + (1 mod 2)) = 3 buah
-Tambahan diskon = 2%

Novel 
-Diskon dasar = (5 + (1 mod 4 ))% = 6%
-Batas jumlah buku = (3 + (1 mod 2)) = 4 buah
-Tambahan diskon = 2%

Buku lainnya 
-Batas jumlah buku = (3 + (1 mod 2)) = 4 buah
-Diskon = (3 + (1 mod 4)) = 4%
*/
package Pertemuan5;

import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        int jenisBuku,jumlahBuku;
        double diskon = 0.0;

        System.out.println("Masukkan jenis buku");
        System.out.println("1.Buku Kamus");
        System.out.println("2.Buku Novel");
        System.out.println("3.Lainnya");

        System.out.print("Pilih jenis buku: ");
        jenisBuku = abror.nextInt();

        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = abror.nextInt();

        if (jenisBuku == 1) {
            if (jumlahBuku > 2) {
                diskon = 10;
            } else {
                diskon = 0;
            }
        } else if (jenisBuku == 2) {
            if (jumlahBuku > 3) {
                diskon = 7 + 2;
            } else {
                diskon = 7 + 1;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 5;
            } else {
                diskon = 0;
            }
        }

        System.out.println("Diskon: " + diskon + "%");
    }
}