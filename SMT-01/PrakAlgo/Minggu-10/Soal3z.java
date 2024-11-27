import java.util.Scanner;

public class Soal3z {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Input jumblah nama : ");
    String[] nama = new String[scan.nextInt()];

    System.out.println("Masukkan nama");

    for (int i = 0; i < nama.length; i++) {
      nama[i] = scan.next();
    }

    System.out.println("Mau mengganti nama ? (true/false)");

    while (scan.nextBoolean()) {

      System.out.println("Masukkan nama yang ingin diganti : ");
      String namalama = scan.next();

      System.out.println("Masukkan nama baru : ");
      String namabaru = scan.next();

      for (int i = 0; i < nama.length; i++) {
        if (nama[i].equals(namalama)) {
          nama[i] = namabaru;
        }
      }
      System.out.println("Mau mengganti nama ? (true/false)");
    }
  }
}