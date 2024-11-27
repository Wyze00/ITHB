import java.util.Scanner;

public class Soal4z {

  static Scanner scan = new Scanner(System.in);
  static String[] nama;

  public static void main(String[] args) {

    System.out.println("Input jumblah nama : ");
    nama = new String[scan.nextInt()];

    for (int i = 0; i < nama.length; i++) {
      nama[i] = scan.next();
    }

    System.out.println("Masukkan jumblah loncatan : ");
    int loncatan = scan.nextInt() - 1;

    int curIndex = 0;
    while (nama.length != 1) {
      curIndex = (curIndex + loncatan) % nama.length;
      remove(curIndex);
    }

    System.out.println(nama[0]);
  }

  static void remove(int index) {
    String[] newNama = new String[nama.length - 1];
    for (int i = 0; i < index; i++) {
      newNama[i] = nama[i];
    }
    for (int i = index + 1; i < nama.length; i++) {
      newNama[i - 1] = nama[i];
    }
    nama = newNama;
  }
}