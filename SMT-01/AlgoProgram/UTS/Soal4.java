import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double awal = scan.nextDouble();
        double akhir = scan.nextDouble();

        double persen = 1.0025;
        int bulan = 0;

        while(awal < akhir){
            awal = awal * persen;
            bulan++;
        }

        System.out.println("Berapa bulan : " + bulan);
    }   
}