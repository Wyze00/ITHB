import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int jMhs = 10;
        String nama[] = new String[jMhs];
        String hasil[] = new String[jMhs];
        int umur[] = new int[jMhs];
        double ipk[] = new double[jMhs];
        int ijazah[] = new int[jMhs];
        int sarjana[] = new int[jMhs];

        int cKeterima = 0, cKetolak = 0;


        for(int i = 0; i<jMhs; i++){

            nama[i] = scan.next();
            umur[i] = scan.nextInt();
            sarjana[i] = scan.nextInt();
            ipk[i] = scan.nextDouble();
            ijazah[i] = scan.nextInt();

            if(umur[i] < 18 || ipk[i] < 2.75 || ijazah[i] > 6){
                hasil[i] = "Tidak keterima";
                cKetolak++;
            } else if(sarjana[i] == 1 && umur[i] > 30 || sarjana[i] == 2 && umur[i] > 35 || sarjana[i] == 3 && umur[i] > 40){
                hasil[i] = "Tidak keterima";
                cKetolak++;
            } else {
                hasil[i] = "Keterima";
                cKeterima++;
            }
        }

        System.out.println("                                        Daftar Nilai\r\n" + //
                        "----------------------------------------------------------------------------------------\r\n" + //
                        "No.        Nama        Umur        Sarjana        IPK        Ijazah        Hasil\r\n" + //
                        "----------------------------------------------------------------------------------------");
        
        for(int i = 0; i<jMhs; i++){

            System.out.printf("%d        %s        %d        %d        %d        %d        %s\n",i,nama[i],umur[i],sarjana[i],ipk[i],ijazah[i],hasil[i]);

        }                
        
        System.out.println("Keterima : " + cKeterima);
        System.out.println("Ketolak : " + cKetolak);
    }
}