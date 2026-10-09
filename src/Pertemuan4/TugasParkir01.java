package Pertemuan4;
import java.util.Scanner;

public class TugasParkir01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        System.out.println("-- Sistem Parkir Berbayar Kendaraan Roda Dua --");
        System.out.print("Masukkan lama parkir anda : ");
        int lamaParkir = abror.nextInt();

        if (lamaParkir >= 2) {
            System.out.println("Total Pembayaran : Rp"+ (2000+1000*(lamaParkir-2)));            
        } else {
            System.out.println("Total Pembayaran : Rp2000");
        }
    }



}