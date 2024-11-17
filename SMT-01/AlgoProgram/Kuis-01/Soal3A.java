import java.util.Scanner;

public class Soal3A {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int wadah = (int) Math.ceil(Math.random()*4);
        int angka = (int) Math.ceil(Math.random()*10);

        boolean tebakanSalah = true;
        int counter = 1;

        do {

            System.out.println("Tebakan ke : " + counter);
            
            System.out.print("Wadah : ");
                int tebakWadah = scan.nextInt();
            System.out.print("Angka : ");
                int tebakAngka = scan.nextInt();

            if(wadah != tebakWadah){
                System.out.println("Wadah Salah");
            } else {

                if(angka != tebakAngka){
                    System.out.println("Angka salah");
                } else {
                    System.out.printf("Selamat, tebakan ke-%d posisi %d-%d",counter,wadah,angka);
                    tebakanSalah = false;
                }
            }

            counter++;

        } while(tebakanSalah);
    }
}