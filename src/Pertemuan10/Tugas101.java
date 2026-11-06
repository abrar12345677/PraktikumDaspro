/*
1. n = (6 + (P mod 5)) = 7
*/

package Pertemuan10;
import java.util.Scanner;

public class Tugas101 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);
        int n;

        do {
            System.out.print("Masukkan nilai n (minimal 1) : ");
            n = abror.nextInt();
            if (n < 1) {
                System.out.println("Masukkan nilai n kembali (nilai n minimal 1)");
            }
        } while (n < 1);

        int totalAngka = 0;

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                totalAngka++;
                j++;
                
            }
            System.out.println();
            i++;
        }
        System.out.println("Total yang tercetak : "+ totalAngka);
    }
    
}
