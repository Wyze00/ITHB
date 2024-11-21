import java.util.Scanner;

public class Soal2 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        int input = scan.nextInt();
        int counter = 2;

        while(counter <= input){            

            if(counter == 2){
                System.out.print("2 ");
                counter++;
                continue;
            }

            if(counter % 2 == 0){
                counter++;
                continue;
            }

            int temp = (counter+1)/2;

            while(temp < counter){

                if(counter % temp == 0){
                    break;
                }

                temp--;

                if(temp == 1){
                    System.out.printf("%d ", counter);
                }
            }

            counter++;
        }
    }
}
