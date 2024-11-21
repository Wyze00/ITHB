import java.util.Scanner;

public class Soal8 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // Input

        System.out.print("Input planet pertama : ");
            String planet1 = scan.nextLine();
        
        System.out.print("Input planet kedua : ");
            String planet2 = scan.nextLine();
        System.out.println();

        int angkaPlanet1 = planet1.equals("Mercury") ? 1 : planet1.equals("Venus") ? 2 : planet1.equals("Earth") ? 3 : 4;
        int angkaPlanet2 = planet2.equals("Mercury") ? 1 : planet2.equals("Venus") ? 2 : planet2.equals("Earth") ? 3 : 4;

        if(angkaPlanet1 > angkaPlanet2){
            int temp = angkaPlanet1;
            angkaPlanet1 = angkaPlanet2;
            angkaPlanet2 = temp;
        }

        // Output 

        int km = 0;

        for(int i = angkaPlanet1; i<angkaPlanet2; i++){
            if(i == 1){km += 108;}
            if(i == 2){km += 162;}
            if(i == 3){km += 225;}
        }

        System.out.println("Sumarry");
        System.out.println("Totalnya adalah : " + km + "km");
    }
}
