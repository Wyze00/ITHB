import java.util.Scanner;

public class Test2 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int waktu = scan.nextInt();
        int awal = scan.nextInt();
        int akhir = scan.nextInt();
        int counter = 0;

        while(awal < akhir){
            awal = awal * 2;
            counter = counter + waktu;
        }

        System.out.println();
        System.out.println(counter + " Menit");
    }
}
