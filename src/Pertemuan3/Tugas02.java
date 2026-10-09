package Pertemuan3;
import  java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {
       Scanner abror = new Scanner(System.in);

    int jmlLembar;
    int biayaCetak = 500;
    int biayaJilid = 5000;
    int totBiayaCetak,totBiaya;

    System.out.print("Jumlah Lembar : ");
    jmlLembar = abror.nextInt();

    totBiayaCetak = jmlLembar * biayaCetak;
    totBiaya = biayaJilid + totBiayaCetak;

    System.out.println("Total Biaya : "+totBiaya);
    }
    
}
