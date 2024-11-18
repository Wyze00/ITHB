import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
  
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Masukkan [operand1] [operand2] [operator]");
    
        kalkulator1(scan.nextDouble(), scan.nextDouble(), scan.next(),scan);
  
    }
  
    static void kalkulator1(double operand1, double operand2, String operator, Scanner scan) {
  
        double hasil = result(operand1, operand2, operator);
    
        while (hasil != -999) {
    
            System.out.printf("%.0f\n",hasil);
      
            System.out.println("Masukkan [operand1] [operand2] [operator]");
      
            hasil = result(scan.nextDouble(), scan.nextDouble(), scan.next());
        }
    
        System.out.println("Operator Salah");
    }
  
    static double result(double operand1, double operand2, String operator) {
  
        System.out.printf("%.0f %s %.0f = ", operand1, operator, operand2);
    
        if (operator.equals("+")) {
            return operand1 + operand2;
        } else if (operator.equals("-")) {
            return operand1 - operand2;
        } else if (operator.equals("*")) {
            return operand1 * operand2;
        } else if (operator.equals("/")) {
            return operand1 / operand2;
        } else if (operator.equals("%")) {
            return operand1 % operand2;
        } else if (operator.equals("^")) {
            return Math.pow(operand1, operand2);
        } else {
            return -999;
        }
    }

}