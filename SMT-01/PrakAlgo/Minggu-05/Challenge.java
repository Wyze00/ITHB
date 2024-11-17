import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif : ");
            String angka = Integer.toString(scan.nextInt());

        if(!(Integer.parseInt(angka) < 0)){
            
            int counter = 0;
            String ganjil = "";
            
            for(int i = 0; i<angka.length(); i++){
                
                if(angka.charAt(i) % 2 != 0 ){
                    
                    ganjil += angka.charAt(i) + " ";
                    counter++; 
                }
            }
            
            if(counter == 0){
                
                System.out.println("Tidak ada digit ganjil dalam bilangan");
                
            } else {
                
                System.out.print("Digit ganjil dalam bilangan: " + ganjil);
                System.out.printf("\n Jumblah digit ganjil dalam bilangan adalah %d",counter);
            }

        } else {

            System.out.println("Angka negatif");
        } 

    }
}
