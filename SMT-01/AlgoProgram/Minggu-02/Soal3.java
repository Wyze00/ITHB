import  java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);

        float tinggi, ideal;

        System.out.print("Masukkan tinggi badan : ");
            tinggi = scan.nextInt();

        ideal = (tinggi - 100) - (tinggi - 100) * 10 / 100;

        System.out.println("Berat badan idealmu adalah : " + ideal);

    }
}
