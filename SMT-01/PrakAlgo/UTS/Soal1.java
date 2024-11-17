import java.util.Scanner;

public class Soal1 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Jenis Barang (berat | ringan): ");
            String barang = scan.nextLine();

        System.out.print("Cuaca (cerah | hujan) : ");
             String cuaca = scan.nextLine();
    

        System.out.print("Lalu lintas (macet | lancar) : ");
             String laluLintas = scan.nextLine();
    

        System.out.print("Jenis Kendaraan (motor | mobil) : ");
              String kendaraan = scan.nextLine();
    
        if(barang.equalsIgnoreCase("ringan") && cuaca.equalsIgnoreCase("cerah") && laluLintas.equalsIgnoreCase("lancar")){
            System.out.println("Jalan Raya");

        } else if (barang.equalsIgnoreCase("berat") && cuaca.equalsIgnoreCase("cerah") && laluLintas.equalsIgnoreCase("macet") && kendaraan.equalsIgnoreCase("mobil")){
            System.out.println("Jalan Tol");
        } else if (barang.equalsIgnoreCase("ringan") && cuaca.equalsIgnoreCase("hujan") && laluLintas.equalsIgnoreCase("lancar")) {
            System.out.println("Jalan Pedesaan");
        } else if (barang.equalsIgnoreCase("berat") && cuaca.equalsIgnoreCase("hujan") && laluLintas.equalsIgnoreCase("macet") && kendaraan.equalsIgnoreCase("mobil")) {
            System.out.println("Jalan Lingkar");
        } else if (barang.equalsIgnoreCase("ringan") && cuaca.equalsIgnoreCase("cerah") && laluLintas.equalsIgnoreCase("macet")) {
            System.out.println("Jalan Ring Road");
        } else if (barang.equalsIgnoreCase("berat") && cuaca.equalsIgnoreCase("cerah") && laluLintas.equalsIgnoreCase("lancar") && kendaraan.equalsIgnoreCase("mobil")){
            System.out.println("Jalan Alternatif");
        } else {
            System.out.println("Jalan enampuluhenam");
        }
    }
}
