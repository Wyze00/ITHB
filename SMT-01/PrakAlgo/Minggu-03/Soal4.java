import java.util.Scanner;

public class Soal4 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // Input 

        String jenis_kamar;
        int lama_inap;
        double harga;
        double total_diskon;

        System.out.println("Masukkan jenis kamar : "); 
        System.out.println("Deluxe");
        System.out.println("Executive");
        System.out.println("Suite");
            jenis_kamar = scan.next();
        System.out.println();

        switch (jenis_kamar) {
            case "Deluxe" :
                total_diskon = 0.9;
                break;
            case "Executive" :
                total_diskon = 0.85;
                break;
            case "Suite" :
                  total_diskon = 0.8;
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
        System.out.println("Total harga : " + (double) (harga * lama_inap * total_diskon));
    }
}
