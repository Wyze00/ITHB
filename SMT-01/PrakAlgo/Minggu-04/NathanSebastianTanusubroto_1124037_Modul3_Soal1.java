import java.util.Scanner;

public class NathanSebastianTanusubroto_1124037_Modul3_Soal1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // Input
        
        System.out.print("Masukkan jumblah mahasiswa : ");
            int jml_mhs = scan.nextInt();
        System.out.println();

        int hasil = 0;

        for(int i = 1; i<=jml_mhs; i++){

            System.out.print("Masukkan nilai mahasiswaq ke " + i);
                hasil = hasil + scan.nextInt();
        }

        // Output

        System.out.println("Rata - rata adalah : " + (double)(hasil/jml_mhs));
    }
}