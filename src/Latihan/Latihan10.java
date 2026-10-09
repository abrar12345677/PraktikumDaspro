package Latihan;
import java.util.Scanner;

public  class Latihan10 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        int hargaBaju;
        double diskon = 0.15;
        double PPN = 0.10;
        double hargaDiskon,hargaPajak,totBayar;

        System.out.print("Harga Baju : Rp");
        hargaBaju = abror.nextInt();

        hargaDiskon = hargaBaju * diskon;
        hargaPajak = (hargaBaju-hargaDiskon) * PPN;
        totBayar = (hargaBaju-hargaDiskon)+hargaPajak;

        System.out.println("Total Bayar : Rp"+(int)totBayar);
    }
}