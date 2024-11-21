import java.util.Scanner;

public class Soal7 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double angka1,angka2;
        String operator;

        // Input

        System.out.println("Masukkan angka satu : ");
            angka1 = scan.nextDouble();
        System.out.println();

        System.out.println("Masukkan operator : ");
        System.out.println("tambah (+)");
        System.out.println("kurang (-)");
        System.out.println("kali (*)");
        System.out.println("bagi (/)");
            operator = scan.next();
        
        System.out.println("Masukkan angka dua : ");
            angka2 = scan.nextDouble();
        System.out.println();

        // Output

        if(operator.equals("tambah")){System.out.println("Hasil = " + (angka1+angka2));}
        else if(operator.equals("kurang")){System.out.println("Hasil = " + (angka1-angka2));}
        else if(operator.equals("kali")){System.out.println("Hasil = " + (angka1*angka2));}
        else if(operator.equals("bagi")){System.out.println("Hasil = " + (angka1/angka2));}
        else {throw new Error("Operator salah");}
    }
}
