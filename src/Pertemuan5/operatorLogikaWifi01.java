package Pertemuan5;

import java.util.Scanner;

public class operatorLogikaWifi01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = abror.nextBoolean();
        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = abror.nextBoolean();
        System.out.print("Apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = abror.nextBoolean();

        if ((mahasiswa && dosen) && !akunDiblokir) {
            System.out.println("Akses WiFi diberikan");
        } else {
            System.out.println("Akses WiFi ditolak");
        }
    }
    
}
