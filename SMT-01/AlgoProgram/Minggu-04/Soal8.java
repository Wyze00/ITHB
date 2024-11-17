import java.util.Scanner;

public class Soal8 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int lebar = scan.nextInt();
        int tinggi = scan.nextInt();
        int tebal = scan.nextInt();
        char karakter = scan.next().charAt(0);

        // T

        for(int i = 1; i<=tinggi/3; i++){

            for(int j = 1; j<=lebar; j++){
                System.out.print(karakter);
            }

            System.out.println();
        }

        for(int i = 1; i<=tinggi*2/3; i++){

            for(int j = 1; j<=(lebar-tebal)/2; j++){

                System.out.print(" ");
            }

            for(int j = 1; j<=tebal; j++){

                System.out.print(karakter);
            }

            System.out.println();
       }

       System.out.println("\n");

       // L

       for(int i = 1; i<=tinggi*2/3; i++){

            for(int j = 1; j<=tebal; j++){

                System.out.print(karakter);
            }

            System.out.println();
       }

       for(int i = 1; i<=tinggi/3; i++){

            for(int j = 1; j<=lebar; j++){
                System.out.print(karakter);
            }

            System.out.println();
        }

        System.out.println("\n");
        
        // H

        for(int i = 1; i<=tinggi/3; i++){

            for(int j = 1; j<=tebal; j++){

                System.out.print(karakter);
            }

            for(int j =1; j<=lebar-(tebal*2); j++){

                System.out.print(" ");
            }

            for(int j = 1; j<=tebal; j++){

                System.out.print(karakter);
            }

            System.out.println();
       }

       for(int i = 1; i<=tinggi/3; i++){

            for(int j = 1; j<=lebar; j++){
                System.out.print(karakter);
            }

            System.out.println();
        }

        for(int i = 1; i<=tinggi/3; i++){

            for(int j = 1; j<=tebal; j++){

                System.out.print(karakter);
            }

            for(int j =1; j<=lebar-(tebal*2); j++){

                System.out.print(" ");
            }

            for(int j = 1; j<=tebal; j++){

                System.out.print(karakter);
            }

            System.out.println();
       }

        System.out.println("\n");
    }
}
