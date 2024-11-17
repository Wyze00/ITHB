import java.util.Scanner;

public class Soal2A {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        // Atas 

        for(int i = 1; i<=input*2; i++){
            System.out.print("^");
        }

        System.out.println();

        // Tengah 1

        int counter1 = 1;

        for(int i = 1; i<= input; i++){

            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            for(int j = 1; j<= input*2-(i*2); j++){
                System.out.print(counter1%10);
                counter1++;
            }

            for(int j = 1; j<=i; j++){
                System.out.print("^");
            }

            System.out.println();
        }

        // Tengah 2

        int counter2 = 100;

        for(int i = input-1; i>=1; i--){

            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            for(int j = 1; j<= input*2-(i*2); j++){
                System.out.print(counter2%10);
                counter2--;
            }

            for(int j = 1; j<=i; j++){
                System.out.print("^");
            }

            System.out.println();
        }

        // Bawah

        for(int i = 1; i<=input*2; i++){
            System.out.print("*");
        }

        System.out.println();
    }
}