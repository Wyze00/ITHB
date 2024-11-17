import java.util.Scanner;

public class Soal3 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        int a = 1, b = 1;
        
        if(input >= 1){
            System.out.println(a);
        }

        if(input >= 2){
            System.out.println(b);
        }

        for(int i = 2; i<input; i++){

            int temp = a + b;

            System.out.println(temp);

            a = b;
            b = temp;
       }
    }
}
