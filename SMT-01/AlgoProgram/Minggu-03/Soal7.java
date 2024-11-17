import  java.util.Scanner;
import java.util.Arrays;

public class Soal7 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] nilai = new int[5];

        System.out.println("Masukkan nilai : ");

        for(int i = 0; i<5; i++){
            nilai[i] = scan.nextInt();
        }

        Arrays.sort(nilai);

        for(int i = 4; i>0; i--){
            System.out.println("Nilai ke " + (5-i) + " : " + nilai[i]);
        }
    }
}