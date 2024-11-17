import  java.util.Scanner;

public class Soal10 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Knight (K)");
        System.out.println("Windtalker (W)");
        System.out.print("Masukkan Character : ");
            char karakter = scan.next().charAt(0);
        System.out.println();


        System.out.println("Excallibur (E)");
        System.out.println("Bow of Light (B)");
        System.out.print("Masukkan Item : ");
            char item = scan.next().charAt(0);
        System.out.println();

        System.out.print("Masukkan Jumblah Item : ");
            int jumblah = scan.nextInt();
        System.out.println();

        if(karakter == 'K') {
            int harga = item == 'E' ? 75_000 : 90_000;

            System.out.println("Summary");
            System.out.println("Character : Kinght");
            System.out.println("Item : " + (item == 'E' ? "Excallibur" : "Bow of Light"));
            System.out.println("Total item : " + (jumblah + jumblah/3));
            System.out.println("Total harga : " + (harga * jumblah) + " zeny");

        } else {
            int harga = item == 'E' ? 70_000 : 100_000;
            double potongan = jumblah > 1 ? jumblah >= 10 ? 0.75 : 1 - (jumblah/2 * 0.05)  : 1;

            System.out.println("Summary");
            System.out.println("Character : Windtalker");
            System.out.println("Item : " + (item == 'E' ? "Excallibur" : "Bow of Light"));
            System.out.println("Total item : " + (jumblah));
            System.out.println("Total harga : " + (int)(harga * jumblah * potongan) + " zeny");
        }
    }
}