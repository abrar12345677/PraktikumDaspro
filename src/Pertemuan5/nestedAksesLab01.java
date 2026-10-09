package Pertemuan5;

import java.util.Scanner;

public class nestedAksesLab01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = abror.nextBoolean();
        System.out.print("Apakah sedang disanksi? (true/false): ");
        sedangDisanksi = abror.nextBoolean();
        System.out.print("Apakah punya izin dosen? (true/false): ");
        punyaIzinDosen = abror.nextBoolean();
        System.out.print("Apakah merupakan asisten lab? (true/false): ");
        asistenLab = abror.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
             if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                 System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
                }
            } else {
                 System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }

    }
    
}
