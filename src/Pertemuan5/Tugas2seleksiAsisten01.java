/*
Minimal Nilai Dasar Pemrograman:
75 + (1 mod 11) = 75 + 1 = 76
Minimal Nilai Wawancara:
70 + (1 mod 11) = 70 + 1 = 71
*/

package Pertemuan5;
import java.util.Scanner;

public class Tugas2seleksiAsisten01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        boolean mahasiswaAktif,sedangDisanksi,punyaSertifikat;
        double nilaiDaspro,nilaiWawancara;

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = abror.nextBoolean();

        System.out.print("Apakah sedang mendapatkan sanksi akademik? (true/false): ");
        sedangDisanksi = abror.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            System.out.print("Masukkan nilai Dasar Pemrograman: ");
            nilaiDaspro = abror.nextDouble();

            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
            punyaSertifikat = abror.nextBoolean();

            if (nilaiDaspro >= 76 || punyaSertifikat) {
                System.out.print("Masukkan nilai wawancara: ");
                nilaiWawancara = abror.nextDouble();

                if (nilaiWawancara >= 71) {
                    System.out.println("Selamat! Mahasiswa DITERIMA sebagai asisten praktikum.");
                } else {
                    System.out.println("Gagal di Tahap 3: Nilai wawancara kurang dari 71.");
                }
            } else {
                System.out.println("Gagal di Tahap 2: Nilai Dasar Pemrograman kurang dari 76 dan tidak memiliki sertifikat kompetensi.");
            }
        } else {
            System.out.println("Gagal di Tahap 1: Mahasiswa tidak aktif atau sedang mendapatkan sanksi akademik.");
        }
    }
}