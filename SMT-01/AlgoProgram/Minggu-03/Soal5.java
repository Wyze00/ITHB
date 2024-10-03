import  java.util.Scanner;

public class Soal5 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int umur = scan.nextInt();

        if(umur >= 0 && umur <= 5){System.out.println("Balita");}
        else if(umur >= 6 && umur <= 12){System.out.println("Anak");}
        else if(umur >= 13 && umur <= 18){System.out.println("Remaja");}
        else if(umur >= 19 && umur <= 25){System.out.println("Pemuda");}
        else if(umur >= 26 && umur <= 55){System.out.println("Dewasa");}
        else{System.out.println("Tua");}
    }
}