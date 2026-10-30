/*
1. 3 + (P mod 5) = 4
2. 9 + (P mod 5) = 10
3. 4 + (P mod 4) = 5    
4. 10 + (P mod 6) = 11
*/

package Pertemuan10;

import java.util.Scanner;

public class Star01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = abror.nextInt();

        for (int i = 1; i <= n; i+=2) {
        System.out.print(i + " ");
        }
        System.out.println();
        abror.close();
    }
}