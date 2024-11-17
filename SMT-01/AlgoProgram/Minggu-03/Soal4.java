import  java.util.Scanner;

public class Soal4 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int hari1 = scan.nextInt();
        int hari2 = scan.nextInt();

        if(hari1 == hari2){System.out.println("7 Hari");}

        if(hari2 > hari1){System.out.println("" + (hari2-hari1) + " Hari");}
        
        else {

            System.out.println("" + (7 - hari1 + hari2) + " Hari");
        } 
    }
}