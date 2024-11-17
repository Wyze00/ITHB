import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int p1 = 0, p2 = 0, p3 = 0;

        int paslon = scan.nextInt();

        while(paslon != 0){

            if(paslon == 1){p1++;}
            else if(paslon == 2){p2++;}
            else if(paslon == 3){p3++;}

            paslon = scan.nextInt();
        }

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}