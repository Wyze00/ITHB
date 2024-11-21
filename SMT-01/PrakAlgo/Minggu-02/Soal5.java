
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Soal5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat(".00");

        /**
         * Tugas 05 {Program}
         *
         * Var teknikal, artistik {int}
         * ````avgTeknikal, avgArtistik, juri1, jur12, juri3, totalNilai {double}
         *
         */

        int teknikal = 0;
        int artistik = 0;
        double avgTeknikal;
        double avgArtistik;

        double juri1, juri2, juri3;
        double totalNilai;


        System.out.println("Audisi pemazmur Provinsi Jawa Barat");
        System.out.println();

        // Juri ke-1

        System.out.println("Juri ke-1");
        System.out.println();

        System.out.println("Penilaian Teknikal");
        System.out.print("Intonasi : ");
            teknikal = teknikal + scan.nextInt();
        System.out.print("Kualitas Vokal : ");
            teknikal = teknikal + scan.nextInt();
        System.out.println();

        System.out.println("Penilaian Artistik");
        System.out.print("Kesesuaian dengan partitur : ");
            artistik = artistik + scan.nextInt();
        System.out.print("Penampilan secara keseluruhan : ");
            artistik = artistik + scan.nextInt();
        System.out.println();

        avgTeknikal = (double) teknikal / 2;
        avgArtistik = (double) artistik / 2;
        juri1 = Math.round((avgArtistik + avgTeknikal) / 2);


        System.out.println("Nilai per aspek : ");
        System.out.println("Nilai teknikal : " + decimal.format(avgTeknikal));
        System.out.println("Nilai artistik : " + decimal.format(avgArtistik));
        System.out.println("Total nilai juri ke-1 : " + decimal.format(juri1));

        System.out.println();

        teknikal = 0;
        artistik = 0;

        // Juri ke-2

        System.out.println("Juri ke-2");
        System.out.println();

        System.out.println("Penilaian Teknikal");
        System.out.print("Intonasi : ");
            teknikal = teknikal + scan.nextInt();
        System.out.print("Kualitas Vokal : ");
            teknikal = teknikal + scan.nextInt();
        System.out.println();

        System.out.println("Penilaian Artistik");
        System.out.print("Kesesuaian dengan partitur : ");
            artistik = artistik + scan.nextInt();
        System.out.print("Penampilan secara keseluruhan : ");
            artistik = artistik + scan.nextInt();
        System.out.println();

        avgTeknikal = (double) teknikal / 2;
        avgArtistik = (double) artistik / 2;
        juri2 = Math.round((avgArtistik + avgTeknikal) / 2);


        System.out.println("Nilai per aspek : ");
        System.out.println("Nilai teknikal : " + decimal.format(avgTeknikal));
        System.out.println("Nilai artistik : " + decimal.format(avgArtistik));
        System.out.println("Total nilai juri ke-2 : " + decimal.format(juri2));

        System.out.println();

        teknikal = 0;
        artistik = 0;

        // Juri ke-3

        System.out.println("Juri ke-3");
        System.out.println();

        System.out.println("Penilaian Teknikal");
        System.out.print("Intonasi : ");
            teknikal = teknikal + scan.nextInt();
        System.out.print("Kualitas Vokal : ");
            teknikal = teknikal + scan.nextInt();
        System.out.println();

        System.out.println("Penilaian Artistik");
        System.out.print("Kesesuaian dengan partitur : ");
            artistik = artistik + scan.nextInt();
        System.out.print("Penampilan secara keseluruhan : ");
            artistik = artistik + scan.nextInt();
        System.out.println();

        avgTeknikal = (double) teknikal / 2;
        avgArtistik = (double) artistik / 2;
        juri3 = Math.round((avgArtistik + avgTeknikal) / 2);


        System.out.println("Nilai per aspek : ");
        System.out.println("Nilai teknikal : " + decimal.format(avgTeknikal));
        System.out.println("Nilai artistik : " + decimal.format(avgArtistik));
        System.out.println("Total nilai juri ke-3 : " + decimal.format(juri3));

        System.out.println();

        // Total nilai

        System.out.println("Nilai akhir");
        System.out.println();

        System.out.println("Nilai juri ke-1 : " + decimal.format(juri1));
        System.out.println("Nilai juri ke-2 : " + decimal.format(juri2));
        System.out.println("Nilai juri ke-3 : " + decimal.format(juri3));
        System.out.println();

        totalNilai = (juri1 + juri2 + juri3) / 3;
        
        // Output 

        JOptionPane.showMessageDialog(null, "Total Nilainya adalah : " + decimal.format(Math.round(totalNilai)));
        System.out.println("Total Nilainya adalah : " + decimal.format(Math.round(totalNilai)));

    }
}

