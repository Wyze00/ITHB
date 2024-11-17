import java.util.Scanner;

public class Aritmatika {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        /**
         *  Program untuk menghitung volume kotak
         * 
         *  Var (p,l,t,V) {panjang, lebar, tinggi, Volume}
         */

         float p,l,t,V;

         System.out.println("Program untuk menghitung volume kotak");

         System.out.print("Masukkan panjang: ");
         p = scan.nextFloat();

         System.out.print("Masukkan lebar : ");
         l = scan.nextFloat();

         System.out.print("Masukkan tinggi: ");
         t = scan.nextFloat();

         V = p * l * t;

         System.out.println("Volumenya adalah : " + V + " cm^3");
         System.out.println("\n");

        /**
         *  Program untuk menghitung volume tabung
         * 
         *  Var (r,t,V) {jari - jari, tinggi, Volume}
         */

         float r;

         System.out.println("Program untuk menghitung Volume tabung");

         System.out.print("Masukkan jari - jari : ");
         r = scan.nextFloat();

         System.out.print("Masukkan tinggi: ");
         t = scan.nextFloat();

         V = (float) 3.14 * r * r * t;

         System.out.println("Volumenya adalah : " + V + " cm^3");
         System.out.println("\n");

         /**
         *  Program untuk menghitung Diskriminan fungsi kuadrat
         * 
         *  Var (a,b,c,D) {ax, bc, c, Diskriminan}
         */

         int a,b,c,D;

         System.out.println("Program untuk menghitung diskriminan fungsi kuadrat");

         System.out.print("Masukkan a : ");
         a = scan.nextInt();

         System.out.print("Masukkan b : ");
         b = scan.nextInt();

         System.out.print("Masukkan c : ");
         c = scan.nextInt();

         D = b * b - 4 * a * c;

         System.out.println("Nilai diskriminannya : " + D);
         System.out.println("\n");
    }
}