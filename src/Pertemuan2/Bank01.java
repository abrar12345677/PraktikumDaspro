package Pertemuan2;

import java.util.Scanner;

public class Bank01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

    int tabunganAwal,lamaMenabung;
    double bunga;
    double persentaseBunga = 0.02;
    double tabunganAkhir;

    System.out.print("Tabung awal : ");
    tabunganAwal = abror.nextInt();
    System.out.print("Lama menabung :");
    lamaMenabung = abror.nextInt();

    bunga = tabunganAwal * persentaseBunga * lamaMenabung;
    tabunganAkhir = bunga + tabunganAwal;

    System.out.println("Bunga adalah : "+bunga);
    System.out.println("Tabungan akhir anda adalah : "+tabunganAkhir);

        
    }
}
