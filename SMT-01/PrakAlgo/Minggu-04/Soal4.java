import java.util.Scanner;
import javax.swing.JOptionPane;

public class Soal4 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println();

        int randoms = (int) Math.ceil(Math.random()*100);

        System.out.println(randoms);

        for(int i = 1; i<=5; i++){

            System.out.print("Tebakan ke " + i + " : ");
                int selisih = randoms - scan.nextInt();

            if(selisih == 0){
                JOptionPane.showMessageDialog(null,"Congrats");
                System.out.println("Congrats!!");
                break;
            } 
            
            if(selisih > 80){
                JOptionPane.showMessageDialog(null,"Vastly More");
                System.out.println("Vastly More");
                
            } else if(selisih > 40){
                JOptionPane.showMessageDialog(null,"More");
                System.out.println("More");

            } else if(selisih > 25){
                JOptionPane.showMessageDialog(null,"Far More");
                System.out.println("Far More");
                
            } else if(selisih > 0){
                JOptionPane.showMessageDialog(null,"Sightly More");
                   System.out.println("Sightly More");

            } else if(selisih < -80){
                JOptionPane.showMessageDialog(null,"Vastly Less");
                System.out.println("Vastly Less");
     
            } else if(selisih < -40){ 
                JOptionPane.showMessageDialog(null,"Far Less");
                System.out.println("Far Less");
            
            } else if(selisih < -25){
                JOptionPane.showMessageDialog(null,"Less");
                System.out.println("Less");
                
            } else {
                JOptionPane.showMessageDialog(null,"Sightly Less");
                System.out.println("Sightly Less");

            }

            if(i == 5){
                JOptionPane.showMessageDialog(null,"Game Over !");
                System.out.println("Game Over !");
            }
        }
    }
}
