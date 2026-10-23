/*
• hargaKopi = 10000 + (1 mod 5) × 1000 → gantikan Rp11.000 pada soal
• hargaTeh = 5000 + (1 mod 4) × 1000 → gantikan Rp6.000 pada soal
• hargaRoti = 15000 + (1 mod 6) × 1000 → gantikan Rp16.000 pada soal
*/
package Pertemuan9;

import java.util.Scanner;

public class KafeDoWhile {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        int kopi,teh,roti,hargaKopi=11000,hargaTeh=7000,hargaRoti=16000,totalHarga;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = abror.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = abror.nextInt();
            System.out.print("Jumlah teh: ");
            teh = abror.nextInt();
            System.out.print("Jumlah roti: ");
            roti = abror.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            abror.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai. ");
    } 
}
