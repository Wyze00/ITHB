import  java.util.Scanner;

public class Soal5 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int umur = scan.nextInt();
        String jenis;

        if(umur >= 0 && umur <= 5){jenis = "Balita";}
        else if(umur >= 6 && umur <= 12){jenis = "Anak";}
        else if(umur >= 13 && umur <= 18){jenis = "Remaja";}
        else if(umur >= 19 && umur <= 25){jenis = "Pemuda";}
        else if(umur >= 26 && umur <= 55){jenis = "Dewasa";}
        else{jenis = "Tua";}

        if(umur >= 55){
            System.out.println("Tua");
        } else if(umur >= 26){
            System.out.println("Dewasa");
        } else if(umur >= 19){
            System.out.println("Pemuda");
        } else if(umur >= 13){
            System.out.println("Remaja");
        } else if(umur >= 6){
            System.out.println("Anak`");
        } else {
            System.out.println("Balita");
        }
    }
}