import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {

        // Input 
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan nilai awal : (HH:MM)");
             int awal = (scan.nextInt() * 3600) + (scan.nextInt() > 15 ? 3600 : 0);
        System.out.println();

        System.out.print("Masukkan nilai akhir : (HH:MM)");
             int akhir = (scan.nextInt() * 3600) + (scan.nextInt() > 15 ? 3600 : 0);
        System.out.println();

        System.out.print("Apakah anda mahasiswa/pegawai ITHB ? (true/false) ");
            boolean status = scan.nextBoolean();
        System.out.println();

        if(awal >= akhir){throw  new Error("Input salah");}

        akhir = akhir - awal;
        int harga = (status == true) ? 2000 : 3000;

        // Output Akhir

        System.out.println("Sumarry");
        System.out.println("Status : " + (status == true ? "mahasiwa/pegawai ITHB" : "umum"));
        System.out.println("Total jam : " + akhir/3600);
        System.out.println("Total harga : " + akhir/3600*harga);
    }
}
