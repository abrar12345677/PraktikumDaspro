package Latihan;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        int jarakMobil,hargaLiter;
        double totLiter,totBiaya;

        System.out.print("Jarak Perjalanan : ");
        jarakMobil = abror.nextInt();
        System.out.print("BBM yang digunakan : ");
        hargaLiter = abror.nextInt();

        totLiter = jarakMobil/12.0;
        totBiaya = totLiter * hargaLiter ;

        System.out.println("Total Biaya : Rp"+ (int) totBiaya);




    }
    
}
