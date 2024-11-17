import java.util.Scanner;

public class Soal5 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int angka1 = scan.nextInt();
        int angka2 = angka1;
        int counter = 0;
        int hasil = 0;

        while(angka1 != 0){
            angka1 /= 10;
            counter++;
        }

        angka1 = angka2;

        while(angka2 != 0){

            int temp = angka2%10;
            int tempCounter = counter - 1;
            int tempHasil = temp;

            while(tempCounter != 0){
                tempHasil *= temp;
                tempCounter--;
            }

            hasil += tempHasil;
            angka2 /= 10;
        }

        if(angka1 == hasil){
            System.out.println("Bilangan Amstrong");
        } else {
            System.out.println("Bukan");
        }
    }  
}