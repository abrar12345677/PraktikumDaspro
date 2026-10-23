/*
• Tarif parkir mobil = 2500 + (1 mod 6) × 250 per jam → gantikan Rp2.750 pada soal
• Tarif parkir motor = 1500 + (1 mod 6) × 250 per jam (gunakan nilai (P mod 6) yang SAMA
dengan tarif mobil) → gantikan Rp1.750 pada soal
*/
package Pertemuan9;

import java.util.Scanner;

public class Tugas201 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        int jenis,durasi,total =0;

        do {
            System.out.print("Masukkan jenis kendaraan : ");
            jenis = abror.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam) : ");
                durasi = abror.nextInt();

            if (jenis == 1) {
                total += durasi*2750;
            } else {
                total += durasi*1750;
            }
          }
        } while (jenis!=0);

        System.out.println("Total pembayaran : Rp "+total);
    } 
}
