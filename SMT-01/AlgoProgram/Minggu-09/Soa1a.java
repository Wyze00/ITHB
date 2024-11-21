import java.util.Scanner;

public class Soa1a {

    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {

        System.out.println("Masukkan [rata-rata] [uts] [uas]");

        System.out.println("NA : " + hitungNA(scan.nextDouble(), scan.nextDouble(), scan.nextDouble()));
        
    }

    static double hitungNA(double rata, double uts, double uas){

        double quiz = (rata * 3) - uts -uas;

        return (quiz * 0.2) + (uts * 0.3) + (uas * 0.5);
    }
}
