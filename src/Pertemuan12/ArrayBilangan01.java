package Pertemuan12;
/*
P ; P+8 ; −(1+(P mod 7)) ; 20+(P mod 15 = 1,9,-2,21
*/
import java.util.Arrays;

public class ArrayBilangan01 {
    public static void main(String[] args) {
        int[] bil = new int[4];

        bil[0] = 1;
        bil[1] = 9;
        bil[2] = -2;
        bil[3] = 21;
        
        for (int i = 0; i <= 4; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }
        System.out.println(Arrays.toString(bil));
    }

    
}