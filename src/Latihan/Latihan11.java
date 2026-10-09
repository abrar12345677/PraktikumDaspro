package Latihan;
import java.util.Scanner;

public class Latihan11 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        int gajiPokok,tunjangan;
        double iuranKes = 0.02;
        int potAsuransi = 50000;
        double potIuran,totGajibersih;

        System.out.print("Gaji Pokok : Rp");
        gajiPokok = abror.nextInt();
        System.out.print("Tunjangan : Rp");
        tunjangan = abror.nextInt();

        potIuran = gajiPokok * iuranKes;
        totGajibersih = (gajiPokok - potIuran) + tunjangan - potAsuransi;

        System.out.println("Total gaji bersih : Rp"+(int)totGajibersih);






    }
    
}
