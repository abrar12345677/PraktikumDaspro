package Latihan;
import java.util.Scanner;

public class Latihan9 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        int simpanAwal;
        double bunga = 0.05;
        int biayaAdmin = 12500;
        int lamaSimpan = 12;
        double totAdmin,totBunga,saldoAkhir;


        System.out.print("Simpanan Awal : Rp");
        simpanAwal = abror.nextInt();

        totBunga = simpanAwal * bunga;
        totAdmin = biayaAdmin * lamaSimpan;
        saldoAkhir = simpanAwal + totBunga - totAdmin;

        System.out.println("Saldo akhir : Rp"+(int)saldoAkhir);

        



    }
    
}
