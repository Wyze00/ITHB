import java.util.Scanner;
import javax.swing.JOptionPane;

public class NathanSebastianTanusubroto_1124037_Modul3_Soal5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);        

        double juri[] = new double[3];
        double totalNilai;


        System.out.println("Audisi pemazmur Provinsi Jawa Barat");
        System.out.println();

        //  Looping Juri

        for(int i = 1; i<=3; i++){

        int teknikal = 0;
        int artistik = 0;
        double avgTeknikal;
        double avgArtistik;

        System.out.printf("Juri ke-%d",i);
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
        juri[i-1] = Math.round((avgArtistik + avgTeknikal) / 2);


        System.out.println("Nilai per aspek : ");
        System.out.printf("Nilai teknikal : %.2f \n", avgTeknikal);
        System.out.printf("Nilai artistik : %.2f \n", avgArtistik);
        System.out.printf("Total nilai juri ke-%d : %.2f \n",i, juri[i-1] );

        System.out.println();

        }

        // Total nilai

        System.out.println("Nilai akhir");
        System.out.println();

        for(int i = 0; i<3; i++){
            System.out.printf("Nilai juri ke-%d : %.2f \n",i+1,juri[i]);
        }

        totalNilai = (juri[0] + juri[1] + juri[2]) / 3;
        
        // Output 

        JOptionPane.showMessageDialog(null, "Total Nilainya adalah : " + Math.round(totalNilai));
        System.out.printf("Total Nilainya adalah : %d" , (int) Math.round(totalNilai));
    }
}

