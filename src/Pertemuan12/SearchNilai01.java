package Pertemuan12;
/*
50 + (P mod 50) = 51
*/
import java.util.Scanner;

public class SearchNilai01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen array: ");
        int n = abror.nextInt();

        while (n < 1) {
            System.out.print("Jumlah tidak valid. Masukkan banyaknya elemen (minimal 1): ");
            n = abror.nextInt();
        }

        int[] nilai = new int[n];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = abror.nextInt();
        }

        System.out.print("Masukkan nilai (key) yang ingin dicari: ");
        int key = abror.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }

    }
}