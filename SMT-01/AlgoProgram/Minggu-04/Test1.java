import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int bintang = 7;
        int baris = 3;

        for(int i = 1; i<baris+1; i++){

            for(int j = 0; j<bintang-i; j++){
                System.out.print('*');
            }

            for (int j = 1; j<i*2 ; j++) {
                System.out.print('=');
            }

            for(int j = 0; j<bintang-i; j++){
                System.out.print('*');
            }

            System.out.println();
        }
    }
}