package Pertemuan2;
import java.util.Scanner;

public class Tanah01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

    int lebarTanah,panjangTanah,panjangTaman,luasTanah,luasTaman;
    double sisaLuastanah,luasKolam,diameterKolam,jariJari;
    double phi = 3.14;

    System.out.print("Lebar tanah : ");
    lebarTanah = abror.nextInt();
    System.out.print("Panjang tanah : ");
    panjangTanah = abror.nextInt();
    System.out.print("Diameter kolam : ");
    diameterKolam = abror.nextInt();
    System.out.print("Panjang taman : ");
    panjangTaman = abror.nextInt();

    luasTanah = lebarTanah * panjangTanah;
    jariJari = diameterKolam / 2;
    luasKolam = phi * jariJari * jariJari;
    luasTaman = panjangTaman * panjangTaman;
    sisaLuastanah = luasTanah - (luasKolam + luasTaman);

    System.out.println("Luas tanah : "+luasTanah);
    System.out.println("Luas kolam : "+luasKolam);
    System.out.println("Luas taman : "+luasTaman);
    System.out.println("Sisa luas tanah : "+sisaLuastanah);
    }
    
}
