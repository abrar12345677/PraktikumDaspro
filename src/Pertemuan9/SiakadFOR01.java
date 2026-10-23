//Jumlah mahasiswa (batas perulangan FOR) = 8 + (1 mod 5) → 9
//Batas kelulusan pada Pertanyaan no. 4 (modifikasi kode) = 55 + (1 mod 11) → 56

package Pertemuan9;

import java.util.Scanner;

public class SiakadFOR01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        int jmlMahasiswaLulus=0, jmlMahasiswaTdkLulus=0;
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 9; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = abror.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            } 
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                jmlMahasiswaLulus++;
            } else {
                jmlMahasiswaTdkLulus++;
            }
             
        }
            System.out.println("Mahasiswa yang lulus : "+jmlMahasiswaLulus);
            System.out.println("Mahasiswa yang tidak lulus : "+jmlMahasiswaTdkLulus);
            System.out.println("Nilai Tertinggi : "+ tertinggi);
            System.out.println("Nilai Terendah : "+ terendah);
    }
}