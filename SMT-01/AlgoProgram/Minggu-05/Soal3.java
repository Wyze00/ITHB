import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int angka = scan.nextInt();
        int hasil = 0;

        while(angka != 0){

            hasil = hasil*10 + (angka%10);
            angka /= 10;
        }

        System.out.println(hasil);
    }  
}
