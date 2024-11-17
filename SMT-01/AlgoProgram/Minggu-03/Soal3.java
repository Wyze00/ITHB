import  java.util.Scanner;

public class Soal3 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int temp;

        // Sorting

        if( a>b && a>c ){

            if( b>c ){

                temp = a;
                a = c;
                c = temp;

            } else {
                
                temp = a;
                a = b;
                b = c;
                c = temp;
             }
        }
        
        if( b>a && b>c ){
        
            if( a>c ){

                temp = b;
                b = a;
                a = c;
                c = temp;

            } else {

                temp = b;
                b = c;
                c = temp;
             }
        }
        
        if( c>a && c>b ){
        
            if( a>b ){
                temp = a;
                a = b;
                b = temp;
            }
        }

        // Validasi segitiga

        if(c > b && b > a && a+b > c){
            System.out.println("Ini adalah segitiga");
        }else{
            System.out.println("Ini bukan segitiga");
        }

    }
}
