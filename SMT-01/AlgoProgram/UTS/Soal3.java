import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        // Atas

        for(int i = 1; i<=n-1; i++){

            for(int j = 1; j<=i; j++){

                if(j == i){System.out.print(i);}
                else{System.out.print(" ");}

            }

            for(int j = ((n-i)*2)-1; j>=1; j--){

                System.out.print(" ");
            }

            System.out.println(n*2-i);
        }

        // Bawah

        for(int i = 1; i<n*2; i++){

            if(i == n){System.out.print(n);}
            else{System.out.print(" ");}
        }
    }   
}