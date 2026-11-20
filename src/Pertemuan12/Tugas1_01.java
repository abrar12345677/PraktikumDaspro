package Pertemuan12;

/*
5 + (P mod 11) dan P mod 100
= 6 dan 1
*/

import java.util.Scanner;

public class Tugas1_01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        int jumlahMhs = 6;
        int[] nilai = new int[jumlahMhs];
        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = abror.nextInt();
            total += nilai[i];
        }

        double rata2 = (double) total / nilai.length;

        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        System.out.println("Total nilai: " + total);
        System.out.printf("Rata-rata: %.2f\n", rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        System.out.println("Daftar Nilai dan Status Kelulusan:");
        for (int i = 0; i < nilai.length; i++) {
            String status = (nilai[i] > 50) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }
    }
}