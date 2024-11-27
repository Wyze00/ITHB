import java.util.Scanner;

public class NilaiMhs {
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
        NilaiMhs mhs = new NilaiMhs();
       
        // baca data
        mhs.nil1 = scan.nextInt();
        mhs.nil2 = scan.nextInt();
        mhs.nil3 = scan.nextInt();
        mhs.nil4 = scan.nextInt();
        mhs.nil5 = scan.nextInt();


        // hitung
        mhs.rQuis = rataQuis(mhs.nil1, mhs.nil2, mhs.nil3, mhs.nil4, mhs.nil5);
        mhs.nilAkhir = angkaAkhir(mhs.rQuis, mhs.nilUTS, mhs.nilUAS);
        mhs.nilMutu = nilaiMutu(mhs.nilAkhir);
               
        //cetak hasil
       
        System.out.println(mhs.rQuis);
        System.out.println(mhs.nilAkhir);
        System.out.println(mhs.nilMutu);
    }           
}