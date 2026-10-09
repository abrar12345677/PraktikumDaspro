package Latihan;
import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

    int gajiPokok;
    double pajakPPH = 0.05;
    double iuranBPJS = 0.01;
    int tunjangan = 200000;
    double totPotongan,gajiBersih;

    System.out.print("Gaji Pokok : ");
    gajiPokok = abror.nextInt();

    totPotongan = gajiPokok * (pajakPPH + iuranBPJS);

    gajiBersih = (gajiPokok- totPotongan) + tunjangan;

    System.out.println("Total Potongan : "+(int) totPotongan);
    System.out.println("Gaji Bersih : "+(int) gajiBersih);



    }
}
