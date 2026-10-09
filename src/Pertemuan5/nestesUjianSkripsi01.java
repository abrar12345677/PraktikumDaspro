/*
1. Syarat minimal pembimbing 1 = 6 + (P mod 5)
2. Syarat minimal pembimbing 2 = 3 + (P mod 3)
Jawaban :
  1. Syarat minimal pembimbing 1 = 6 + (1 mod 5)
                                 = 6 + 1
                                 = 7
  2. Syarat minimal pembimbing 2 = 3 + (1 mod 3)
                                 = 3 + 1
                                 = 4
*/

package Pertemuan5;
import java.util.Scanner;

public class nestesUjianSkripsi01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        String pesan;

        System.out.print("Apakah mahasiswa bebas kompen? (Ya/Tidak): ");
        String bebasKompen = abror.nextLine();

        System.out.print( "Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = abror.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = abror.nextInt();

        if (bebasKompen.equalsIgnoreCase ("Ya")) {
            if (bimbinganP1 >= 7 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 7 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 7 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 7) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 7 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else { 
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
    }
}
