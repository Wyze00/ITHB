import java.util.Scanner;

public class Soal2B {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan input : ");
            int input = scan.nextInt();

        // Output

        int counter = 1;
        
        for(int i = 1; i<= input; i++){

            for(int j = 1; j<= input; j++){

                int temp = counter + input -1;

                if(i % 2 != 0){
                    System.out.print(counter%10 + " ");
                    counter++;
                } else { 
                    System.out.print(temp%10 + " ");
                    temp--; 
                    counter--;  
                    if(j == input){counter += input*2;}
                }
            }

            System.out.println();            
        }
    }
}