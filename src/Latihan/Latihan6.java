package Latihan;
import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        int tarifBarang,beratPaket,biayaDasar;
        double biayaTambahan = 0.2;
        int biayaAsuransi = 5000;
        double biayaEkspres,totBiaya;

        System.out.print("Tarif Barang : Rp");
        tarifBarang = abror.nextInt();
        System.out.print("Berat Paket : ");
        beratPaket = abror.nextInt();

        biayaDasar = tarifBarang * beratPaket;
        biayaEkspres = biayaDasar * biayaTambahan;
        totBiaya = biayaDasar + biayaEkspres + biayaAsuransi;

        System.out.println("Biaya pengiriman dasar : "+biayaDasar);
        System.out.println("Biaya tambahan ekspres : "+(int) biayaEkspres);
        System.out.println("Total Biaya : "+(int) totBiaya);




    }
    
}
