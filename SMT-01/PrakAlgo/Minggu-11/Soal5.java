import java.util.Scanner;

class Tol {
    char masuk, keluar;
}

class Kendaraan {
    String plat;
    int biaya;
    Tol tol;
}

public class Soal5 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Kendaraan[] dataTol = new Kendaraan[scan.nextInt()];
        // Plat 4 huruf

        for(int i = 0; i < dataTol.length; i++){
            dataTol[i] = new Kendaraan();
            input(dataTol[i]);
        }

        System.out.printf("Plat        Masuk    Keluar   Biaya\n"); 

        for(int i = 0; i< dataTol.length; i++){
            Kendaraan temp = dataTol[i];
            System.out.printf("%s        %c        %c        %d\n", temp.plat, temp.tol.masuk, temp.tol.keluar, temp.biaya);
        }

        System.out.println("Total Biaya : " + dapatTotal(dataTol));
    }

    static void input(Kendaraan kendaraan){

        kendaraan.plat = scan.next();
        kendaraan.tol = new Tol();
        kendaraan.tol.masuk = scan.next().charAt(0);
        kendaraan.tol.keluar = scan.next().charAt(0);

        while(kendaraan.tol.masuk == kendaraan.tol.keluar){
            kendaraan.tol.keluar = scan.next().charAt(0);
        }

        kendaraan.biaya = dapatHarga(kendaraan.tol.masuk, kendaraan.tol.keluar);
    }

    static int dapatHarga(int masuk, int keluar){

        if(masuk == 'A'){

            switch (keluar) {
                case 'B':
                    return 1400;
                case 'C':
                    return 5800;
                case 'D':
                    return 3500;
                case 'E': 
                    return 7000;                    
            }

        } else if(masuk == 'B') {

            switch (keluar) {
                case 'A':
                    return 100;
                case 'C':
                    return 10500;
                case 'D':
                    return 9800;
                case 'E': 
                    return 2000;                    
            }

        } else if(masuk == 'C') {

            switch (keluar) {
                case 'A':
                    return 2000;
                case 'B':
                    return 8700;
                case 'D':
                    return 2300;
                case 'E': 
                    return 3400;                    
            }

        } else if(masuk == 'D') {

            switch (keluar) {
                case 'A':
                    return 6500;
                case 'B':
                    return 5000;
                case 'C':
                    return 8000;
                case 'E': 
                    return 9000;                    
            }

        } else {

            switch (keluar) {
                case 'A':
                    return 3210;
                case 'B':
                    return 6000;
                case 'C':
                    return 7000;
                default: 
                    return 10000;                    
            }
        }
        return 1;
    }
    
    static int dapatTotal(Kendaraan[] kendaraan){

        int total = 0;

        for(int i = 0; i < kendaraan.length; i++){
            total += kendaraan[i].biaya;
        }

        return total;
    }
}