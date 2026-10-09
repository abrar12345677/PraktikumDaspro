package Pertemuan4;
import java.util.Scanner;

public class TugasAntrean01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        System.out.println("-- Mesin Antrean Akademik --");
        System.out.print("Masukkan kode layanan : ");
        int kode = abror.nextInt();

        switch (kode) {
            case 1:
            System.out.println("Legalisir Ijazah");
            break;
            case 2:
            System.out.println("Surat Keterangan Aktif Kuliah");
            break;
            case 3:
            System.out.println("Pembayaran UKT");
            break;
            case 4:
            System.out.println("Pengajuan Cuti Akademik");   
            break;
        
            default:
                System.out.println("Layanan Tidak Tersedia");
                
        }
    }
}
