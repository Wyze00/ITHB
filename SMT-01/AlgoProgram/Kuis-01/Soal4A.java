import java.util.Scanner;

public class Soal4A {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan (awal) (akhir) (step)");
            int awal = scan.nextInt();
            int akhir = scan.nextInt();
            int step = scan.nextInt();
            int temp = awal + step;

        while(awal <= akhir){

            System.out.printf("%d ",awal);
            awal += temp;
            temp += step;

        }
    }
}