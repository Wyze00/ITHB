import java.util.Scanner;

public class Diamond {
  
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();


        // Diamond penuh

        // Atas

        for(int i = 1; i<=input; i++){

            for(int j = input-i; j>=1; j--){

                System.out.print(" ");

            }

            for(int j = 1; j<i*2; j++){
                System.out.print("*");
            }


            System.out.println();
        }

        // Bawah

        for(int i = input-1; i>=1; i--){

            for(int j = input-i; j>=1; j--){

                System.out.print(" ");

            }

            for(int j = 1; j<i*2; j++){
                System.out.print("*");
            }


            System.out.println();
        }

        // Diamond kosong

        // Atas

        for(int i = 1; i<=input; i++){

            for(int j = input-i; j>=1; j--){

                System.out.print(" ");

            }

            for(int j = 1; j<i*2; j++){
                System.out.print("*");
            }


            System.out.println();
        }

        // Bawah

        for(int i = input-1; i>=1; i--){

            for(int j = input-i; j>=1; j--){

                System.out.print(" ");

            }

            for(int j = 1; j<i*2; j++){
                System.out.print("*");
            }


            System.out.println();
        }

    }
}
