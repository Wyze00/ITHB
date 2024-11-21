import java.util.Scanner;

public class Soal3 {

    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {

        System.out.println("Masukkan umur : ");

        double diskon = discount(scan.nextInt());

        System.out.println("Masukkan tujuan :");

        double harga = hargaTiket(scan.nextInt());

        System.out.println("Total harga : " + totalHarga(harga,diskon));
    
    }

    static double discount(int umur){

        if(umur >= 60){
            return 0.5;
        } else {
            if(umur >= 13){
                return 1;
            } else {
                if(umur >= 7){
                    return 0.75;
                } else {
                    return 0.5;
                }
            }
        }
    }

    static double hargaTiket(int tujuan){

        if(tujuan == 1){
            return 280000;
        } else {
            if(tujuan == 2){
                return 600000;
            } else {
                if(tujuan == 3){
                    return 215000;
                } else {
                    return 475000;
                }
            }
        }
    }

    static double totalHarga(double harga, double diskon){
        return harga * diskon;
    }

}
