import java.util.Scanner;

public class Soal2z {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Masukkan 15 angka 1-50");
    int[] angka = new int[15];

    for (int i = 0; i < angka.length; i++) {
      angka[i] = scan.nextInt();
    }

    System.out.println("Angka terbanyak : " + terbanyak(angka));
  }

  static int terbanyak(int[] angka) {

    int[] modus = { 0, 0 };

    for (int i = 0; i < angka.length; i++) {

      int num = angka[i];
      int counter = 1;

      for (int j = 0; j < angka.length; j++) {
        if (j == i) {
          continue;
        }
        if (angka[i] == angka[j]) {
          counter++;
        }
      }

      if (counter > modus[1]) {
        modus[0] = num;
        modus[1] = counter;
      }
    }

    return modus[0];
  }
}