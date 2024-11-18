import java.util.Scanner;

public class Soal6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    
        do {
    
            System.out.println("Masukkan [x1,y1] [x2,y2]");
      
            double d = euclidean(scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
      
            System.out.printf("d = %.2f\n", d);
      
            System.out.println("Mau lagi ? (true/false)");
    
        } while(scan.nextBoolean());
    }
    
    static double euclidean(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}