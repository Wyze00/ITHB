import java.util.Scanner;

public class Soal3 {

    static Scanner scan = new Scanner(System.in);
    static double keuntunganRestoran = 0;
    static double totalPPN = 0;
    static double totalServiceCharge = 0;
    static double totalKeuntunganRestoran = 0;
  
    public static void main(String[] args) {
  
        // Input
    
        do {
            pesanan();
            System.out.println("Ada pesanan lagi ? (true/false)");
        } while (scan.nextBoolean());
    
        // Output
    
        System.out.println("\n====== Total Pendapatan Restoran ======");
        System.out.printf("Pendapantan Restoran : %.2f\nPPN : %.2f\nService Charge : %.2f\n", keuntunganRestoran,
            totalPPN, totalServiceCharge);
        totalKeuntunganRestoran = keuntunganRestoran - totalPPN - totalServiceCharge;
        System.out.println("=======================================");
        System.out.printf("Biaya Utilitas : %.2f\nBayar Pegawai : %.2f\nBahan Baku : %.2f\n", keuntunganRestoran * 0.1,
            keuntunganRestoran * 0.15, keuntunganRestoran * 0.2);
        System.out.println("=======================================");
        totalKeuntunganRestoran = totalKeuntunganRestoran * 0.55;
        System.out.printf("Total Keuntungan Restoran : %.2f\n", totalKeuntunganRestoran);
        System.out.println("=======================================");
    }
  
    static void pesanan() {
  
        System.out.println("\nMasukkan nama pelanggan");
        String namaPelanggan = scan.next();
        double harga = 0;
    
        // Pesanan
    
        System.out.println("\nPilih Menu (ayam/bakso/capcay/dawet/energen) dan jumlahnya");
        String nama = scan.next();
    
        while (!nama.equalsIgnoreCase("X")) { // Terminasi "X"
            harga += menu(nama, scan.nextInt());
            nama = scan.next();
        }
    
        // Summary
    
        System.out.println("\n===================================");
        System.out.printf(
            "Nama pelanggan : %s\nHarga makanan : %.2f\nPPN : %.2f\nService Charge : %.2f\nTotal Bayar : %.2f\n",
            namaPelanggan, harga, harga * 0.11, harga * 0.05, harga * 1.16);
        System.out.println("====================================\n");
    
        // Total Keuntungan Restoran
    
        keuntunganRestoran += harga;
        totalPPN += harga * 0.11;
        totalServiceCharge += harga * 0.05;
    }
  
    static double menu(String nama, int jumblah) {
  
        int harga = 0;
    
        if (nama.equalsIgnoreCase("ayam")) {
            harga = 15000;
        } else if (nama.equalsIgnoreCase("bakso")) {
            harga = 10000;
        } else if (nama.equalsIgnoreCase("capcay")) {
            harga = 20000;
        } else if (nama.equalsIgnoreCase("dawet")) {
            harga = 5000;
        } else if (nama.equalsIgnoreCase("energen")) {
            harga = 25000;
        }
    
        return harga * jumblah;
    }
}
