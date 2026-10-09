package Pertemuan3;
import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);
    
    int hargaLaptop,uangMuka,bulananCicil;
    double sisaCicil,bungaBulan,cicilanPerbulan,jml_cicilan;
    double bunga = 0.01;

    System.out.print("Harga Laptop : ");
    hargaLaptop=abror.nextInt();
    System.out.print("Uang Muka : ");
    uangMuka=abror.nextInt();
    System.out.print("Bulanan Cicil : ");
    bulananCicil=abror.nextInt();

    sisaCicil=hargaLaptop-uangMuka;
    bungaBulan=sisaCicil*bunga;
    cicilanPerbulan=sisaCicil/bulananCicil;
    jml_cicilan=bungaBulan+cicilanPerbulan;

    System.out.println("Jumlah Cicilan : "+jml_cicilan);

    }
    
}
