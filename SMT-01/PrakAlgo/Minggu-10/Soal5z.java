import java.util.Scanner;

public class Soal5z {

  static Scanner scan = new Scanner(System.in);
  static String[] str1;
  static String[] str2;

  public static void main(String[] args) {

    System.out.println("Masukkan string 1 : ");
    str1 = scan.next().split("");
    System.out.println("Masukkan string 2 : ");
    str2 = scan.next().split("");

    for (int i = 0; i < str2.length; i++) {
      remove(str2[i]);
    }
  }

  static void remove(String str) {

    System.out.println(String.join("", str1));

    for (int i = 0; i < str1.length; i++) {

      if (str1[i].equals(str)) {

        for (int j = i + 1; j < str1.length; j++) {
          str1[j - 1] = str1[j];
        }

        str1[str1.length - 1] = "_";

        System.out.println(String.join("", str1));
      }
    }

  }
}