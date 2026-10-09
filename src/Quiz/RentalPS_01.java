package Quiz;
import java.util.Scanner;


public class RentalPS_01 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

    int totMenitbermain,jamPenuh,sisaMenit;    
    int jamSewa = 7000;
    int tariSisa = 150;
    double potongan = 0.0125;
    double totBiayasebelumPot,biayaMember,totBiayasetelahPot;
    int jumlahJamPenuh;

    System.out.print("Total menit bermain : ");
    totMenitbermain = abror.nextInt();
    System.out.print("Jam penuh : ");
    jamPenuh = abror.nextInt();
    System.out.print("Sisa menit : ");
    sisaMenit = abror.nextInt();

    jumlahJamPenuh = (totMenitbermain * 60) - sisaMenit;
    totBiayasebelumPot = (jumlahJamPenuh / 60) * jamSewa + (sisaMenit*tariSisa);
    totBiayasetelahPot = (jumlahJamPenuh * jamSewa) * potongan + (sisaMenit*tariSisa);

    System.out.println("Jam Penuh : "+jamPenuh);
    System.out.println("Sisa Menit : "+sisaMenit);
    System.out.println("Total Biaya : "+(int)totBiayasebelumPot);
    System.out.println("Biaya Member : "+totBiayasetelahPot);


    //Total menit bermain : 9
    //Jam penuh : 8
    //Sisa menit : 60
    //Jam Penuh : 8
    //Sisa Menit : 60
    //Total Biaya : 65000
    //Biaya Member : 51000.0





    }
    
}
