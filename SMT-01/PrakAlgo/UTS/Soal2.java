import java.util.Scanner;

public class Soal2 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Nilai : ");
            int n = scan.nextInt();

        String str = n + " ";

        while(n != 1){

            if(n % 2 == 0){
                n /= 2;
            } else {
                n = n * 3 + 1;
            }

            str = n + " " + str;
        }
        System.out.println(str);
    }
}
