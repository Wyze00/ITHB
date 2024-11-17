import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int awal = (scan.nextInt() * 3600) + (scan.nextInt() * 60) + scan.nextInt();
        int akhir = (scan.nextInt() * 3600) + (scan.nextInt() * 60) + scan.nextInt();

        akhir = akhir - awal;

        System.out.println("Jam : " + akhir/3600 + ", Menit : " + akhir%3600/60 + ", Detik : " + akhir%3600%60);

    }
}
