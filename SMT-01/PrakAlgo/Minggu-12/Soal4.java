import java.util.Arrays;
import java.util.Scanner;

public class Soal4 {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    // System.out.println("Masukkan panjang array : ");

    int[] test = new int[100];

    for(int i = 0; i<100; i++){
      test[i] = (int) Math.ceil(Math.random()*300);
    }
    
    int[] res = new int[test.length];
    int c2 = 0;

    for (int i = 1; i < 10; i++) {

      int ctr = 0;
      for (int j = 0; j < test.length; j++) {

        int temp = test[j];
        while (temp / 10 != 0) {
          temp /= 10;
        }

        if (temp == i) {
          ctr++;
        }
      }

      int[] tmp = new int[ctr];
      ctr = 0;

      for (int j = 0; j < test.length; j++) {

        int temp = test[j];
        
        while (temp / 10 != 0) {
          temp /= 10;
        }

        if (temp == i) {
          tmp[ctr] = test[j];
          ctr++;
        }
      }

      for (int j = 0; j < tmp.length-1; j++) {

        if (tmp.length == 1) {
          break;
        }

        int min = j;
        for (int k = j + 1; k < tmp.length; k++) {
          if (tmp[k] < tmp[min]) {
            min = k;
          }
        }

        int temp = tmp[min];
        tmp[min] = tmp[j];
        tmp[j] = temp;
      }

      for (int j = 0; j < tmp.length; j++) {
        res[c2] = tmp[j];
        c2++;
      }
    }

    System.out.println(Arrays.toString(res));
  }
}