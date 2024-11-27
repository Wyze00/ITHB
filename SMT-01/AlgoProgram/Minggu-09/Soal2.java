import java.util.Scanner;

public class Soal2{

    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {

        System.out.println("Masukkan 5 quiz");

        double quiz = hitungQuiz(scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),scan.nextDouble(),scan.nextDouble());

        System.out.println("Masukkan uts + uas");

        double NA = hitungNA(quiz, scan.nextDouble(), scan.nextDouble());

        System.out.println("Huruf mutu : " + hurufMutu(NA));
        
    }

    static double hitungQuiz(double q1,double q2,double q3,double q4,double q5){

        double terendah = 101;

        if(q1 < terendah){
            terendah = q1;
        }

        if(q2 < terendah){
            terendah = q2;
        }

        if(q3 < terendah){
            terendah = q3;
        }

        if(q4 < terendah){
            terendah = q4;
        }

        if(q5 < terendah){
            terendah = q5;
        }

        return (q1+q2+q3+q4+q5-terendah)/4;
    }

    static double hitungNA(double rata, double uts, double uas){

        double quiz = (rata * 3) - uts -uas;

        return (quiz * 0.2) + (uts * 0.3) + (uas * 0.5);
    }

    static String hurufMutu(double NA){

        if(NA >= 80){
            return "A";
        }

        return "A";
    }
}
