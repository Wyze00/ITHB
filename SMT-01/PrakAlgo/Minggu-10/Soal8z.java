import java.util.Scanner;

public class Soal8z {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Cari angka");

    int[] angka = { 1, 2, 2, 2, 2, 2, 3, 3, 4, 6, 6, 6, 8, 8, 9, 12, 12, 12 };
    int cari = scan.nextInt();

    int ctr = 0;
    for (int i = 0; i < angka.length; i++) {
      if (angka[i] == cari) {
        ctr++;
      }
    }

    System.out.printf("%d ada %d kali\n", cari, ctr);
  }
}