import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] paslon = {0,0,0};

        int suara = scan.nextInt();

        do {

            paslon[suara-1]++;
            
            suara = scan.nextInt();

        } while(suara != 0);

        for(int i = 0; i<paslon.length; i++){
            System.out.println(paslon[i]);
        }
    }
}