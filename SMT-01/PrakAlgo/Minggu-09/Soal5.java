import java.util.Scanner;

public class Soal5 {

    public static void main(String[] args) {
  
        Scanner scan = new Scanner(System.in);
    
        do {
    
            System.out.println("Masukkan [sisi1] [sisi2] [sisi3]");
      
            checker(scan.nextInt(), scan.nextInt(), scan.nextInt());
      
            System.out.println("Mau coba lagi ? (true/false)");
          
        } while(scan.nextBoolean());
    }
  
    static void checker(int sisi1, int sisi2, int sisi3) {
  
        if(Math.pow(sisi1,2) + Math.pow(sisi2,2) == Math.pow(sisi3,2)) {
            System.out.println("Pythagoras");
        } else {
            System.out.println("Bukan Pythagoras");
        }
    }
}