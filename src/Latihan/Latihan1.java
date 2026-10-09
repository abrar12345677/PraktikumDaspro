package Latihan;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

    int hargaTiket,banyakLembar;
    double diskon = 0.1;
    double biayaTot,totKotor;
    int biayaService = 3000;

    System.out.print("Harga Tiket : ");
    hargaTiket = abror.nextInt();
    System.out.print("Banyak Lembar : ");
    banyakLembar = abror.nextInt();

    totKotor = hargaTiket * banyakLembar;

    biayaTot = (totKotor * (1-diskon)) + biayaService;

    System.out.println("Biaya Total : "+ biayaTot);


    

    }
}