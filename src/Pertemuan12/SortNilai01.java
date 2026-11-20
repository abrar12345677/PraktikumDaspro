package Pertemuan12;
/*
{B, B+15, B−8, B+30, B−20, B+5} dengan B = 20 +
(P mod 60) = 21, 36, 13, 51, 1, 26
*/
import java.util.Arrays;

public class SortNilai01 {
    public static void main(String[] args) {
    
    int[] nilai = {21, 36, 13, 51, 1, 26};
    for (int i = 0; i < nilai.length - 1; i++) {
        for (int j = 0; j < nilai.length - 1 - i; j++) {
            if (nilai[j] < nilai[j + 1]) {
                int temp = nilai[j];
                nilai[j] = nilai[j + 1];
                nilai[j + 1] = temp;
            }   
        }
    }
    System.out.println(Arrays.toString(nilai));

    }
    
}
