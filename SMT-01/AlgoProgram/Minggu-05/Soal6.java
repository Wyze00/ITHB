import java.util.Scanner;

public class Soal6 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double input = scan.nextInt();
        double hasil = 0;

        while(input != 0){

            if(input%2 == 0){
                hasil -= 1/input;
            }else {
                hasil+= 1/input;
            }

            input--;
        }

        System.out.println(hasil);
    }  
}
