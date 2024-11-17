import java.util.Scanner;

public class Soal7 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

       // Atas

       for(int i = 1; i<=input; i++){

            for(int j = input-i; j>0; j--){
                System.out.print(" ");
            }

            for(int j = 1; j<i*2; j++){
                
                if(j%2 == 1){

                    System.out.print("*");

                } else {

                    System.out.print(" ");
                }
            }

            System.out.println();
       }

       // Bawah

        for(int i = input-1; i>0; i--){

            for(int j = input-i; j>0; j--){
                System.out.print(" ");
            }

            for(int j = 1; j<i*2; j++){
                
                if(j%2 == 1){

                    System.out.print("*");

                } else {

                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
