import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int pinAsli = scan.nextInt();
        int kesempatan = 3;
        boolean salah = true;

        while(kesempatan != 0 && salah == true){

            salah = scan.nextInt() == pinAsli ? false : true;

            kesempatan--;
        }
    }  
}
