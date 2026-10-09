package Latihan;
import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        int lamaSewa,tarifSewa;
        double diskon =0.15;
        int biayaKebersihan = 10000;
        double totDiskon,totBiaya,totSewa;

        System.out.print("Lama Sewa : ");
        lamaSewa = abror.nextInt();
        System.out.print("Tarif Sewa : ");
        tarifSewa = abror.nextInt();


        totSewa = lamaSewa * tarifSewa;
        totDiskon = (lamaSewa*tarifSewa) * diskon;
        totBiaya = totSewa - totDiskon + biayaKebersihan; 

        System.out.println("Total Diskon : "+totDiskon);
        System.out.println("Total Biaya : "+totBiaya);
    }
}
