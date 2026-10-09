package Pertemuan4;
import java.util.Scanner;

public class Tugas2Pemilihan {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

     System.out.println("--- Validasi Sistem KRS ---");
     System.out.print("Masukkan jumlah SKS : ");
     int sks = abror.nextInt();
     
     if (sks > 24) {
        System.out.println("Melebihi batas");        
     } else {
        System.out.println("KRS valid");        
     }

    }

}