import java.util.Scanner;

public class Soal2 {
    
    
    public static void main(String[] args){

         Scanner scan = new Scanner(System.in);

         int input = scan.nextInt();
         int hasil = 0;

        for(int i = 1; i<=input; i+=2){

            hasil += i;
        }

        System.out.println(hasil);
    }
}
