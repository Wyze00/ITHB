import java.util.Scanner;

public class Soal4 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        // 4a

        for(int i = 1; i<=input; i++){

            for(int j = 1; j<=i; j++){

                System.out.print(i);
            }

            System.out.println();
        }

        System.out.println();

        // 4b

        for(int i = 1; i<=input; i++){

            for(int j = 1; j<=i; j++){

                System.out.print(j);
            }

            System.out.println();
        }

        System.out.println();
        
        // 4c

        int counter = 1;

        for(int i = 1; i<=input; i++){

            for(int j = 1; j<=i; j++){

                System.out.print(counter%10);
                counter++;
            }

            System.out.println();
        }

        System.out.println();

        // 4d

        for(int i = 1; i<=input; i++){

            for(int j = 1; j<=i; j++){

                System.out.print(i);
            }

            System.out.println();
        }

        for(int i = input-1; i>0; i--){

            for(int j = 1; j<=i; j++){

                System.out.print(i);
            }

            System.out.println();
        }

        System.out.println();

        // 4e

        for(int i = 1; i<=input; i++){

            for(int j = input-i; j>0; j--){

                System.out.print(" ");
            }

            for(int j = 1; j<=i; j++){

                System.out.print(i);
            }

            System.out.println();
        }

        for(int i = input-1; i>0; i--){

            for(int j = input-i; j>0; j--){

                System.out.print(" ");
            }

            for(int j = 1; j<=i; j++){

                System.out.print(i);
            }

            System.out.println();
        }
    }
}
