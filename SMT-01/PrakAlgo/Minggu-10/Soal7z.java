import java.util.Scanner;

public class Soal7z {

  static Scanner scan = new Scanner(System.in);
  static int[] nilai;

  public static void main(String[] args) {

    System.out.println("Masukkan panjang array : ");
    nilai = new int[scan.nextInt()];

    for (int i = 0; i < nilai.length; i++) {
      nilai[i] = scan.nextInt();
    }

    sort();

    System.out.println("Selisih maksimum : " + nilai[nilai.length - 1] + " dan " + nilai[0]);
    System.out.println("Selisih terkecil : " + nilai[1] + " dan " + nilai[0]);

  }

  static void sort() {
    for (int i = 0; i < nilai.length - 1; i++) {

      int terkecil = i;
      for (int j = i + 1; j < nilai.length; j++) {
        if (nilai[i] > nilai[j]) {
          terkecil = j;
        }
      }
      int temp = nilai[i];
      nilai[i] = nilai[terkecil];
      nilai[terkecil] = temp;
    }
  }
}