import java.util.Scanner;

public class Soal2A {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        // Input 

        System.out.print("Masukkan angka : ");
            int input = scan.nextInt();

        // Output

        // # atas

        for(int i = 0; i<=11; i++){
            System.out.print("# ");
        }

        System.out.println();

        // Tengah

        while(input != 0){

            int temp = input%10;

            System.out.print("# ");
            
            for(int i = 1; i<= temp; i++){
                System.out.print("@ ");
            }

            for(int i = 1; i<= 10-temp; i++){
                System.out.print("  ");
            }

            System.out.print("# ");


        System.out.println();
            input /= 10;
        }

        // # Bawah

        
        for(int i = 0; i<=11; i++){
            System.out.print("# ");
        }
    }
}