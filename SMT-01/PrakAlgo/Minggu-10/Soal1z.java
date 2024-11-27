import java.util.Scanner;

public class Soal1z {

  static Scanner scan = new Scanner(System.in);
  static int[] angka = new int[10];

  public static void main(String[] args) {

    System.out.println("Masukkan 10 angka");

    for (int i = 0; i < angka.length; i++) {
      angka[i] = scan.nextInt();
    }

    sort();

    System.out.println();

    for (int i = 0; i < angka.length; i++) {
      System.out.println(angka[i]);
    }

    System.out.println("Rata - rata : " + rata(angka));
    System.out.println("Angka terbesar : " + terbesar(angka));
    System.out.println("Angka terkecil : " + terkecil(angka));
    System.out.println("Median : " + median(angka));
    System.out.print("Modus : ");
    modus(angka);
  }

  static double rata(int[] angka) {
    int hasil = 0;
    for (int i = 0; i < angka.length; i++) {
      hasil += angka[i];
    }
    return (double) hasil / angka.length;
  }

  static double median(int[] angka) {
    return (double) (angka[4] + angka[5]) / 2;
  }

  static int terbesar(int[] angka) {
    int terbesar = 0;

    for (int i = 0; i < angka.length; i++) {
      if (angka[i] > terbesar) {
        terbesar = angka[i];
      }
    }
    return terbesar;
  }

  static int terkecil(int[] angka) {
    int terkecil = 999999999;
    for (int i = 0; i < angka.length; i++) {
      if (angka[i] < terkecil) {
        terkecil = angka[i];
      }
    }
    return terkecil;
  }

  static void modus(int[] angka) {

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

    System.out.print(modus[0] + " ");
    System.out.print(modus[1] + "x\n");
  }

  static void sort() {
    for (int i = 0; i < angka.length - 1; i++) {

      int terkecil = i;
      for (int j = i + 1; j < angka.length; j++) {
        if (angka[i] > angka[j]) {
          terkecil = j;
        }
      }
      int temp = angka[i];
      angka[i] = angka[terkecil];
      angka[terkecil] = temp;
    }
  }
}