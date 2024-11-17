import java.util.Scanner;

public class Soal7 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        System.out.println(input);

        while(input != 1){

            input = input%2 == 0 ? input/2 : input*3+1;

            System.out.println(input);
        }
    }  
}
