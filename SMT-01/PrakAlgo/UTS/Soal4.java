import java.util.Scanner;

public class Soal4 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan kecepatan awal (m/s) : ");
            double kecepatan = scan.nextInt();

        if(kecepatan < 0){
            throw new Error("Kecepatan Salah");
        }

        System.out.print("Masukkan sudut (derajat) : ");
            double sudut = scan.nextInt();

        if(sudut < 0 || sudut > 90){
            throw new Error("Sudut Salah");
        }

        System.out.print("Masukkan berat (kg) : ");
            double masa = scan.nextInt();
    
        if(masa < 0){
            throw new Error("Masa salah");
        }

        System.out.println("\n");

        double GRAVITASI = 9.81;
        double RADIAN =  0.0174532925;

        // Waktu

        System.out.print("Waktu total penerbangan : ");

        double T = 2 * kecepatan * Math.sin(sudut * RADIAN) / GRAVITASI;

        System.out.printf("%.4f s\n",T);

         // Jarak

         System.out.print("Jarak Horizontal Maksimum : ");

         double R = kecepatan * Math.cos(sudut*RADIAN) * T;

        System.out.printf("%.4f m\n",R);

          // Ketinggian Maksimum

        System.out.print("Ketinggian Maksimum : ");

        double H = Math.pow(kecepatan * Math.sin(sudut*RADIAN), 2) / (2*GRAVITASI);

        System.out.printf("%.4f m\n",H);
        

         // Tanah

         System.out.print("Kecepatan saat mencapai tanah : ");


         double V = Math.sqrt(Math.pow(kecepatan * Math.cos(sudut*RADIAN),2) + Math.pow((kecepatan * Math.sin(sudut*RADIAN)) - (T * GRAVITASI), 2));

        System.out.printf("%.4f m/s\n",V);
         

        // Energi kinetik

        System.out.print("Energi Kinetik : ");

        double K =  (masa * V * V)/2;
        
        System.out.printf("%.4f Joule\n",K);
    
    }
}
