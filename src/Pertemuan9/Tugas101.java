/*
• Harga tiket = 40000 + (1 mod 6) × 2000 → gantikan Rp42.000 pada soal
• Syarat diskon pertama = lebih dari (3 + (1 mod 3)) tiket, dengan diskon (8 + (1 mod 5))% →
gantikan "lebih dari 4 tiket, diskon 9%"   
• Syarat diskon kedua = lebih dari (8 + (1 mod 4)) tiket, dengan diskon (15 + (1 mod 4))% →
gantikan "lebih dari 9 tiket, diskon 16%"
*/
package Pertemuan9;

import java.util.Scanner;

public class Tugas101 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        int jmlTiket,totalTiket=0,hargaTiket=42000,i=0;
        double diskon=0,totPenjualan=0,totalHarga;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan :");
            jmlTiket = abror.nextInt();

            if (jmlTiket == 0) {
                break;
            }
            if (jmlTiket < 0) {
                System.out.println("Input tidak valid!");
                continue;
            }
            totalHarga=jmlTiket*hargaTiket;

            if (jmlTiket > 4) {
                diskon = 0.09;
            } else if (jmlTiket > 9) {
                diskon= 0.16;
            } else
            
            totPenjualan=totalHarga*diskon-totalHarga;

            totalTiket +=jmlTiket;
            totPenjualan += totalHarga;
            i++;

        }
        System.out.println("Total Tiket : "+totalTiket);
        System.out.println("Total Penjualan : Rp"+totPenjualan);
    }
}
