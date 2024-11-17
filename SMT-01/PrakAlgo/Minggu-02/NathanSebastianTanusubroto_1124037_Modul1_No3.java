
import java.util.Scanner;
import javax.swing.JOptionPane;

public class NathanSebastianTanusubroto_1124037_Modul1_No3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /**
         * Tugas 03 {Program untuk menghitung penghasilan}
         * 
         * Var pajak, total {double}
         *     gaji, bonus, denda, penghasilan {int}
         */

         int gaji, bonus, denda, penghasilan;
         double pajak, total;

         System.out.println("Program untuk menghitung pengasilan");
         System.out.println();

         System.out.print("Persentae Pajak : ");
            pajak = scan.nextDouble();

         System.out.print("Gaji : ");
            gaji = scan.nextInt();

        System.out.print("Bonus : ");
            bonus = scan.nextInt();

        System.out.print("Denda : ");
            denda = scan.nextInt();
        
        penghasilan = gaji + bonus - denda;
        total = penghasilan - (penghasilan * pajak / 100);

        System.out.println();
        JOptionPane.showMessageDialog(null, "Total penghasilan anda adalah : " + total, "Penghasilan", JOptionPane.INFORMATION_MESSAGE); 

    }
}
