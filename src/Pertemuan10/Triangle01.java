/*
1. 2 + (P mod 3) = 3
*/
package Pertemuan10;

import java.util.Scanner;

public class Triangle01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = abror.nextInt();

        int i = 1;
        while (i <= n) {
            
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        i = n;
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
                
            }
            System.out.println();
            i--;
        }
        abror.close();
    }
    
}
