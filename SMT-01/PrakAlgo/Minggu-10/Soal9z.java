import java.util.Scanner;

public class Soal9z {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    int[] array1 = { 1, 2, 3, 4, 5 };
    int[] array2 = { 1, 2, 3, 4, 5 };

    int[] hasil = new int[array1.length];

    for (int i = 0; i < array1.length; i++) {

      int temp = 0;

      for (int j = 0; j < array2.length; j++) {
        temp += array1[i] * array2[j];
      }

      hasil[i] = temp;
    }

    for (int i = 0; i < hasil.length; i++) {
      System.out.print(hasil[i] + " ");
    }

    System.out.println();
  }
}