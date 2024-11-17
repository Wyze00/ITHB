import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        float d,rpm;

        float PI = (float) Math.PI;

        d = scan.nextFloat();
        rpm = scan.nextFloat();

        float keliling = d * PI;
        float iph = keliling * rpm * 60;
        float mph = iph / 63360;

        System.out.println(mph);
    }
}
