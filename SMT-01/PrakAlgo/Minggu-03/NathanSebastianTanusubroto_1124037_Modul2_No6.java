import java.util.Scanner;

public class NathanSebastianTanusubroto_1124037_Modul2_No6 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // Input

        System.out.print("Oh tidak air sedang dipanaskan, masukkan suhu air : ");
            double suhu = scan.nextDouble();
        System.out.println();

        // Output

        if(suhu >= 100){System.out.println("Air mendidih");} 
        else if(suhu >= 50){System.out.println("Air hangat");}
        else if(suhu >= 10){System.out.println("Air normal");}
        else {System.out.println("Air beku");}
    }
}
