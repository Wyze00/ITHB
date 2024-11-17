import  java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x,y,z,temp;

        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();

        temp = x;
        x = y;
        y = z;
        z = temp;

        System.out.println("X : " + x);
        System.out.println("Y : " + y);
        System.out.println("Z : " + z);

    }
}
