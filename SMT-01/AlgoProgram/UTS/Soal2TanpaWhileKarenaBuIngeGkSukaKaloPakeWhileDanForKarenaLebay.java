import java.util.Scanner;

public class Soal2TanpaWhileKarenaBuIngeGkSukaKaloPakeWhileDanForKarenaLebay {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Input

        System.out.print("Masukkan gaji : ");
            double gaji = scan.nextInt();
             double tempGaji = gaji;

        System.out.print("Apakah punya NPWP (true / false) : ");
            boolean NPWP = scan.nextBoolean();

        double persen = 1;
        double pajak = 0;
        
        if(!NPWP){persen = 1.2;} // Kalo false maka 120%;

        // Logic
        
        if(gaji <= 60){
            pajak = pajak + gaji * (0.05*persen);
            gaji = 0;

        } else {
            pajak = pajak + 60 * (0.05*persen);
            gaji -= 60;
        }

        if(gaji <= 190){
            pajak = pajak + gaji * (0.15*persen);
            gaji = 0;

        } else {
            pajak = pajak + 190 * (0.15*persen);
            gaji -= 190;
        }           

        if(gaji <= 250){
            pajak = pajak + gaji * (0.25*persen);
            gaji = 0;

        } else {
            pajak = pajak + 250 * (0.25*persen);
            gaji -= 250;
        }

        if(gaji <= 4500){
            pajak = pajak + gaji * (0.3*persen);
            gaji = 0;

        } else {
            pajak = pajak + 4500 * (0.3*persen);
            gaji -= 4500;
        }

        pajak = pajak + gaji * (0.35*persen);
            
        // Output

        System.out.printf("Dengan gaji %.0f juta, pajak yang harus dibayar adalah : %.0f juta",tempGaji,pajak);
    }
}
