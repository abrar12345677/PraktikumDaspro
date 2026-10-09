package Pertemuan4;
import java.util.Scanner;

public class Tugas1PemilihanIf01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print( "Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = abror.nextBoolean();

        String pesan = uktLunas ? "pembayaran terverif" : "";
            
        System.out.println(pesan);

    }
    
}
