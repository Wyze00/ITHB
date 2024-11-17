import  java.util.Scanner;

public class Soal8 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jam : ");
            int jam = scan.nextInt();

        if(jam > 1){
            int total = 2000;
            jam--;

            total = total + (jam * 1500);

            System.out.println("Total Bayar : " + (total >= 15000 ? 15000 : total));


        } else {
            System.out.println("Total Bayar : 2000");
        }
        
    }
}