package Latihan;
import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

    int luasRumah,hargaKaleng;
    double totKaleng,totBiaya;

    System.out.print("Luas Rumah : ");
    luasRumah = abror.nextInt();
    System.out.print("Harga Kaleng : ");
    hargaKaleng = abror.nextInt();

    totKaleng = luasRumah/10.0;
    totBiaya = hargaKaleng * totKaleng;

    System.out.println("Total biaya cat : "+(int) totBiaya);


    }
    
}
