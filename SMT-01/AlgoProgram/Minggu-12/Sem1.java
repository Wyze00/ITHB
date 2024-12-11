import java.util.Scanner;

public class Sem1 {

    String nama, nim;
    Nilai nilai = new Nilai();
    double IPK;

    static class Nilai {
        int[] SKS = {2, 4, 1, 3, 2, 2, 2, 2};
        int[] AA = new int[8];
        int[] INA = new int[8];
        String[] NA = new String[8];
    }

    public static void main(String[] args) {
     
        // Deklarasi
        Scanner scan = new Scanner(System.in);
        Sem1[] mhs = new Sem1[3];

        // Input
        for(int i = 0; i<3; i++){

            mhs[i] = new Sem1();
            mhs[i].nama = scan.next();
            mhs[i].nim = scan.next();

            for(int j = 0; j<8; j++){
                mhs[i].nilai.AA[i] = scan.nextInt();
                mhs[i].nilai.NA[i] = cariNA(mhs[i].nilai.AA[i]);
                mhs[i].nilai.INA[i] = cariINA(mhs[i].nilai.NA[i]);
                mhs[i].IPK += hitungTotal(mhs[i].nilai.INA[i], mhs[i].nilai.SKS[i]);
            }

            mhs[i].IPK /= totalSKS(mhs[i].nilai.SKS);
        }

        // Output
    }

    static String cariNA(int AA){

        if(AA >= 80){
            return "A";
        } else {
            return "E";
        }
    }

    static int cariINA(String NA){

        if(NA.equals("A")){
            return 4;
        } else {
            return 0;
        }
    }

    static double hitungTotal(int INA, int SKS){
        return INA * SKS;
    }

    static int totalSKS(int[] SKS){

        int total = 0;

        for(int i = 0; i<8; i++){
            total += SKS[i];
        }
        
        return total;
    }
}

