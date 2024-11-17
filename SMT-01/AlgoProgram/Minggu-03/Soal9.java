import java.util.Scanner;

public class Soal9 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan tahun : ");
        int tahun = scan.nextInt();
        
        System.out.print("Masukkan Bulan : ");
        int bulan = scan.nextInt();

        if(tahun % 400 == 0 || (tahun % 4 == 0 && tahun % 100 != 0)){

            if(bulan == 2){System.out.println("29 Hari");}
            else if(bulan == 1 || bulan == 3 || bulan == 7 || bulan == 8 || bulan == 10 || bulan == 12){System.out.println("31 Hari");}
            else {System.out.println("30 Hari");}

        } else {

            if(bulan == 2){System.out.println("28 Hari");}
            else if(bulan == 1 || bulan == 3 || bulan == 7 || bulan == 8 || bulan == 10 || bulan == 12){System.out.println("31 Hari");}
            else {System.out.println("30 Hari");}
            
        }
    }
}
