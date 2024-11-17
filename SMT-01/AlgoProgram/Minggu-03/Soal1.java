import  java.util.Scanner;

public class Soal1 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        float totalHarga = scan.nextFloat();

        if(totalHarga > 100){

            totalHarga = (float) (totalHarga * 0.9);

        }

        System.out.println(totalHarga);
        System.out.printf("%.1f", totalHarga);
    }
}