import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nilai ke 1 : ");
            int satu = scan.nextInt();
        System.out.println();
    
        System.out.print("Masukkan nilai ke 2 : ");
            int dua = scan.nextInt();
        System.out.println();    
            
        System.out.print("Masukkan nilai ke 3 : ");
            int tiga = scan.nextInt();
        System.out.println();

        int hasil = 0;

        if(satu % 2 == 0){hasil++;}
        else{hasil--;}

        
        if(dua % 2 == 0){hasil++;}
        else{hasil--;}

        
        if(tiga % 2 == 0){hasil++;}
        else{hasil--;}

        System.out.println("Yang paling banyak adalah bilangaan " + (hasil > 0 ? "Genap" : "Ganjil"));
    }   
}

