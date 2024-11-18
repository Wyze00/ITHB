import java.util.Scanner;

public class Soal7 {

    public static void main(String[] args) {
  
        Scanner scan = new Scanner(System.in);
  
        System.out.println("Masukkan angka terus (end 9999)");
  
        rata_rata(scan.nextDouble(), scan);
    }
  
    static void rata_rata(double angka, Scanner scan) {
  
        double jumlah = 0;
        int counter = 0;
    
        while (angka != 9999) {
    
            jumlah += angka;
            counter++;
            angka = scan.nextDouble();
        }
    
        System.out.println(jumlah / counter);
    }
}