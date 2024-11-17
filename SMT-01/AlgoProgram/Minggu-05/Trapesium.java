import java.util.Scanner;

public class Trapesium {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        // Trapesium Penuh

        // Atas

        for(int i = 1; i<=input; i++){
            System.out.print("*");
        }

        System.out.println();

        // Tengah

        for(int i = 1; i<=input-2; i++){

            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j<=input; j++){
                System.out.print("*");
            }


            System.out.println();
        }


        // Bawah

        for(int i = 1; i<=input-1; i++){
            System.out.print(" ");
        }

        for(int i = 1; i<=input; i++){
            System.out.print("*");
        }

        System.out.println("\n");

        // Trapesium Bolong

        // Atas

        for(int i = 1; i<=input; i++){
            System.out.print("*");
        }

        System.out.println();

        // Tengah

        for(int i = 1; i<=input-2; i++){

            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }

            System.out.print("*");

            for(int j = 1; j<=input-2; j++){
                System.out.print(" ");
            }

            System.out.print("*");

            System.out.println();
        }


        // Bawah

        for(int i = 1; i<=input-1; i++){
            System.out.print(" ");
        }

        for(int i = 1; i<=input; i++){
            System.out.print("*");
        }

    }
}