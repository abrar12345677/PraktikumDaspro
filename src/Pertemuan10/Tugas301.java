/*
1. (2 + (P mod 3)) = 3
*/

package Pertemuan10;

import java.util.Scanner;

public class Tugas301 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);
        int jumlahToko;

        do {
            System.out.print("Masukkan nilai n (minimal 1) : ");
            jumlahToko = abror.nextInt();
            if (jumlahToko < 1) {
                System.out.print("Masukkan jumlah toko kembali");
            }
        } while (jumlahToko < 1);

        int totSeluruhBarang = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 0;

        int toko = 1;
        while (toko <= jumlahToko) {
            int jumlahPelanggan;
            
            do {
                System.out.print("Toko " + toko + " - jumlah pelanggan : ");
                jumlahPelanggan = abror.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.print("Jumlah pelanggan minimal 0, tidak boleh negatif");
                }
            } while (jumlahPelanggan < 0);

            int totBarang = 0;
            int pelanggan = 1;
            while (pelanggan <= jumlahPelanggan) {
                
                int barang;
                do {
                    System.out.print("Pelanggan "+ pelanggan + " - jumlah barang : ");
                    barang = abror.nextInt();
                    if (barang <= 0) {
                        System.out.print("Jumlah barang minimal 0, tidak boleh negatif");
                    }
                } while (barang < 0);
                totBarang += barang;
                pelanggan++;
            }
            System.out.println("Toko "+ toko + " - pelanggan: "+ jumlahPelanggan + " total barang: "+ totBarang);
            System.out.println();

            totSeluruhBarang += totBarang;

            if (totBarang > barangTerbanyak) {
                barangTerbanyak = totBarang;
                tokoTerbanyak = toko;
            }
            toko++;
            
        }
        System.out.println("Total barang seluruh toko : " + totSeluruhBarang);
        System.out.println("Toko dengan barang terbanyak : " + tokoTerbanyak);

    }
    
}
