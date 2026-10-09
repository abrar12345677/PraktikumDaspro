package Pertemuan3;

import java.util.Scanner;

public class MenghitungTotalBayar01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

    double harga;
    double potongan;
    double jml_bayar;
    double diskon=0.15;

    System.out.print("Harga : ");
    harga=abror.nextInt();

    potongan=diskon*harga;
    jml_bayar=harga-potongan;
    
    

    System.out.println("Jumlah yang harus anda bayar adalah : "+jml_bayar);
    }
}
