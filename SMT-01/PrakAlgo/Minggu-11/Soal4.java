import java.util.Scanner;

record RecPesanan (int nomorMenu, int banyak){}
record RecTamuRestoran (int nomorMeja, RecPesanan[] pesanan){}

public class Soal4 {

    static double totalHarga = 0;
    
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan berapa banyak");
        RecTamuRestoran[] tamu = new RecTamuRestoran[scan.nextInt()];

        // Input
        for(int i = 0; i<tamu.length; i++){

            System.out.println("Meja ke : " + (i+1));
            System.out.println("\nMasukkan nomor meja, jumblah pesanan");
            tamu[i] = new RecTamuRestoran(scan.nextInt(), new RecPesanan[scan.nextInt()]);

            for(int j = 0; j<tamu[i].pesanan().length; j++){

                System.out.println("\nMeja : " + tamu[i].nomorMeja() + " Pesanan ke : " + (j+1));
                System.out.println("Masukkan nomor menu dan berapa banyak");
                tamu[i].pesanan()[j] = new RecPesanan(scan.nextInt(),scan.nextInt());
            }
        }

        // Output

        System.out.println();
        for(int i = 0; i<tamu.length; i++){

            System.out.println("Meja ke : " + (i+1));
            System.out.println("Total Harga : " + hitungHarga(tamu[i]));
        }

        System.out.println("Total keuntungan restoran : " + hitungtotalHarga(totalHarga));        
    }

    static double hitungHarga(RecTamuRestoran tamu){

        double harga = 0;

        for(int i = 0; i<tamu.pesanan().length; i++){
            harga += hargaMenu(tamu.pesanan()[i].nomorMenu())  * tamu.pesanan()[i].banyak();
        }

        totalHarga += harga;
        return harga;
    }

    static double hargaMenu(int nomorMenu){

        if(nomorMenu == 1){
            return 22000;
        } else if(nomorMenu == 2){
            return 15000;
        } else if(nomorMenu == 3){
            return 30000;
        } else if(nomorMenu == 4){
            return 10000;
        } else {
            return 8000;
        }
    }

    static double hitungtotalHarga(double  totalHarga){
        return  totalHarga;
    }
}
