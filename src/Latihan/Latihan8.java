package Latihan;
import java.util.Scanner;

public class Latihan8 {

    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        int hargaMotor,uangMuka,bulananCicil;
        double bunga = 0.015;
        double sisaCicilan,bungaBulan,cicilanPerbulan,jml_cicilan;

        System.out.println("Harga Motor : Rp");
        hargaMotor = abror.nextInt();
        System.out.println("Uang Muka : Rp");
        uangMuka = abror.nextInt();
        System.out.println("Bulanan Cicil : ");
        bulananCicil = abror.nextInt();

        sisaCicilan = hargaMotor - uangMuka;
        bungaBulan = sisaCicilan * bunga;
        cicilanPerbulan = sisaCicilan/bulananCicil;
        jml_cicilan = bungaBulan + cicilanPerbulan;

        System.out.println("Jumlah Cicilan : "+(int)jml_cicilan);


    }
}