import java.util.Scanner;

public class Soal2 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double gaji = scan.nextInt();
        boolean NPWP = scan.nextBoolean();
        double persen = 1;

        double pajak = 0;
        int counter = 1;
        
        if(!NPWP){persen = 1.2;}

        while(counter != 6 && gaji > 0){

            if(counter == 1){

                if(gaji <= 60){
                    pajak = pajak + gaji * (0.05*persen);
                    gaji -= 60;

                } else {
                    pajak = pajak + 60 * (0.05*persen);
                    gaji -= 60;
                }

            } else if(counter == 2){

                if(gaji <= 190){
                    pajak = pajak + gaji * (0.15*persen);
                    gaji -= 190;

                } else {
                    pajak = pajak + 190 * (0.15*persen);
                    gaji -= 190;
                }
                
            } else if(counter == 3){

                if(gaji <= 250){
                    pajak = pajak + gaji * (0.25*persen);
                    gaji -= 250;

                } else {
                    pajak = pajak + 250 * (0.25*persen);
                    gaji -= 250;
                }

            } else if(counter == 4){

                if(gaji <= 4500){
                    pajak = pajak + gaji * (0.3*persen);
                    gaji -= 4500;

                } else {
                    pajak = pajak + 4500 * (0.3*persen);
                    gaji -= 4500;
                }

            } else if(counter == 5){

                pajak = pajak + gaji * (0.35*persen);
            }

            counter++;
        }

            System.out.printf("%.0f juta",pajak);
        }
    }
