import java.util.Scanner;

public class Penumpang {
    
    String nama;
    int umur, tujuan;
    double diskon, harga, totalHarga;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Deklarasi
        Penumpang p1 = new Penumpang();

        // Input
        p1.nama = scan.next();
        p1.umur = scan.nextInt();
        p1.tujuan = scan.nextInt();
        
        // Logic
        p1.diskon = dapatDiskon(p1.umur);
        p1.harga = dapatHarga(p1.tujuan);
        p1.totalHarga = hitungTotalHarga(p1.diskon, p1.harga);

        // Output
        System.out.println(p1.diskon);
        System.out.println(p1.harga);
        System.out.println(p1.totalHarga);
        
    }

    static double dapatDiskon(int umur){
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

    static double dapatHarga(int tujuan){
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

    static double hitungTotalHarga(double diskon, double harga){
        return harga - (harga * diskon);
    }
}
