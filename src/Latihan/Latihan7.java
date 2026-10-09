package Latihan;
import java.util.Scanner;

public class Latihan7 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        int nominalToken,totBiayaadmin;
        int biayaAdmin = 2500;
        double PPJ = 0.03;
        double totPajak,totBayar;

        System.out.print("Nominal Token : Rp");
        nominalToken = abror.nextInt();

        totBiayaadmin = nominalToken + biayaAdmin;
        totPajak = nominalToken * PPJ;
        totBayar = totBiayaadmin + totPajak;

        System.out.println("Total dibayar : Rp"+(int) totBayar);
    }
    
}
