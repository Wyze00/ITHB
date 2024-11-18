import java.util.Scanner;

public class Soal4 {
  
    public static void main(String[] args) {
  
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Masukkan : [panjang] [lebar] [tinggi]");
    
        double panjang = scan.nextDouble();
        double lebar = scan.nextDouble();
        double tinggi = scan.nextDouble();
    
        // Pembesaran
    
        System.out.println("Pembesaran ? (true/false)");
    
        while (scan.nextBoolean()) {
    
            System.out.println("Masukkan n");
            pembesaran(panjang, lebar, tinggi, scan.nextInt());
      
            System.out.println("\nMau lanjut ? (true/false)");
        }
    }
  
    static void pembesaran(double panjang, double lebar, double tinggi, double n) {
  
        panjang = panjang * n;
        lebar = lebar * n;
        tinggi = tinggi * n;
    
        System.out.printf("Volume setelah pembesaran sebesar %.0f kali : %.0f\n", n, volume(panjang, lebar, tinggi));
    }
  
    static double volume(double panjang, double lebar, double tinggi) {
      return panjang * lebar * tinggi;
    }
}