import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Batas Fibonacchi : ");
        int input = scan.nextInt();

        if(input >= 0){System.out.print("0 ");}
        if(input >= 1){System.out.print("1 1 ");}

        int angka1 = 1;
        int angka2 = 1;
        int temp = 0;

        while(temp < input){

            temp = angka1 + angka2;

            if(temp > input){break;}

            System.out.printf("%d ",temp);

            angka1 = angka2;
            angka2 = temp;
        }
    }
}
