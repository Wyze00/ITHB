import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        // Input

        System.out.print("Masukkan angka : ");
            int angka = scan.nextInt();
            int counter = 0;

        // Output

        int hasil = 0;

        while(angka != 0){

            int temp = angka%10;

            switch (temp) {
                case 1:
                    hasil += 2;
                    break;
                case 2:
                    hasil += 5;
                    break;
                case 3:
                    hasil += 5;
                    break;
                case 4:
                    hasil += 4;
                    break;
                case 5:
                    hasil += 5;
                    break;
                case 6:
                    hasil += 6;
                    break;
                case 7:
                    hasil += 3;
                    break;
                case 8:
                    hasil += 7;
                    break;
                case 9:
                    hasil += 6;
                    break;
                default:
                    hasil+= 6;
            }

            angka /= 10;
            counter++;
        }

        if(counter != 3){throw new Error("Input Salah");}
        
        System.out.println("Hasilnya adalah : " + hasil);
    }
}