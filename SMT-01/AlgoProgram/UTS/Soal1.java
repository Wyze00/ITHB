import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan umur : ");
            int umur = scan.nextInt();
        
        System.out.println("Masukkan IPK : ");
            float IPK = (float) scan.nextFloat();

        System.out.println("Masukkan S (1/2/3) : ");
            int sarjana = scan.nextInt();
        
        System.out.println("Usia Ijazah : ");
            int ijazah = scan.nextInt();

        if(umur < 18 || IPK < 2.75 || ijazah > 6){
            System.out.println("Tidak Keterima");
        } else if(sarjana == 1 && umur > 30 || sarjana == 2 && umur > 35 || sarjana == 3 && umur > 40){
            System.out.println("Tidak Keterima");
        } else {
            System.out.println("Keterima");
        }
    }
}