
import java.util.Scanner;

public class NathanSebastianTanusubroto_1124037_Modul1_No2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /**
         * Tugas 03 {Program sederhana untuk menampilkan informasi}
         *
         * Var nama, alamat telepon, gender {String}
         *     status {boolean}
         *     penghasilan {double}
         *
         */
   
         String nama, alamat, telepon, gender;
         int usia;
         boolean status;
         double penghasilan;
   
         System.out.print("Masukkan Nama: ");
             nama = scan.nextLine();
   
         System.out.print("Masukkan Alamat: ");
             alamat = scan.nextLine();
   
         System.out.print("Masukkan Telepon: ");
             telepon = scan.nextLine();
   
         System.out.print("Masukkan Gender: ");
             gender = scan.nextLine();
   
         System.out.print("Masukkan Usia: ");
             usia = scan.nextInt();
   
         System.out.print("Masukkan Status: ");
             status = scan.nextBoolean();
   
         System.out.print("Masukkan penghasilan: ");
             penghasilan = scan.nextDouble();
   
         System.out.println();
         System.out.println("Nama saya " + nama + ", seorang " + gender + " tinggal di " + alamat + " dan Telepon " + telepon + ". Tahun ini usia saya " + usia + " tahun, " +status + " , dan penghasilan saya Rp." + penghasilan);
    	
    }
}
