import java.util.Scanner;

public class Soal2C {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n = 4;

        for(int i = n; i>=1; i--){


            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            for(int j = 1; j<=(n*2)-(i*2); j++){
                System.out.print(" ");
            }

            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}