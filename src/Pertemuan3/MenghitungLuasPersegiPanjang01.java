package Pertemuan3;

import java.util.Scanner;

public class MenghitungLuasPersegiPanjang01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

    int panjang;
    int lebar;
    int luas;


    System.out.print("Panjang : ");
    panjang=abror.nextInt();
    System.out.print("Lebar : ");
    lebar=abror.nextInt();

    luas = panjang*lebar;

    System.out.println("Luas persegi adalah : "+luas);
    }
}
