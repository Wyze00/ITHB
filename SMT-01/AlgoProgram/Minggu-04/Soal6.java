import java.util.Scanner;

public class Soal6 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

       // Pohon

       for(int i = 1; i<=input; i++){

            for(int j = input-i; j>0; j--){
                System.out.print(" ");
            }

            for(int j = 1; j<i*2; j++){
                System.out.print("*");
            }

            System.out.println();
       }

       // Tangkai 

       for(int i = 1; i<=3; i++){

            for(int j = 1; j<=(input*2-3)/2; j++){

                System.out.print(" ");
            }

            for(int j = 1; j<=3; j++){

                System.out.print("*");
            }

            System.out.println();
       }
    }
}
