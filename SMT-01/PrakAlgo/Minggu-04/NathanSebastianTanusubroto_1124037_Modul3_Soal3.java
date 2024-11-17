import java.util.Scanner;

public class NathanSebastianTanusubroto_1124037_Modul3_Soal3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int angka = scan.nextInt();
        System.out.println();

        // Half Pyramid

        System.out.println("Half Pyramid");

        for(int i = 1; i<=angka; i++){

            for(int j = 1; j<i+1; j++){

                System.out.print(j);
            }

            System.out.println();
        }

        System.out.println();

        // Inverted Pyramid

        System.out.println("Inverted Pyramid");

        for(int i = angka; i>0; i--){

            for(int j = 1; j<i+1; j++){

                System.out.print(j);
            }

            System.out.println();
        }

        System.out.println();

        // Hollow Half Pyrammid

        System.out.println("Hollow Half Pyramid");

        for(int i = 1; i<=angka; i++){

            for(int j = 1; j<i+1; j++){

                if(i == 1 || i == 2 || i == angka){

                    System.out.print(j);
                    
                } else {

                    if(j == 1 || j == i){

                        System.out.print(j);

                    } else {

                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }

        System.out.println();

        // Full Pyramid

        System.out.println("Full Pyramid");

        for(int i = 1; i<=angka; i++){

            for(int j = angka-1; j>=i; j--){

                System.out.print(" ");
            }

            int temp = i;

            for(int j = 1; j<i*2; j++){

                if(j >= i){

                    System.out.print(temp--);

                } else {

                    System.out.print(temp++);
                }
            }

            System.out.println();
        }

        System.out.println();

        // Hollow Full Pyramid

        System.out.println("Hollow Full Pyramid");

        for(int i = 1; i<=angka; i++){

            for(int j = angka-1; j>=i; j--){

                System.out.print(" ");
            }

            for(int j = 1; j<i*2; j++){

                if(i == 1 || i == angka){

                    System.out.print(j);

                } else {

                    if(j == 1){

                        System.out.print(j);

                    } else if(j == i*2-1){

                        System.out.print(i);

                    } else {

                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }

        System.out.println();

        // Hollow Inverted Half Pyramid

        System.out.println("Hollow Inverted Half Pyramid");

        for(int i = angka; i>0; i--){

            for(int j = 1; j<i+1; j++){

                if(i == 1){

                    System.out.print(angka);
                    
                } else if(i == 2){
                    
                    System.out.print(angka-j);

                    
                } else if(i == angka){
                    
                    System.out.print(j);

                } else {

                    if(j == 1){

                        System.out.print(angka-i+1);

                    } else if (j == i) {
                        
                        System.out.print(angka);

                    } else {

                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }

        System.out.println();
    }
}