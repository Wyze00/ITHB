import java.util.Scanner;

public class TabelMhs {
    int nil1, nil2, nil3 , nil4, nil5, nilUTS, nilUAS;
    double rQuis, nilAkhir;
    char nilMutu;
   
    public static double rataQuis(int nilai1, int nilai2, int nilai3, int nilai4, int nilai5) {

        int terkecil = 101;

        if(nilai1 < terkecil){
            terkecil = nilai1;
        }

        if(nilai2 < terkecil){
            terkecil = nilai2;
        }

        if(nilai3 < terkecil){
            terkecil = nilai3;
        }

        if(nilai4 < terkecil){
            terkecil = nilai4;
        }

        if(nilai5 < terkecil){
            terkecil = nilai5;
        }

        return (nilai1 + nilai2 + nilai3 + nilai4 + nilai5 - terkecil) / 4;
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
        TabelMhs[] mhs = new TabelMhs[scan.nextInt()];
    
        // baca data

        for (int i = 0; i < mhs.length; i++) {
            
            mhs[i].nil1 = scan.nextInt();
            mhs[i].nil2 = scan.nextInt();
            mhs[i].nil3 = scan.nextInt();
            mhs[i].nil4 = scan.nextInt();
            mhs[i].nil5 = scan.nextInt();
            mhs[i].nilUTS = scan.nextInt();
            mhs[i].nilUAS = scan.nextInt();
            mhs[i].rQuis = rataQuis(mhs[i].nil1, mhs[i].nil2, mhs[i].nil3, mhs[i].nil4, mhs[i].nil5);
            mhs[i].nilAkhir = angkaAkhir(mhs[i].rQuis, mhs[i].nilUTS, mhs[i].nilUAS);
            mhs[i].nilMutu = nilaiMutu(mhs[i].nilAkhir);
            
        }
    }           
}
