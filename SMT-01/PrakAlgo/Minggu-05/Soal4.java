import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int temp;
        int counter = 0;

        do { 

            if(counter != 0){
                System.out.println("Angka harus positif. Silahkan coba lagi.");
            }

            System.out.print("Masukkan angka positif : ");
                temp = scan.nextInt();
                counter++;
            
        } while (temp < 0);

        System.out.println("Terima kasih! Anda telah memasukkan angka positif.");
    }
}
