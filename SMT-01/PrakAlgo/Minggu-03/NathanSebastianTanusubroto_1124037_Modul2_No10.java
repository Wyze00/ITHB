import  java.util.Scanner;

public class NathanSebastianTanusubroto_1124037_Modul2_No10 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Bantu Thomas memilih makanannya : "); // Makanan Berat, Makanan Ringan, Jajan
        System.out.print("Pilih jenis makanan : ");
            String jenis_makanan = scan.nextLine();

        System.out.print("Saldo ATM : ");
            double saldo = scan.nextDouble();

        System.out.print("Kondisi Fisik (sehat/sakit) : ");
            String kondisi = scan.next();
        System.out.println();


        // Makanan

        Makanan[] makanan = {
            new Makanan("Suka Rasa","Makanan Berat",15_000,150),
            new Makanan("Warmindo Betuah","Makanan Berat",20_000,200),
            new Makanan("Richesse","Makanan Berat",30_000,300),
            new Makanan("Yez","Makanan Berat",10_000,300),
            new Makanan("Indomie","Makanan Berat",5_000,200),
            new Makanan("Kebab","Makanan Ringan",30_000,400),
            new Makanan("Batagor","Makanan Ringan",10_000,200),
            new Makanan("Mixue","Jajan",15_000,350),
            new Makanan("Gelato","Jajan",30_000,50),
            new Makanan("Roti kukus","Jajan",6_000,150),
        };

        // Output

        System.out.println("Sumarry");
        System.out.println("Tipe          : " + jenis_makanan);
        System.out.println("Saldo ATM     : Rp " + (int) saldo);
        System.out.println("Kondisi badan : " + (kondisi.equals("sehat") ? "fit" : "tidak fit"));
        System.out.print("Output        : ");
        output(jenis_makanan, saldo, kondisi,makanan);
    }

    static void output(String jenis_makanan, double saldo, String kondisi,Makanan[] makanan){

        int counter = 0;

        for(Makanan mkn : makanan){

            if(mkn.tipe.equals(jenis_makanan)) {

                if(mkn.jarak < (kondisi.equals("sehat") ? 999 : 200)) {

                    if( saldo > 1_000_000 ? mkn.budget >= 25_000 : saldo >= 500_000 ? mkn.budget >= 10_000 && mkn.budget < 25_000 : mkn.budget < 10_000 ) {

                        System.out.print("(" + mkn.nama + ") ");
                        counter++;
                    }
                }
            }
        }

        if(counter == 0){
            System.out.println("Tidak Jadi Makan");
        }
    }
}

