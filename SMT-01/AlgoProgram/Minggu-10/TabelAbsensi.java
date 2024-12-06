import  java.util.Scanner;

public class TabelAbsensi {

    String NIP = "", nama = "";
    int hari[] = new int[7]; 
    int UPJ= 0;
    double upah[] = new double[4];

    static double hitungUpahNormal(int hari[], int UPJ){

        int totalJam = 0;

        for(int i = 0; i<5; i++){
            totalJam += hari[i];
        }

        if(totalJam > 40){
            return 40 * UPJ;
        } else {
            return totalJam * UPJ;
        }
    }

    static double hitungUpahLembur(int hari[], int UPJ){
        
        int totalJam = 0;

        for(int i = 0; i<5; i++){
            totalJam += hari[i];
        }

        if(totalJam > 40){
            return (totalJam % 40) * UPJ * 1.5;
        } else {
            return 0;
        }
    }

    static double hitungUpahWeekend(int hari[], int UPJ){
        
        int totalJam = 0;

        for(int i = 5; i<7; i++){
            totalJam += hari[i];
        }
        
        return totalJam * UPJ * 2;
    }

    static double hitungUpahTotal(double upah[]){
        return upah[0] + upah[1] + upah[2];
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Input
        System.out.println("Masukkan banyak orang : ");

        TabelAbsensi[] pekerja = new TabelAbsensi[scan.nextInt()];

        // Logic

        for(int i = 0; i<pekerja.length; i++){

            pekerja[i] = new TabelAbsensi();
            pekerja[i].nama = scan.next();
            pekerja[i].NIP = scan.next();
            pekerja[i].UPJ = scan.nextInt();

            for(int j = 0; j<7; j++){
                pekerja[i].hari[j] = scan.nextInt();
            }

            pekerja[i].upah[0] = hitungUpahNormal(pekerja[i].hari, pekerja[i].UPJ);
            pekerja[i].upah[1] = hitungUpahLembur(pekerja[i].hari, pekerja[i].UPJ);
            pekerja[i].upah[2] = hitungUpahWeekend(pekerja[i].hari, pekerja[i].UPJ);
            pekerja[i].upah[3] = hitungUpahTotal(pekerja[i].upah);
        }
    }
}
