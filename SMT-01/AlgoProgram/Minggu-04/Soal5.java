import java.util.Scanner;

public class Soal5 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int lebar = scan.nextInt();
        int tinggi = scan.nextInt();
        int tebal = scan.nextInt();
        char karakter = scan.next().charAt(0);

        // Atas

        for(int i = 1; i<=(tinggi-3)/2; i++){

            for(int j = 1; j<=lebar; j++){

                System.out.print(karakter);
            }

            System.out.println();
        }

        // Tengah 

        for(int i = 1; i<=tinggi/2; i++){

            for(int j = 1; j<=tebal; j++){
                System.out.print(karakter);
            }

            for(int j = 1; j<=lebar-tebal*2; j++){
                System.out.print(" ");
            }

            for(int j = 1; j<=tebal; j++){
                System.out.print(karakter);
            }

            System.out.println();
        }

        // Bawah

        for(int i = 1; i<=(tinggi-3)/2; i++){

            for(int j = 1; j<=lebar; j++){

                System.out.print(karakter);
            }

            System.out.println();
        }
    }
}
