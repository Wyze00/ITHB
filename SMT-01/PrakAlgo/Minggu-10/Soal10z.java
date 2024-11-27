import java.util.Scanner;

public class Soal10z {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Masukkan panjang array : ");
    int[] nilai = new int[scan.nextInt()];

    System.out.println("Masukkan nilai array : ");
    for (int i = 0; i < nilai.length; i++) {
      nilai[i] = scan.nextInt();
    }

    System.out.println("Masukkan batas bawah : ");
    int bawah = scan.nextInt();
    System.out.println("Masukkan batas atas : ");
    int atas = scan.nextInt();

    int hasil = 0;
    for (int i = 0; i < nilai.length; i++) {
      if (nilai[i] > bawah && nilai[i] < atas) {
        hasil += nilai[i];
      }
    }

    System.out.println("Hasil : " + hasil);
  }
}