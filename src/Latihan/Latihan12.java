package Latihan;
import java.util.Scanner;

public class Latihan12 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

    int biayaSewa,totBiaya,lamaSewa;
    int diskon = 20000;

    System.out.print("Biaya Sewa : Rp");
    biayaSewa = abror.nextInt();
    System.out.print("Lama Sewa : Rp");
    lamaSewa = abror.nextInt();

    totBiaya = (biayaSewa * lamaSewa) - diskon;
    
    System.out.println("Total Biaya : Rp"+(int)totBiaya);





    }
    
}
