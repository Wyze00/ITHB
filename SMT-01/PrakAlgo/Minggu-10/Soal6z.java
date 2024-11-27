import java.util.Scanner;

public class Soal6z {

  static Scanner scan = new Scanner(System.in);
  static String[] str1;
  static String[] str2;

  public static void main(String[] args) {

    System.out.println("Masukkan string 1 : ");
    str1 = scan.next().split("");
    System.out.println("Masukkan string 2 : ");
    str2 = scan.next().split("");

    check();
  }

  static void check() {

    boolean ada = false;

    for (int i = 0; i < str1.length; i++) {

      if (str1[i].equals(str2[0])) {

        int tempCounter = 0;

        for (int j = i, k = 0; j < i + str2.length; j++, k++) {
          if (str1[j].equals(str2[k])) {
            tempCounter++;
          } else {
            break;
          }
        }

        if (tempCounter == str2.length) {
          ada = true;
          System.out.println("Ada");
        }
      }
    }

    if (!ada) {
      System.out.println("Tidak ada");
    }
  }
}