import java.util.Scanner;

public class NathanSebastianTanusubroto_1124037_Modul4_Soal1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int temp;
        double avg = 0;
        int max = 0;
        int counter = 0;

        do { 

            System.out.print("Input angka : ");
                temp = scan.nextInt();

            if(temp > max){
                max = temp;
            }

            avg += temp;
            counter++;

            System.out.print("Masih mau input ? ");
            
        } while (scan.next().equalsIgnoreCase("Y"));

        System.out.println("========================");
        System.out.println("Output : ");
        System.out.printf("Nilai max : %d \n",max);
        System.out.printf("Nilai rata2 : %.15f",(avg/counter));
    }
}