import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int term = scan.nextInt();
        int ganjil = 1;
        int hasil = 0;

        while(hasil < term){
            hasil += ganjil;
            ganjil += 2;
        }

        System.out.println(hasil);
    }  
}
