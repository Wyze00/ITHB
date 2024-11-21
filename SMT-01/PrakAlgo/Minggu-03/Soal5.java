import java.util.Scanner;

public class Soal5 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan nilai awal : (HH:MM)");
             int jam = ((scan.nextInt() * 3600) + (scan.nextInt() > 30 ? 3600 : 0)) / 3600;
        System.out.println();

        System.out.print("Mobil / Motor : ");
            int harga_kendaraan = (scan.next().equals("Mobil")) ? 6000 : 3000;

        if(jam == 1){System.out.println("Total Harga : " + harga_kendaraan/2);}
        else if(jam >= 6){System.out.println("Total Harga : " + harga_kendaraan * 5);}
        else{System.out.println("Total Harga : " + (harga_kendaraan * jam - (harga_kendaraan/2)));}
    }
}
