import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Input (jumblah awal) (menit)");
            int bakteri = scan.nextInt();
            int detik = scan.nextInt() * 60;
            int detik7 = 0;

        // Output

        while(detik >= 7){

            bakteri *= 2;
            detik7 += 7;
            detik -= 7;

            if(detik7 % 70 == 0 && detik7 % 140 != 0){
                bakteri--;
            }
        }

        System.out.println(bakteri);
    }
}