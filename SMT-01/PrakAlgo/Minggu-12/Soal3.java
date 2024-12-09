import java.util.Arrays;
import java.util.Scanner;
import javax.management.relation.RoleStatus;

public class Soal3 {

  static Scanner scan = new Scanner(System.in);
  
  public static void main(String[] args) {

    System.out.print("Masukkan string : ");
    String str = scan.next();
    System.out.print("Masukkan separator : ");
    String separator = scan.next();
    System.out.println();
    
    int ctr = 0;

    for(int i = 0; i<str.length(); i++){
      if(str.charAt(i) == separator.charAt(0)){
        ctr++;
      }
    }
    ctr++;

    String[] res = new String[ctr];

    int index = 0;
    for(int i = 0; i<res.length; i++){

      String temp = "";

      while(index != str.length() && str.charAt(index) != separator.charAt(0)){
        temp = temp + String.valueOf(str.charAt(index));
        index++;
      }
      index++;

      res[i] = temp;
    }
    
    System.out.println(Arrays.toString(res));
  }
}