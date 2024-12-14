import java.util.Scanner;

public class Sepatu {

    String nama;
    int totalBanyak;
    double totalDiskon;
    double totalHarga;
    Jenis jenis = new Jenis();

    static class Jenis {
        int[] ukuran = {0, 1, 2, 3};
        int[] harga = {50000, 70000, 80000, 95000};
        int[] banyak = new int[4];
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Sepatu[] client = new Sepatu[3];

        // Input

        for(int i = 0; i<3; i++){

            client[i] = new Sepatu();

            client[i].nama = scan.next();

            for(int j = 0; j<4; j++){
                client[i].jenis.banyak[i] = scan.nextInt();
            }

            client[i].totalBanyak = hitungTotalBanyak(client[i].jenis);
            client[i].totalDiskon = hitungTotalDiskon(client[i].jenis);
            client[i].totalHarga = hitungTotalHarga(client[i].jenis, client[i].totalDiskon);
        }
    }

    static int hitungTotalBanyak(Jenis jenis){

        int banyak = 0;

        for(int i = 0; i<4; i++){
            banyak += jenis.banyak[i];
        }

        return banyak;
    }

    static double hitungTotalDiskon(Jenis jenis){

        double diskon = 0;

        if(jenis.banyak[0] > 10){
            diskon += 0.1;
        } else {
            diskon += 0.2;
        }

        return  diskon;
    }   

    static double  hitungTotalHarga(Jenis jenis, double diskon){

        double harga = 0;

        for(int i = 0; i<4; i++){
            harga += jenis.banyak[i] * jenis.harga[i];
        }

        return  harga * (1 - diskon);
    }
}