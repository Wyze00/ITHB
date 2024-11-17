import java.util.Scanner;

public class NathanSebastianTanusubroto_1124037_Modul2_No4 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // Input 

        String jenis_kamar;
        int lama_inap;
        double harga;
        double pajak;

        System.out.println("Masukkan jenis kamar : "); 
        System.out.println("Deluxe");
        System.out.println("Executive");
        System.out.println("Suite");
            jenis_kamar = scan.next();
        System.out.println();

        switch (jenis_kamar) {
            case "Deluxe" :
                pajak = 0.1;
                break;
            case "Executive" :
                pajak = 0.15;
                break;
            case "Suite" :
                  pajak = 0.2;
                break;
            default :
              throw new Error("Salah input");  
                     
        }

        System.out.println("Berapa lama ? : ");
            lama_inap = scan.nextInt();
        System.out.println();

        System.out.println("Masukkan harga : ");
            harga = scan.nextFloat();
        System.out.println();

        // Output 

        System.out.println("Sumarry");
        System.out.println("Kamar yang dipilih : " + jenis_kamar);
        System.out.println("Total hari : " + lama_inap);
        System.out.println("Total harga : " + (double) (harga * lama_inap * (1+pajak)));
    }
}
