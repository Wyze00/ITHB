import java.util.Scanner;

public class Soal3 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Input 

        int a,b,c;

        System.out.print("Masukkan nilai a : ");
            a = scan.nextInt();
        System.out.println();

        System.out.print("Masukkan nilai b : ");
            b = scan.nextInt();
        System.out.println();

        System.out.print("Masukkan nilai c : ");
            c = scan.nextInt();
        System.out.println();

        // Output

        if(!(c >= b && b >= a) || !(a + b > c)){throw  new Error("Input salah");}

        if(a == b && b == c){System.out.println("Segitiga sama sisi");}
        else if(Math.sqrt(a*a + b*b) == Math.sqrt(c*c)){System.out.println("Segitiga siku-siku");}
        else if(Math.sqrt(a*a + b*b) > Math.sqrt(c*c)){System.out.println("Segitiga lancip");}
        else {System.out.println("Segitiga tumpul");}
    }
}
