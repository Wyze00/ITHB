import  java.util.Scanner;

public class Soal6 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan tahun : ");
        int tahun = scan.nextInt();

        if(tahun % 400 == 0 || (tahun % 4 == 0 && tahun % 100 != 0)){
            System.out.println("Tahun Kabisat");
        } else {
            System.out.println("Bukan tahun kabisat");
        }

    }
}