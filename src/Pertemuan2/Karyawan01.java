package Pertemuan2;
import java.util.Scanner;

public class Karyawan01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

    int gajiPokok,jumlahAnak,totalTunjangan;
    double potonganGaji = 0.1;
    int besarTunjangan = 100000;
    double totalPotongan,gajiBersih;

    System.out.print("Besar gaji pokok : ");
    gajiPokok = abror.nextInt();
    System.out.print("Jumlah anak : ");
    jumlahAnak = abror.nextInt();

    totalTunjangan = besarTunjangan * jumlahAnak;
    totalPotongan = gajiPokok * potonganGaji;
    gajiBersih = gajiPokok - totalPotongan + totalTunjangan;

    System.out.println("Total tunjangan : "+totalTunjangan);
    System.out.println("Total potongnan : "+totalPotongan);
    System.out.println("Gaji bersih : "+gajiBersih);


    }
    
}
