import java.util.Scanner;

public class Soal1A {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Brp kali : ");
            int jumblah = scan.nextInt();

        double rendah = 999999999;
        String hasil = "";

        for(int i = 1; i<= jumblah; i++){

            System.out.println("Ke : " + i);
            System.out.println("Masukan (Nama Perusahaan) (Jam Kerja) (Pendapatan) (Jarak) ");
                String namaPerusahaan = scan.next();
                double jamKerja = scan.nextDouble();
                double pendapatan = scan.nextDouble();
                double jarak = scan.nextDouble();

            double pendapatanBersih = pendapatan - (1000*jarak*jamKerja*Math.E);

            if(pendapatanBersih < rendah){
                rendah = pendapatan;
                hasil = namaPerusahaan + ", " + jamKerja + "Jam, Rp. " + pendapatanBersih;
            }
        }

        System.out.println(hasil);
    }
}