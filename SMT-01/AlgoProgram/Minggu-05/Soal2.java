import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int angka = scan.nextInt();
        int radix = scan.nextInt();
        int pengkali = 1;
        int hasil = 0;

        while(angka != 0){

            int temp = angka % radix;
            hasil = hasil + (temp * pengkali);
            pengkali *= 10;
            angka /= radix;
        }

        System.out.println(hasil);
    }  
}
