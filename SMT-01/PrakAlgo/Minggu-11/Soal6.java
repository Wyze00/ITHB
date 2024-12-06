import java.util.Scanner;

public class Soal6 {
    
   
    public static int rataQuis(int[] quis) {

        int res = 0;

        for(int i = 0; i<5; i++){
            res += quis[i];
        }

        return (res) / quis.length;
    }

    public static double angkaAkhir(double rataQuis, int UTS, int UAS) {
        return (rataQuis * 0.2) + (UTS * 0.3) + (UAS * 0.5);
    }

    public static char nilaiMutu(int rataQuiz, int UTS, int UAS) {

        int angkaAkhir = (rataQuiz + UTS + UAS)/3;

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
        Mahasiswa[] mhs = new Mahasiswa[scan.nextInt()];
    
        // baca data

        for (int i = 0; i < mhs.length; i++) {
            
            mhs[i] = new Mahasiswa();

            for(int j = 0; j<5; j++){
                mhs[i].quiz[j] = scan.nextInt();
            }

            mhs[i].nilai[0] = rataQuis(mhs[i].quiz);
            mhs[i].nilai[1] = scan.nextInt();
            mhs[i].nilai[2] = scan.nextInt();
            mhs[i].nilMutu = nilaiMutu(mhs[i].nilai[0], mhs[i].nilai[1], mhs[i].nilai[2]);
        }
    }    
}

class Mahasiswa {
    int[] quiz = new int[5];
    int[] nilai = new int[3];
    char nilMutu;
}