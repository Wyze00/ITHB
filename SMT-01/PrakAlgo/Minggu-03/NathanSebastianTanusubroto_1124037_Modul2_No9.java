import java.util.Scanner;

public class NathanSebastianTanusubroto_1124037_Modul2_No9 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // Input

        System.out.println("Form Pengisian data Lembaga Pengembangan Pesparani Daerah Jawa Barat mengadakan audisi paduan suara (PS) : ");

        System.out.print("Masukkan umur : ");
            int umur = scan.nextInt();
        System.out.println();

        System.out.print("Sudah menikah ? (true/false) : ");
            boolean status = scan.nextBoolean();
        System.out.println();

        // Output

        System.out.println("Hasilnya adalah : ");
        
        if(umur >= 18 && umur <= 30 && status == false){
            System.out.println("Anda terdaftar dalam Audisi PS OMK Campuran (PSOMKC)");
        } else if(umur >= 31 || status == true){
            System.out.println("Anda terdaftar dalam Audisi PS Dewasa Campuran (PSDC)");
        } else {
            System.out.println("Anda tidak lolos seleksi");
        }
    }
}
