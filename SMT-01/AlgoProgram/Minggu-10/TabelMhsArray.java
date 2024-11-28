import java.util.Scanner;

public class TabelMhsArray {
    int[] quiz = new int[5];
    int nilUTS, nilUAS;
    double rQuis, nilAkhir;
    char nilMutu;
   
    public static double rataQuis(int[] quis) {

        int terkecil = 101;
        int res = 0;

        for(int i = 0; i<5; i++){
            res += quis[i];

            if(quis[i] < terkecil){
                terkecil = quis[i];
            }
        }

        return (res - terkecil) / 4;
    }

    public static double angkaAkhir(double rataQuis, int UTS, int UAS) {
        return (rataQuis * 0.2) + (UTS * 0.3) + (UAS * 0.5);
    }

    public static char nilaiMutu(double angkaAkhir) {
        if(angkaAkhir >= 80){
            return 'A';
        } else {
            if(angkaAkhir >= 70){
                return  'B';
            } else {
                if(angkaAkhir >= 60){
                    return 'C';
                } else {
                    if(angkaAkhir >= 50){
                        return 'D';
                    } else {
                        return  'E';
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
               
        // deklarasi
        TabelMhsArray[] mhs = new TabelMhsArray[scan.nextInt()];
    
        // baca data

        for (int i = 0; i < mhs.length; i++) {
            

            for(int j = 0; j<5; j++){
                mhs[i].quiz[j] = scan.nextInt();
            }

            mhs[i].nilUTS = scan.nextInt();
            mhs[i].nilUAS = scan.nextInt();
            mhs[i].rQuis = rataQuis(mhs[i].quiz);
            mhs[i].nilAkhir = angkaAkhir(mhs[i].rQuis, mhs[i].nilUTS, mhs[i].nilUAS);
            mhs[i].nilMutu = nilaiMutu(mhs[i].nilAkhir);
        }
    }    
}