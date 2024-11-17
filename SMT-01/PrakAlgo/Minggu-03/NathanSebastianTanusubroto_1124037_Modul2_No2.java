import java.util.Scanner;

public class NathanSebastianTanusubroto_1124037_Modul2_No2 {

    public static void main(String[] args) {

        // Input 
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan nilai awal : (HH:MM)");
             int awal = (scan.nextInt() * 3600) + (scan.nextInt() * 60);
        System.out.println();

        System.out.println("Masukkan nilai akhir : (HH:MM)");
             int akhir = (scan.nextInt() * 3600) + (scan.nextInt() * 60);
        System.out.println();

        if(awal >= akhir){throw  new Error("Input salah");}

        System.out.print("Apakah anda mahasiswa/pegawai ITHB ? (true/false) ");
            boolean status = scan.nextBoolean();
        System.out.println();

        // Validasi 

        akhir = akhir - awal;
        akhir = akhir <= 900 ? 0 : akhir/3600 + 1;

        int harga = (status == true) ? 2000 : 3000;

        // Output Akhir

        System.out.println("Sumarry");
        System.out.println("Status : " + (status == true ? "mahasiwa/pegawai ITHB" : "umum"));
        System.out.println("Total jam : " + akhir);
        System.out.println("Total harga : " + akhir*harga);
    }
}
