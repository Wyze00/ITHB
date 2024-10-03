import  java.util.Scanner;

public class Soal2 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int temp;

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

        // Sorting ascending;

        System.out.println();
        System.out.println(a); 
        System.out.println(b);
        System.out.println(c);

    }
}