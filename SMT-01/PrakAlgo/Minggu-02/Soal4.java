
import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

      /**
	   * Tugas 04 {Program untuk mengkonversi detik menjadi format 'HH:MM:SS'}
	   *
	   * Var detik, menit, jam {int}
	   *
	   */

	   int jam, menit, detik;

	   System.out.print("Masukkan detik : ");
	    detik = scan.nextInt();

	   jam = detik / 3600;
	   detik = detik % 3600;

	   menit = detik / 60;
	   detik = detik % 60;

	   System.out.println("Konversi : " + jam + " jam, " + menit + " menit, " + detik + " detik.");
	   System.out.println();
        
    }
}
