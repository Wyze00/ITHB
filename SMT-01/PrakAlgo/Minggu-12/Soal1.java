import java.util.Arrays;
import java.util.Scanner;

public class Soal1 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Masukkan N");
    int[] tembok = new int[scan.nextInt()];

    for(int i = 0; i<tembok.length-1; i++){
      System.out.println("Mau ada tembok di index : " + (i+1) + " ?");
      tembok[i] = scan.nextInt();
    }

    tembok[tembok.length-1] = 1;

    int ctr = 0;

    for(int i = 0; i<tembok.length-1; i++){

      if(tembok[i] == 1){

        int current = i+1;
        while(tembok[current] == 0){
          ctr++;
          current++;
        }
      }
      
    }

    System.out.println("Yang bisa disimpen : " + ctr);
  }
}