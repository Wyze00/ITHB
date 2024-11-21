import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // Input
        
        System.out.print("Masukkan jumblah pemilih : ");
            int jml_mhs = scan.nextInt();
        System.out.println();

        int paslon1 = 0;
        int paslon2 = 0;
        int paslon3 = 0;

        for(int i = 1; i<=jml_mhs; i++){

            System.out.print("Masukkan Jenis pemilih ke " + i + " : ");
                int pemilih = scan.next().equalsIgnoreCase("Mahasiswa") ? 1 : 5;
            System.out.println();

            System.out.print("Masukkan paslon pillihan pemilih ke " + i + " : ");
                int paslon = scan.nextInt();

            switch(paslon){
                case 1: 
                paslon1 += pemilih; 
                break;
                case 2: 
                paslon2 += pemilih;
                break;
                case 3: 
                paslon3 += pemilih;
                break;
            }
        }

        // Output
        // Kalo scorenya sama, yang duluan yang menang

        if(paslon1 >= paslon2 && paslon1 >= paslon3){
            System.out.println("Paslon pemenang adalah paslon 1 dengan total score " + paslon1);

        } else if(paslon2 >= paslon1 && paslon2 >= paslon3) {

            System.out.println("Paslon pemenang adalah paslon 2 dengan total score " + paslon2);
        } else {

            System.out.println("Paslon pemenang adalah paslon 3 dengan total score " + paslon3);
        }
    }
}
